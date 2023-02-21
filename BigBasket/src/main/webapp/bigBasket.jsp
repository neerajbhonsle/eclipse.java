<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>


	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>
			<a href="search.jsp">search</a>

		</div>

	</nav>

	<h1>welcome to Big Basket data saving</h1>
	<pre>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}</span>
	</c:forEach>
</pre>
	<form action="big" method="post">
		<pre>
		Name<input type="text" name="name"/>
		PhoneNumber<input type="number" name="phoneNumber"/>
		Email<input type="email" name="emailAddress"/>
		Password<input type="password" name="password"/>
		WifeName<input type="text" name="wifeName"/>
		FoodItems<select name="food">
		<option value="">select</option>
		<c:forEach items="${food}" var="f">
		<option value="${f}">${f}</option>
		</c:forEach>
		</select>
		Area<select name="area">
		<option value="">select</option>
		<c:forEach items="${area}" var="a">
		<option value="${a}">${a}</option>
		</c:forEach>
		</select>
		Price<input type="number" name="price"/>
		OnwerName<input type="text" name="ownerName">
		OnwerWifeName<input type="text" name="ownerWifeName"/>
		<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>