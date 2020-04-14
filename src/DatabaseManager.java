import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
	
	private String dburl="jdbc:mysql://localhost:3306/todolist";
	private String dbusername="root";
	private String dbpassword="root";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver)
	{
		try {
			Class.forName(dbdriver);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con=DriverManager.getConnection(dburl, dbusername, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result="data entered successfully";
		String sql="insert into todolist.member values (?,?)";
		try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,member.getUsername());
		ps.setString(2,member.getPassword());
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result="Data not entered";
		}
		
		return result;
	}
}
