<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserServlet" method="POST">
	<input type="text" name="Name" placeholder=" Name" >
	<input type="text" name="Phone" placeholder="Phone" >
	<input type="email" name="Email" placeholder="Email" >
	<input type="text" name="Password" placeholder="Password" >
	<input type="submit" value="Sign Up" />
	</form>
	
</body>
</html>