<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
<link rel="shortcut icon" href="#">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!DOCTYPE html>
</head>
<body>
	<div class=container>
		<h3>Add Song with JSTL</h3>
		<hr>
		<c:forEach items="${errors }" var="err">
			<p>${err}</p>
		</c:forEach>
		<hr>
		<form:form method="POST" action="/songs/new" modelAttribute="song">
			<p>
				<form:label path="title">Title:
				<form:errors path="title" />
				<form:input path="title" /></form:label>
			</p>
			<p>
				<form:label path="artist">Artist:
				<form:errors path="artist" />
				<form:input path="artist" /></form:label>
			</p>
			<p>
				<form:label path="rating">Rating:
				<form:errors path="rating" />
				<form:input path="rating" /></form:label>
			</p>
			<button>Add Song</button>

		</form:form>




		<hr>
		<h3>Add Song with normal form</h3>
		<form action="/songs/new" method="POST">
			<div class="form-group" <label for "title"> Title </label>>
				<input type="text" name="title">
			</div>

			<div class="form-group" <label for "artist"> Artist </label>>
				<input type="text" name="artist">
			</div>

			<div class="form-group" <label for "rating"> Rating </label>>
				<input type="text" name="rating">
			</div>
			<button>Add Song</button>
		</form>

	</div>


</body>
</html>