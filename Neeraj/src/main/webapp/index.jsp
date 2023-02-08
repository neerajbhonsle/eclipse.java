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
	<h1>Welcome to My Details</h1>
	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">
	</nav>
	<form action="email">
		<h6>display email:${mail}</h6>
		<input type="submit" value="email" />
	</form>
	<form action="mobile">
		<h6>display mobileNumber:${number}</h6>
		<input type="submit" value="mobile" />
	</form>
	<form action="aadhar">
		<h6>display aadharNumber:${adNum}</h6>
		<input type="submit" value="aadhar" />
	</form>
	<form action="age">
		<h6>display ageIs:${ages}</h6>
		<input type="submit" value="age" />
	</form>
	<form action="DOB">
		<h6>display DateOfBirthWithTime:${birth}</h6>
		<input type="submit" value="birth" />
	</form>
	<form action="salary">
		<h6>display DesiredSalary:${desired}</h6>
		<input type="submit" value="salary" />
	</form>
	<form action="bff">
	<h6>DisplayBestFriends:</h6>
	<input type="submit" value="friends"/>
	<ul>
	<c:forEach items="${bestie}" var="ref">
	<li>${ref}</li>
	</c:forEach>
	</ul>
	</form>
	<form action="visit">
	<h6>DisplayMostVisitedPlaces:</h6>
	<input type="submit" value="peace"/>
	<ul>
	<c:forEach items="${place}" var="ref">
	<li>${ref}</li>
	</c:forEach>
	</ul>
	</form>
	<form action="skill">
	<h6>DisplaySkills:</h6>
	<input type="submit" value="program"/>
	<ul>
	<c:forEach items="${code}" var="ref">
	<li>${ref}</li>
	</c:forEach>
	</ul>
	</form>
	<form action="marks">
	<input type="submit" value="showEducation"/><br>
    <label>name:${cards.name}</label><br>
    <label>schoolName:${cards.schoolName}</label><br>
    <label>sslcMarks:${cards.sslcMarks}</label><br>
    <label>highestScoredSub:${cards.highestScoredSub}</label><br>
    <label>highestScoredMarks:${cards.highestScoredMarks}</label><br>
    <label>diplomaClgName:${cards.diplomaClgName}</label><br>
    <label>totalAvg:${cards.totalAvg}</label><br>
    <label>enggClgName:${cards.enggClgName}</label><br>
    <label>cgpa:${cards.cgpa}</label><br>
    <label>totalNumOfBacklogs:${cards.totalNumOfBacklogs}</label><br>
	</form>
	<form action="phone">
	<input type="submit" value="showPhone"/><br>
	<label>brandName:${sim.brandName}</label><br>
	<label>modelName:${sim.modelName}</label><br>
	<label>price:${sim.price}</label><br>
	<label>withCharger:${sim.withCharger}</label><br>
	<label>mtgIn:${sim.mtgIn}</label><br>
	</form>
	<form action="drinks">
	<input type="submit" value="showBeverages"/><br>
	<label>shopName:${chilled.shopName}</label><br>
	<label>beverageName:${chilled.beverageName}</label><br>
	<label>quantity:${chilled.quantity}</label><br>
	<label>tasty:${chilled.tasty}</label><br>
	<label>price:${chilled.price}</label><br>
	<label>onwer:${chilled.onwer}</label><br>
	<label>brandAmbassador:${chilled.brandAmbassador}</label><br>
	<label>totalProducts:${chilled.totalProducts}</label><br>
	</form>
	<form action="masale">
	<input type="submit" value="showChats"/><br>
	<h6>display: chats DTO:${pani}</h6>
    <label>chatShopName:${pani.chatShopName}</label><br>
    <label>chatName:${pani.chatName}</label><br>
    <label>price:${pani.price}</label><br>
    <label>tasty:${pani.tasty}</label><br>
    <label>quantity:${pani.quantity}</label><br>
    <label>shopLocation:${pani.shopLocation}</label><br>
    <label>shopOwnerName:${pani.shopOwnerName}</label><br>
    <label>noOfItems:${pani.noOfItems}</label><br>
    <label>noOfVarities:${pani.noOfVarities}</label><br>
    <label>flavours:${pani.flavours}</label><br>
    <label>color:${pani.color}</label><br>
	</form>
</body>
</html>