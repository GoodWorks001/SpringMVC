<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix ="form" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Product</title>
</head>
<body>


<p> <c:out value="${message}"/></p>

<c:if test = "${not empty productList}">
	<table border = "1";>
	<tr>
		<th>名前</th>
	</tr>
		<c:forEach var= "productForm" items = "${productList}">
			<tr>
			<td><c:out value = "${productForm.name }"></c:out></td>
			<td><c:out value = "${productForm.price}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	</c:if>
	

<form:form modelAttribute = "productForm">
	名前<form:input path = "name"  placeholder="名前を入力してください。"/><br/>
	価格<form:input path = "price" placeholder= "0"/><br/>
	<input type = "submit" value = "送信"><br/>
</form:form>



</body>
</html>