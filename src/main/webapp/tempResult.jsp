<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celcius Converter</title>
</head>
<body>
<p>
${userTemp.getFahrenheit()} degrees Fahrenheit converts to ${userTemp.getCelsius()} degrees Celsius.
</p>
<a href="tempIndex.jsp">Convert again</a>
</body>
</html>