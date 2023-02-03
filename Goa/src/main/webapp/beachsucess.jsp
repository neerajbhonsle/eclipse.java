<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <!-- Navbar content -->
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="90" height="60" class="d-inline-block align-text-top">
      </a>
    <a   href="index.jsp">Home</a>
    <a   href="Beach.jsp">back</a>
  </div>
</nav>
<h2>Thank you for selecting</h2>
<h4>Name: ${Beachname} </h4>
<h4>Location: ${location} </h4>
<h4>Clean: ${clean} </h4>
<h4>Games: ${game} </h4>
</body>
</html>