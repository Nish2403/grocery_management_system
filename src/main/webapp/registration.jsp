<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style3.css">
    <title>Online Grocery Ordering - Customer Registration</title>
</head>
<body>
    <h1>Register for Online Grocery Ordering</h1>
    <p>Create your account and start ordering groceries online!</p>

    <form id="registrationForm" action="register">
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" required>

        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" maxlength=8 required>
        <h5>Password must be at least 8 characters long and include uppercase, lowercase, and special characters.</h5>

        <label for="address">Delivery Address:</label>
        <textarea id="address" name="address" required></textarea>

        <label for="contactNumber">Contact Number:</label>
        <input type="tel" id="contactNumber" name="contactNumber" maxlength=10 pattern="[0-9]{10}" required>
<br>
<br>
        <input type="submit">
    </form>
</body>
</html>