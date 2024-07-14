<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="style1.css">
</head>
<body>
<form action="login">
<h3>Login</h3>
<label>username:</label>
<input type="email" name="username" required>
<br>
<label>password:</label>
<input type="password" name="password" maxlength=8 required>
<br>
<input type="submit">
</form>
<div class="register-button">
<a href="registration.jsp"><button>Register</button></a>
</div>
</body>
</html>
