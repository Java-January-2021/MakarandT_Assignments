<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome User!</h1>

<a href="http://localhost:8080/counter">Counter page</a>
<a href="http://localhost:8080/twice">Counter increase by 2</a>

<button onclick="location.href='http://localhost:8080/reset'" type="button">Reset</button>
</body>
</html>