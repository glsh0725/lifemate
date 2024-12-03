<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
    // 페이지 제목 설정
    request.setAttribute("pageTitle", "Home Page");
%>
<jsp:include page="header.jsp" />

<main>
    <h1>Welcome to the Home Page!</h1>
    <p>This is the main content of the home page.</p>
</main>
