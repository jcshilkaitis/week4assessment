<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celcius Converter</title>
</head>
<body>
	<h1>Fahrenheit to Celsius Converter</h1>
	<form action="getFahrenheitServlet" method="post">
		Enter temperature in Fahrenheit <input
			type="text" name="userFahrenheit" size="10"> <input type="submit"
			value="Converte to Celsius" />
	</form>
</body>
</html>