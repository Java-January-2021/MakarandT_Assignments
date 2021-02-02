<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survery index</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class=center>
		<h1>Submitted Info</h1>
		<p>
			Name:
			<c:out value="${name}" />
		</p>
		<p>
			location:
			<c:out value="${location}" />
		</p>
		<p>
			language:
			<c:out value="${language}" />
		</p>
		<p>
			comments:
			<c:out value="${comments}" />
		</p>



	</div>

</body>
</html>