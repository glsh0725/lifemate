<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
    <meta charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인</title>
    <link rel="stylesheet" href="${contextPath}/css/main/main.css">
</head>
<body>
<main class="max fixed">
    <section id="welcome-page" class="main-section">
    <%@ include file="/WEB-INF/views/includes/header.jsp" %>
        <!-- 메인 슬라이드 -->
        <section class="main-slide">
            <div class="slide-container1">
                <div class="slide1"></div>
                <div class="slide-control-container">
                    <div class="slide-delay-bar">
                        <div class="delay-bar-progress"></div>
                    </div>
                    <span id="slide-indicator">01/03</span>
                    <div class="slide-controls">
                        <button id="prev">Prev</button>
                        <button id="toggle">Start</button>
                        <button id="next">Next</button>
                    </div>
                </div>
            </div>
            <div class="slide-container2">
                <div class="slide2"></div>
            </div>
        </section>

        <!-- 메인 소개 -->
        <div class="introduce">
            <section class="intro">
                <div class="intro-item">
                    <h3>소개글</h3>
                </div>
            </section>
            <section class="detail">
                <h3>자세히보기</h3>
                <div class="detail-list">
                    <div class="detail-item">
                        <h2>🐾 메이트</h2>
                        <a href="#mate-section" class="button">알아보기</a>
                    </div>
                    <div class="detail-item">
                        <h2>🐾 축제정보</h2>
                        <a href="#festival-section" class="button">알아보기</a>
                    </div>
                    <div class="detail-item">
                        <h2>🐾 커뮤니티</h2>
                        <a href="#community-section" class="button">알아보기</a>
                    </div>
                </div>
            </section>
        </div>
    </section>

    <section id="mate-section" class="main-section">
        <div class="box main-box">
            <h2>메이트</h2>
            <div class="main-box-header">
                <p>목적</p>
                <p>설명</p>
            </div>
            <h2>주요기능설명</h2>
            <ul class="list">
                <li><strong>주</strong> 주</li>
                <li><strong>요</strong> 요</li>
                <li><strong>기</strong> 기</li>
                <li><strong>능</strong> 능</li>
            </ul>
            <a class="main-button" href="/mate">메이트 바로가기 ➽</a>
        </div>
    </section>

    <section id="festival-section" class="main-section">
        <div class="box main-box">
            <h2>축제정보</h2>
            <div class="main-box-header">
                <p>목적</p>
                <p>설명</p>
            </div>
            <h2>주요기능설명</h2>
            <ul class="list">
                <li><strong>주</strong> 주</li>
                <li><strong>요</strong> 요</li>
                <li><strong>기</strong> 기</li>
                <li><strong>능</strong> 능</li>
            </ul>
            <a class="main-button" href="/festival">축제정보 바로가기 ➽</a>
        </div>
    </section>

    <section id="community-section" class="main-section">
        <div class="box main-box">
            <h2>커뮤니티</h2>
            <div class="main-box-header">
                <p>목적</p>
                <p>설명</p>
            </div>
            <h2>주요기능설명</h2>
            <ul class="list">
                <li><strong>주</strong> 주</li>
                <li><strong>요</strong> 요</li>
                <li><strong>기</strong> 기</li>
                <li><strong>능</strong> 능</li>
            </ul>
            <a class="main-button" href="/community">커뮤니티 바로가기 ➽</a>
        </div>
    </section>

    <button class="top-button">▲ Top</button>
    <%@ include file="/WEB-INF/views/includes/footer.jsp" %>
</main>
</body>
<script src="${contextPath}/js/main/main.js"></script>
</html>