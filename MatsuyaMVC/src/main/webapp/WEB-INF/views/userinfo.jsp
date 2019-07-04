<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<html>
<head>
<meta charset="UTF-8">
<title>新しいアカウント作ろう</title>
</head>
<body>
<center><h2>新しいアカウント作ろう</h2></center>
    <c:out value="${message}"> </c:out>
    <c:if test="${not empty userInfoFormList}"> 
    <table border="1">
       <tr>
               <th>名前</th>
               <th>年齢</th>
               <th>性別</th>
               <th>E-mail</th>
               <th>出身地</th>
               <th>好きなこと</th>
               <th>他に言いたいこと</th>
         </tr>
         <c:forEach var="userInfoForm" items="${userInfoFormList}">
         <tr>
         <td><c:out value="${userInfoForm.name}"></c:out></td>
           	<td><c:out value="${userInfoForm.age}"></c:out></td>
       		<td><c:out value="${userInfoForm.gender}"></c:out></td>
       		<td><c:out value="${userInfoForm.mail}"></c:out></td>
        	<td><c:out value="${userInfoForm.birthplace}"></c:out></td>
        	<td><c:out value="${userInfoForm.favoriteLangs}"></c:out></td>
        	<td><c:out value="${userInfoForm.etc}"></c:out></td>
        </tr>
     </c:forEach>
     </table>
 </c:if>      
 
 <form:form modelAttribute="userInfoForm">
 名前：
<form:input path="name" placeholder="名前を入力してください"/>
       <form:errors path="name"></form:errors>
       <br>
年齢：
<form:input path="age" placeholder="0"/>
       <form:errors path="age"></form:errors>
<br>
 性別：
 <form:radiobuttons path="gender" items="${genders}"/>
 <br>
 E-mail:
 <form:input path="mail"/>
 <form:errors path="mail"></form:errors>
 <br>
 出身地：
 <form:select path="birthplace" items="${birthplace}" multiple="false"/>
 <br>
 好きなこと：
 <form:checkboxes path="favoriteLangs" items="${favoriteLang}"/><br>
他に言いたいこと:<br>
 <form:textarea path="etc"/>
 <br>
 <br>
 <input type="submit" value="送信">
 </form:form>
 
</body>
</html>