<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Product</title>
<link rel="stylesheet" href="style4.css">
</head>
<body>
<table>
<tr>
<td>Product_id</td>
<td><%= request.getAttribute("product_id") %></td>
</tr>
<tr>
<td>Product name</td>
<td><%= request.getAttribute("product_name") %></td>
</tr>
<tr>
<td>Price</td>
<td><%= request.getAttribute("price") %></td>
</tr>
<tr>
<td>Qty</td>
<td><%= request.getAttribute("qty") %></td>
</tr>


</table>
<a href="index.html"><button>Back to main menu</button></a>
</body>
</html>