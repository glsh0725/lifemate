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
<title>회원 정보 출력창</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="pink">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>닉네임</b></td>
      <td><b>이메일</b></td>
      <td><b>가입일</b></td>
   </tr>
   
 <c:forEach var="member" items="${membersList}" >     
   <tr align="center">
      <td>${member.usr_id}</td>
      <td>${member.usr_password}</td>
      <td>${member.usr_nickname}</td>
      <td>${member.usr_email}</td>
      <td>${member.usr_join_date}</td>
    </tr>
  </c:forEach>   
</table>
<a  href="${contextPath}/member/memberForm.do"><h1 style="text-align:center">회원가입</h1></a>
</body>
</html>
