<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">

</head>
<body>
<div id=wrapper>
	<a id=indexLink href="/">Go Back</a>
	<h1 id=date> <c:out value="${date}"/> </h1>
</div>
<script type="text/javascript"  src="./js/date.js"></script>
</body>
</html>