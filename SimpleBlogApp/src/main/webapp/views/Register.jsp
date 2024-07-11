<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="loginStyle.css">
</head>
<body>
    <div class="register-container">
        <form:form action="registerNewUser" method="POST" modelAttribute="user">
            <h2>Registration</h2>
            <div class="input-group">
                <label for="firstname">First Name:</label>
                <form:input path="firstname" id="firstname" class="form-control" required="true"/>
            </div>
         
            <div class="input-group">
                <label for="set-password">Set Password:</label>
                <form:password path="setPassword" id="password" class="form-control" required="true"/>
            </div>
            <div class="input-group">
                <label for="city">City:</label>
                <form:input path="city" id="city" class="form-control" required="true"/>
            </div>
            <div class="input-group">
                <label for="occupation">Occupation:</label>
                <form:input path="occcupation" id="occupation" class="form-control" required="true"/>
            </div>
            <button type="submit">Register</button>
        </form:form>
    </div>
</body>
</html>
