<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Write a Blog</title>
    <link rel="stylesheet" href="blogPageStyle.css">
</head>
<body>
    <div class="container">
        <h1>Write a Blog</h1>
        <form:form action="submitBlog" method="post" modelAttribute="post">
            <form:hidden path="id"/>
            <div class="form-group">
                <form:label path="username">Username:</form:label>
                <form:input path="username" readonly="true" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="title">Title:</form:label>
                <form:input path="title" required="true" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="content">Content:</form:label>
                <form:textarea path="content" rows="10" required="true" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <button type="submit" class="btn">Submit</button>
            </div>
        </form:form>
    </div>
</body>
</html>
