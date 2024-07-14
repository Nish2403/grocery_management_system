<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display customers</title>
<link rel="stylesheet" href="style4.css">
</head>
<body>
<table>
<tr>
<td>Customer id</td>
<td><%= request.getAttribute("cust_id") %></td>
</tr>
<tr>
<td>Customer name</td>
<td><%= request.getAttribute("full_name") %></td>
</tr>
<tr>
<td>Email</td>
<td><%= request.getAttribute("email") %></td>
</tr>
<tr>
<td>Address</td>
<td><%= request.getAttribute("address") %></td>
</tr>
<tr>
<td>Contact Number</td>
<td><%= request.getAttribute("contact_number") %></td>
</tr>

</table>
<a href="admin_index.html"><button>Back to main menu</button></a>
</body>
</html>