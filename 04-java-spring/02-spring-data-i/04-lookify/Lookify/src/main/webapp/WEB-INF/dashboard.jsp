<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="#">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Lookify! Dashboard</title>
</head>
<body>
	<div class=container >
		<div class="col-xs-6">
			<a href="/songs/new">Add New!</a>
			<a href="/search/topten">Top Songs</a>
		</div>
		<hr>
		<div class="col-xs-6">
			<div id="inputForm">
			<form action="/search/{artist}" method="post">
				<input type="text" name="artist"> <input id="button"
					type="submit" value="Search Artist" />
			</form>
		</div>
		</div>
	</div>
	<hr>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>Name</th>
				<th>Artist</th>
				<th>Rating</th>
				<th>Action</th>

			</tr>
		</thead>

		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a id="infoLink" href="/songs/${song.id}"><c:out
								value="${song.title}" /></a></td>
					<td><c:out value="${song.artist}" /></td>
					<td><c:out value="${song.rating}" /></td>
					<td><a id="deleteLink" href="/songs/${song.id}/delete/">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	</div>

</body>
</html>