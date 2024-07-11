<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="includeimage.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Blog Posts</title>
    <link rel="stylesheet" type="text/css" href="AllBlogsStyle.css">
</head>
<body>

    <div class="container">
        <c:forEach var="user" items="${blogs}">
            <div class="blog-post">
                <div class="blog-header">
                    <span class="blog-username">USER:${user.username}</span>
                    <p class="blog-date">${user.dt}</p>
                </div>
                <div class="blog-title">
                    <p>${user.title}</p>
                </div>
                <div class="blog-content">
                    <p>${user.content}</p>
                </div>
                
            </div>
        </c:forEach>
    </div>

</body>
</html>
