<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Calculator</title>
</head>
<body>
 <p>
 ${userSum.getUserInt1()} + ${userSum.getUserInt2()} = ${userSum.getSum()}
 </p>
 <a href="addIndex.jsp">Calculate again</a>
</body>
</html>