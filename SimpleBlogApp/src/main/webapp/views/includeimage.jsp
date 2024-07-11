<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple BLOG Application</title>
    <link rel="stylesheet" href="style.css">
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            var pathname = window.location.pathname.replace(/\/$/, ""); // Remove trailing slash if any
            var navLinks = document.querySelectorAll(".topnav a");

            navLinks.forEach(function(link) {
                link.classList.remove("active"); // Remove active class from all links
                var linkPath = link.getAttribute("href").replace(/\/$/, ""); // Remove trailing slash if any
                if (linkPath === pathname) {
                    link.classList.add("active"); // Add active class to the matching link
                }
            });
        });
    </script>
    <style>
        .topnav {
            overflow: hidden;
            background-color: #333;
        }
        
        .topnav a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }
        
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }
        
        .topnav a.active {
            background-color: #4CAF50;
            color: white;
        }
        
        .topnav .right {
            float: right;
        }
    </style>
</head>
<body>
    <div class="topnav">
        <a class="active" href="/SBA/home">Home</a>
        <a href="/SBA/blogs">Show BLOGS</a>
        <a href="/SBA/about">About</a>
        
        <!-- Right-aligned section for login/logout -->
        <div class="right">
            <%
                String username = (String) session.getAttribute("username");
                if (username == null) {
            %>
                <a href="/SBA/login">Login</a>
            <%
                } else {
            %>
                <a href="/SBA/logout">Logout</a>
            <%
                }
            %>
        </div>
    </div>

    
</body>
</html>
