<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"rel="stylesheet"integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
</head>
<body>
<h1>Welcome to search Page </h1>

<nav class="navbar navbar-dark bg-dark">
			<!-- Navbar content -->
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					alt="" width="90" height="60" class="d-inline-block align-text-top">

				<a href="big">click here to order</a>
					<a href="index.jsp">home</a>
			</div>
			
		</nav>
		<h3>Search</h3>
	<h3><span style="color:red;">${message}</span></h3>
	<form action="search" method="get">
	SearchById<input type="text" name="id"/>
	<input type="submit" value="search">
	</form>
	<div>
	<h4>searched result</h4>
	<h4>Name : ${dto.name}</h4>
	<h4>phoneNumber : ${dto.phoneNumber}</h4>
	<h4>Password : ${dto.password}</h4>
	<h4>emailAddress : ${dto.emailAddress}</h4>
	<h4>wifeName : ${dto.wifeName}</h4>
	<h4>food : ${dto.food}</h4>
	<h4>area : ${dto.area}</h4>
	<h4>price : ${dto.price}</h4>
	<h4>ownerName : ${dto.ownerName}</h4>
	<h4>ownerWifeName : ${dto.ownerWifeName}</h4>
	</div>
</body>
</html>