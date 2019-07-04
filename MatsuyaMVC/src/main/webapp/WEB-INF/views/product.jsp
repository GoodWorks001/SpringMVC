<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品出力画面</title>
</head>
<body>
<center><h2>商品一覧</h2></center>
こんにちは、お腹が空いたのか？
<c:if test="${not empty foodFormList}">
以下の料理です。
<c:forEach var ="foodForm" items="${foodFormList}">
<c:out value="${foodForm.food_type}"></c:out>
</c:forEach>
</c:if>


</body>
</html>