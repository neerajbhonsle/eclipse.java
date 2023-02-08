<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<nav class="navbar navbar-dark bg-dark">
  <!-- Navbar content -->
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
       </a>
    <a   href="index.jsp">Home</a>
    
  </div>
  
  </nav>
  <h2>Saved in Bakery Details</h2>
  <h4>Name : ${name}</h4>
  <h4>OwnerName : ${ownerName}</h4>
  <h4>WifeName : ${wifeName}</h4>
  <h4>Married : ${married}</h4>
  <h4>FamousFor : ${famousFor}</h4>
  <h4>since : ${since}</h4>
</body>
</html>