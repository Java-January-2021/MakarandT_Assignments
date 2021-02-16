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
</head>
<body>

	<div class="container">
		<h3>Add A Language</h3>
		<hr>
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<hr>
		<form:form method="POST" action="add" modelAttribute="languagemodel">
			<p>
				<form:label path="language">Language</form:label>
				<form:errors path="language" />
				<form:input path="language" />
			</p>
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator" />
				<form:input path="creator" />
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version" />
				<form:input path="version" />
			</p>
			<button>Submit</button>
		</form:form>

		<hr>
		<h3>Old way</h3>
		<form action="/oldadd" method="POST">
			<div class="form-group">
				<label for="name">Name</label> <input type="text" name="name">
			</div>

			<div class="form-group">
				<label for="creator">Creator</label> <input type="text"
					name="creator">
			</div>

			<div class="form-group">
				<label for="version">Version</label> <input type="text"
					name="version">
			</div>

			<button>Submit</button>

		</form>


	</div>

</body>
</html>