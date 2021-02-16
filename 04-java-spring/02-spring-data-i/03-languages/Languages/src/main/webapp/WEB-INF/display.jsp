<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add language</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Display page</title>
</head>
<body>
<div class ="container">
<hr>
<form:form action="languages/{id}" method="POST" modelAttribute="editModel">



<p>><c:out value="${languages.language}" /></p>
<hr>
<p><c:out value="${languages.creator}" /></p>
<hr>
<p><c:out value="${languages.version}" /></p>
<hr>
<a id="pageLink" href="/languages/edit/${languages.id}">Edit </a>
<a id="deleteLink" href="/languages/delete/${languages.id}">Delete</a>

</form:form>
</div>
</body>
</html>