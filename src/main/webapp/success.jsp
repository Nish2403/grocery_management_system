<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SUCCESS</title>
</head>
<body>
<h1><%= request.getAttribute("id") %></h1>
<a href="login.jsp"><button>Login</button></a>
</body>
</html>