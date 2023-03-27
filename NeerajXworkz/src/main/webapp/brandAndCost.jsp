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
            body{

                background-image: url(https://www.shutterstock.com/image-vector/alcohol-drinks-banner-design-champagne-600w-478749991.jpg);

                background-size: auto;
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
                height: 100%;

            }
        </style>
</head>
<body>
	<h1>Search by brand and cost</h1>


		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	 <a href="index.jsp">home</a>
	<h3>Result</h3>
	<h3>
		<span style="color: red;">${message}</span>
		<span style="color:red;">${msg1}</span>
		<span style="color:red;">${msg2}</span>
		<span style="color:red;">${msg3}</span>
		
	</h3>
	<form action="findByBrandAndCost" method="get">
	<input type="text" name="brand" placeholder="enter brand" value="">
	<input type="number" name="cost" placeholder="enter cost" value="0">
	<input type="submit" name="submit">
	</form>
	<div>
	<br>
	<table>
	<tr>
		<th class="bg-primary">ID</th>
<th class="bg-success">Brand</th>
<th class="bg-warning">Name</th>
<th class="bg-danger">Cost</th>
<th class="bg-info">Type</th>
<th class="bg-info">madeIn</th>
<th class="bg-info">Edit</th>
<th class="bg-info">delete</th>
</tr>
		<c:forEach items="${dto}" var="t">
			<tr>
  <td class="bg-primary">${t.id}</td>
  <td class="bg-success">${t.brand}</td>
  <td class="bg-warning">${t.name}</td>
  <td class="bg-danger">${t.cost}</td>
  <td class="bg-info">${t.type}</td>
  <td class="bg-info">${t.madeIn}</td>
  <td><a href="update?id=${t.id}">Edit</a></td>
   <td><a href="delete?id=${t.id}">delete</a></td>
  
</tr>
		</c:forEach>
		<c:forEach items="${dtoBrand}" var="t">
			<tr>
  <td class="bg-primary">${t.id}</td>
  <td class="bg-success">${t.brand}</td>
  <td class="bg-warning">${t.name}</td>
  <td class="bg-danger">${t.cost}</td>
  <td class="bg-info">${t.type}</td>
  <td class="bg-info">${t.madeIn}</td>
  <td><a href="update?id=${t.id}">Edit</a></td>
   <td><a href="delete?id=${t.id}">delete</a></td>
  
</tr>
		</c:forEach>
		<c:forEach items="${dtoCost}" var="t">
			<tr>
  <td class="bg-primary">${t.id}</td>
  <td class="bg-success">${t.brand}</td>
  <td class="bg-warning">${t.name}</td>
  <td class="bg-danger">${t.cost}</td>
  <td class="bg-info">${t.type}</td>
  <td class="bg-info">${t.madeIn}</td>
  <td><a href="update?id=${t.id}">Edit</a></td>
   <td><a href="delete?id=${t.id}">delete</a></td>
  
</tr>
		</c:forEach>

	</table>
	</div>

</body>
</html>