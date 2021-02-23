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
</head>
<body>
	<div class="container">
		<nav>
			<h2>
				<a href="/person/new">Add Person</a> | <a href="/license/new">Add License</a>
			</h2>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>License #</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${person}" var="person">
					<tr>
						<td><a id="infoLink" href="/person/${person.id}"> ${ person.firstName } ${ person.lastName }</a></td>
						<td><c:choose>
							<c:when test="${person.license !=null }">
								<h3 class="displayHead">License Number:</h3>
								<p class="displayInfo">0000000 <c:out value="${person.license.id}" /> </p>
								<h3 class="displayHead">Exp. Date:</h3>
								<p class="displayInfo">
									<c:out value="${person.license.expiration_date}" />
								</p>
								<h3 class="displayHead">State:</h3>
								<p class="displayInfo">
									<c:out value="${person.license.state}" />
								</p>
							</c:when>
							<c:otherwise>
							
							</c:otherwise>
						</c:choose></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</body>
</html>