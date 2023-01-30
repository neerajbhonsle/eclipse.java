<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<pre>
	<h1>Send details of the fav person</h1>
	<form action="beer" method="post">
		FirstName <input type="text" name="fname" />
		 LastName <input type="text" name="lname" /> 
		gender male<input type="radio" id="male" name="gender" value="male"/>
			   female<input type="radio" id="female" name="gender" value="female"/>
		 Reason<textarea rows="5" cols="25" name="reason"></textarea>
		Address<textarea rows="5" cols="25" name="address"></textarea>
		<br/>
		<input type="submit" name="send" />
	</form>
	</pre>
</body>
</html>