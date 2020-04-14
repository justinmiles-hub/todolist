<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoList Application</title>
</head>
<body>
	<form action="addTask" method="post">
		<table>
			<tr>
				<td>Add Task</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><input type="submit" value="create"></td>
			</tr>
		</table>
	</form>
</body>
</html>