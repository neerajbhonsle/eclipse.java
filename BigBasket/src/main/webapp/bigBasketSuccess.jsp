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
	<h1>Order success</h1>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a> <a href="bigBasket.jsp">order Again</a>

		</div>

	</nav>
	<h2>Saved order Details</h2>
	<h4>Name : ${name}</h4>
	<h4>phoneNumber : ${phoneNumber}</h4>
	<h4>Password : ${password}</h4>
	<h4>emailAddress : ${emailAddress}</h4>
	<h4>wifeName : ${wifeName}</h4>
	<h4>food : ${food}</h4>
	<h4>area : ${area}</h4>
	<h4>price : ${price}</h4>
	<h4>ownerName : ${ownerName}</h4>
	<h4>ownerWifeName : ${ownerWifeName}</h4>
</body>
</html>