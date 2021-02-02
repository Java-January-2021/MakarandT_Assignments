<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<div class="center">
	<h1>What is the code?</h1>
	<form action="/trycode" method="POST">
		<input type="text" id="lname" name=inputcode><br>
		<br> <input type="submit" value="Submit">
	</form>
	<p><c:out value ="${error}"/></p>

</div>

</body>
</html>