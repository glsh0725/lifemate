<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
    // 페이지 제목 설정
    request.setAttribute("pageTitle", "Home Page");
%>
<jsp:include page="header.jsp" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%= request.getAttribute("pageTitle") != null ? request.getAttribute("pageTitle") : "Default Title" %></title>
    <link rel="stylesheet" href="src/resource/static//header/css/style.css">
    <script src="/src/resource/static/header/js/header.js"></script>
</head>
<body>
    <header>
        <div class="logo">
            <a href="/index.jsp"><img src="/images/logo.png" alt="Logo"></a>
        </div>
        <nav>
            <ul>
                <li><a href="/home.jsp">Home</a></li>
                <li><a href="/about.jsp">About</a></li>
                <li><a href="/contact.jsp">Contact</a></li>
                <li><a href="/login.jsp">Login</a></li>
            </ul>
        </nav>
    </header>
</body>
</html>
