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
	<h1>welcome to foodland</h1>
	<form action="game" method="post">
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
			<label for="exampleFormControlInput1" class="form-label">Dish
				Name</label> <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter dish name"
				name="dishName">
		</div>
		<select class="form-select form-select-sm"
			aria-label=".form-select-sm example" name="dishType">
			<option selected>Select food type</option>
			<option value="1">Veg</option>
			<option value="2">Non Veg</option>
			<option value="3">Both</option>
		</select> <label for="customRange3" class="form-label">Quantity</label> <input
			type="range" class="form-range" min="0" max="5" step="0.5"
			id="customRange3" name="dishQuantity">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">price</label>
			<input type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="enter price" name="dishPrice">
		</div>
		<button type="submit" class="btn btn-dark" value="send">send</button>
	</form>
</body>

</html>
