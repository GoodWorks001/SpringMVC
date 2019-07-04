<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>
     <h2>${message}</h2>
         <form:form modelAttribute="UserForm">
        　　　　　　　　     名前<form:input path="user_id"/>&nbsp;
                       <form:errors path="user_id"  cssStyle="color:red"/><br>
             　　　　　　　　パースワード<form:input path ="user_password"/>&nbsp;
                        <form:errors path="user_password" cssStyle="color:red"/><br>
               <input type="submit" value="送信">
           </form:form>

</body>
</html>