<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<h1>welcome to Casino</h1>
	<h3>Choose your Casino</h3>
	<form action="play" method="post">
		<nav class="navbar navbar-dark bg-dark">
			<!-- Navbar content -->
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					alt="" width="90" height="60" class="d-inline-block align-text-top">

				</a> <a href="index.jsp">home</a>
			</div>
		</nav>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				name</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter name"
				name="name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
				curiseName</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter cruise"
				name="curiseName">
		</div>
	

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">fee</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="entry fee" name="fee">
		</div>
		<div>
		Free Food yes<input type="radio" name="freeFood" value="true"/>
				No<input type="radio" name="freeFood" value="false"/>
		</div>
		<div>
		Free Alcohol yes<input type="radio" name="freeAlcohol" value="true"/>
				No<input type="radio" name="freeAlcohol" value="false"/>
		</div>
		<button type="submit" class="btn btn-dark" value="send">send</button>
	</form>
</body>

</html>
