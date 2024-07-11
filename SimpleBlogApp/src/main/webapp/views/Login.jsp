<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<link rel="stylesheet"  href="loginStyle.css" >

</head>
<body>
<div class="login-container">
        <form action="login" method="POST">
            <h2>Login</h2>
            <div class="input-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            
            <p style="color: gray;" >Don't Have an Account ?<a href="/SBA/register" >Register</a> </p>
            
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>