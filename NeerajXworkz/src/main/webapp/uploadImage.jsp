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

<style>
body {
	background-image:
		url(https://www.shutterstock.com/image-vector/alcohol-drinks-banner-design-champagne-600w-478749991.jpg);
	background-size: auto;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	height: 100%;
}
</style>
	<a href="index.jsp">home</a>
</head>

<body>


	<h1>welcome to upload image page</h1>

	<div>
		<span style="color: green">${message}</span>
	</div>
	<form action="upload" method="post" enctype="multipart/form-data">
		<div class="mb-3">
			<input type="file" class="form-control" name="chitra" id="formFile"
				placeholder="choose">


		</div>
		<input type="submit" value="Upload" class="btn btn-primary">
	</form>
</body>
</html>