<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="includeimage.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Blog Posts</title>
    <link rel="stylesheet" type="text/css" href="AllBlogsStyle.css">
</head>
<body>

    <div class="container">
       
        <c:forEach var="user" items="${blogs}">
            <div class="blog-post">
                <div class="blog-header">
                    <span class="blog-username">${user.username}</span>
                    <p class="blog-date">${user.dt}</p>
                </div>
                <div class="blog-title">
                    <p>${user.title}</p>
                </div>
                <div class="blog-content">
                    <p>${user.content}</p>
                </div>
               <a href="/SBA/editBlog?id=${user.id}" class="edit-link">Edit</a>
                <a href="/SBA/deleteBlog?id=${user.id}" class="delete-link">Delete</a>
            </div>
        </c:forEach>
        
        <div class="new-blog-button">
            <c:choose>
                <c:when test="${not empty sessionScope.username}">
                    <a href="/SBA/writeBlog?username=${sessionScope.username}" class="button">Write New Blog</a>
                </c:when>
                <c:otherwise>
                    <a href="/SBA/writeBlog" class="button">Write New Blog</a>
                </c:otherwise>
            </c:choose>
        </div>
    </div>

</body>
</html>
