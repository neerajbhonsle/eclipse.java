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
				src="data:image/png;base64,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"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>

		</div>

	</nav>

	<h1>welcome to Air Show registration</h1>
	<pre>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}</span>
	</c:forEach>
</pre>
	<form action="fly" method="post">
		<pre>
		Company<input type="text" name="company" required="required"/>
		Name<input type="text" name="name" required="required"/>
		Cost<input type="number" name="cost" required="required"/>
		Type<select name="type" required="required">
		<option value="">select</option>
		<c:forEach items="${type}" var="t">
		<option value="${t}">${t}</option>
		</c:forEach>
		</select>
		Country<select name="country" required>
		<option value="">select</option>
		<c:forEach items="${country}" var="c">
		<option value="${c}">${c}</option>
		</c:forEach>
		</select>
		<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>