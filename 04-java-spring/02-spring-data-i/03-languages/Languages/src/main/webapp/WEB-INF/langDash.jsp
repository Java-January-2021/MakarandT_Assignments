<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<h1>Language Dashboard</h1>
		<table id="booksTable">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${tablemodel}" var="languages">
					<tr>
						<td><a id="infoLink" href="/languages/${languages.id}"><c:out
									value="${languages.language}" /></a></td>
						<td><c:out value="${languages.creator}" /></td>
						<td><c:out value="${languages.version}" /></td>

						<td><a id="pageLink" href="/languages/edit/${languages.id}">Edit </a> <a
							id="deleteLink" href="/languages/delete/${languages.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>

		<h3>Add A Language</h3>
		<hr>
		<c:forEach items="${errors}" var="err">
			<p>${err}</p>
		</c:forEach>
		<hr>
		<form:form method="POST" action="/languages/add" modelAttribute="languagemodel">
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


	</div>
</body>
</html>