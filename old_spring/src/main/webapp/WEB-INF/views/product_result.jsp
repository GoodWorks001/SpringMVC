<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="UTF-8">
<title>Product_Result</title>
</head>
<body>
<p><c:out value ="${message}"/></p>


<table border="1">
<tr>
	<th>名前</th>
	<th>価格</th>
</tr>

<tr>
	<td>${productForm.name}</td>
	<td>${productForm.price}</td>
</tr>	
</table>
</body>
</html>