<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>user</title>
</head>
<body>
<center><p>ユーザ情報が入力されました</p></center>
<table>
<tr>
	<td>名前</td>
	<td>年齢</td>	
	<td>性別</td>
	<td>E-mail</td>
	<td>出身地</td>
	<td>好きな言語</td>
	<td>備考</td>
</tr>
<tr>
	<td><input type="submit" value="送信"></td>
	<td><input type="text" name="${name}"></td>
	<td><input type="text" name="${age}"></td>
	<td><input type="radio" value="${gender}">男　女</td>
	<td><input type="text" name="${E-mail}"></td>
	<td><input type="radio" value="${address}">北海道　東北　関東　中部　近畿　中国　九州　四国</td>
	<td><input type="checkbox" value="${address}">Java PHP Ruby Perl Python</td>
</tr>
</table>
</body>
</html>