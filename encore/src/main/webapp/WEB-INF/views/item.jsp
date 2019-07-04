<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品検索画面</title>
</head>
<body>
	<h2>${message}</h2>
	<form:form modelAttribute="ItemForm">
商品検索：<form:input path="item" />&nbsp;
<form:errors path="item"></form:errors>
		<br>
		<input type="submit" value="送信">
	</form:form>

</body>
</html>