<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Calculator</title>
</head>
<body>
	<h1>Addition Calculator</h1>
	<form action="getIntegersServlet" method="post">
		Enter your first number <input
			type="text" name="userInt1" size="10">
			<br />
			Enter your second number
			<input
			type="text" name="userInt2" size="10">
			<br />
			<input type="submit"
			value="Add" />
	</form>
</body>
</html>