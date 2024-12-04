<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
    request.setCharacterEncoding("UTF-8");
%>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>축제정보</title>
    <link rel="stylesheet" href="${contextPath}/css/festival/festival.css">
    <%@ include file="/WEB-INF/views/includes/header.jsp" %>
</head>
<body>
    <main>
        <h1>축제 리스트</h1>
        <section class="festival-section">
            <ul class="festival-list">
                <c:forEach var="festival" items="${festivals}">
                    <li class="festival-item">
                        <div class="festival-title">${festival.fstvlNm}</div>
                        <div class="festival-dates">${festival.fstvlStartDate} ~ ${festival.fstvlEndDate}</div>
                        <div class="festival-address">${festival.address}</div>
                    </li>
                </c:forEach>
            </ul>
            <div class="pagination">
                <c:if test="${currentPage > 1}">
                    <a href="${contextPath}/festival?page=${currentPage - 1}" class="prev">이전</a>
                </c:if>

                <c:forEach begin="1" end="${totalPages}" var="pageNum">
                    <a href="${contextPath}/festival?page=${pageNum}"
                       class="${pageNum == currentPage ? 'active' : ''}">${pageNum}</a>
                </c:forEach>

                <c:if test="${currentPage < totalPages}">
                    <a href="${contextPath}/festival?page=${currentPage + 1}" class="next">다음</a>
                </c:if>
            </div>
        </section>
    </main>
</body>
</html>