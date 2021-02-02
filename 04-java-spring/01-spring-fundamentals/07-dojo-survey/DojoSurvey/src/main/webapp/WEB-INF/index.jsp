<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="center">

		<form action="/result" method="POST">
			<label for="name">Your Name:</label> <input type="text"
				id="name" name="name"><br> <label for="location">Choose
				a location:</label> <select id="location" name="location">
				<option value="San Jose">San Jose</option>
				<option value="LA">LA</option>
				<option value="SF">SF</option>
				<option value="Mountain View">Mountain View</option>
			</select><br> <label for="language">Choose a language:</label> <select
				id="language" name="language">
				<option value="Java">Java</option>
				<option value="C">C</option>
				<option value="Python">Python</option>
				<option value="C++">C++</option>
			</select><br> <input type="text" id="comments" name=comments><br>
			<br> <input type="submit" value="Submit">
		</form>


	</div>
</body>
</html>