<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>New License</h2>
		<form:form action="/license/new" method="POST" modelAttribute="license">
			<div class="form-group">
				<form:label path="person">Person</form:label>
				<form:select path="person">
				<form:errors path="person" />
				<c:forEach items="${allPeople}" var="p">
				<c:choose>
				<c:when test="${p.license==null}">
				<form:option value="${p.id }">${p.firstName } ${p.lastName }</form:option>
				</c:when>			
				</c:choose>		
				</c:forEach>		
					
				</form:select>
				
				<form:errors  path="expiration_date"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="state">State</form:label>
				<form:errors path="state" />
				<form:input class="form-control" path="state" />
			</div>
			<div class="form-group">
				<form:label path="expiration_date">Expiration Date</form:label>
				<form:errors path="expiration_date" />
				<form:input type="date" class="form-control" path="expiration_date" />
			</div>
			<button>Add License</button>
		</form:form>
	</div>

</body>
</html>