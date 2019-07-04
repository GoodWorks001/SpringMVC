<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Food 検索</title>
</head>
<body>
<div align="right">さん、ようこそ。</div>
<h2 align="center">${message}</h2>
<h3 align="center">検索したい商品</h3>
  <form:form modelAttribute="foodForm">
<center><form:input path="food_type"/><br></center>
<center>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="検索"></center>
     </form:form>
</body>
</html>