<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome to matsuya</title>
<meta http-equiv="Content-Style-Type" CONTENT="text/css">
<meta http-equiv="Content-Style-Type" CONTENT="text/html;
charset=Shift_JIS">
<style type="text/css">
<!--
.top{
      vertical-align:top
      }
-->
<!--
a:link{
      color:#oo33CC;
      }
a:visited{
      color:#FF99oo;}
a:hover{
       color:#FFCCoo;
       background:#CCoooo;
       }
-->
       
<!--
.alpha{
       filter:progid:DXImageTransform.Microsoft.alpha(style=1,opacity=100,finishopacity=10,startx=0,starty=0,finishx=300,finishy=100)
       }
       
div{
  color:white;
  font-size:24px;
  font-family:Georgia;
  font-weight:bold;
  width:100%;
  background-color:#FFCC33;
  padding:4px 4px 4px 8px;
  }
  -->
 
 <!--
 .right{
     border-right-style:double;
     border-color:darkseagreen;
     color:gray;
     font-family:Impact;
     font:size:24px;
     width:50%
     }
-->

<!--
.navigation{
  font-size:10pt;
  letter-spasing:2px;
  width:600px;
  height:13px;
  border-bottom:gary 2px solid;
  border-right:gray 2px solid;
  background:peachpuff 100% Opx;
  text-align:center;
  padding:2px;
  }
  -->
</style>
</head>
<div align="right">もう<font color="grey"><span id="view_clock"></span>

<script type="text/javascript">
timerID = setInterval('clock()',500); 

function clock() {
	document.getElementById("view_clock").innerHTML = getNow();
}

function getNow() {
	var now = new Date();
	var year = now.getFullYear();
	var mon = now.getMonth()+1; 
	var day = now.getDate();
	var hour = now.getHours();
	var min = now.getMinutes();
	var sec = now.getSeconds();

	
	var s = year + "年" + mon + "月" + day + "日" + hour + "時" + min + "分" + sec + "秒";
	return s;
}
</script></font>になりましたよ
<p>お腹が空きましたか ? 一緒に松屋の料理を食べましょう（笑）</p>
</div>
<p><div align="right">超すすめ！</div>
<i><b>人気メニュー</b></i>
<u><a href="http://localhost:8080/matsuya/beef/">牛めし</a></u>
<u><a href="http://localhost:8080/matsuya/set/">定食</a></u>
<u><a href="http://localhost:8080/matsuya/noodles/">うどん</a></u>
<u><a href="http://localhost:8080/matsuya/hotpot/">鍋</a></u>

</p>
<body>
  <DIV CLASS="alpha"><center><h1>${message}</h1></center></DIV>


         <form:form modelAttribute="loginForm">
        　　
        <center>
        <table>
        <tr>
        <th><IMG SRC="https://www.kansai-airport.or.jp/sites/default/files/styles/tenant_image_main/public/2017-10/d053-main.jpg?itok=VobqVWau" 
        class="top" width="150" height="120"></th><th>お名前&nbsp;  &nbsp;  &nbsp; <form:input path="userId"/><form:errors path="userId"  cssStyle="color:red"/><br><br>
             　　パスワード&nbsp;  &nbsp;  <form:input path ="password"/>
      <form:errors path="password" cssStyle="color:red"/></th></tr>
      </table>  </center>
                 <center> <input type="submit" value="送信"></center><br>
                  
                  <div align="right" ><a href="http://localhost:8080/matsuya/userinfo">新しいアカウント作ろう</a></div>
           </form:form>
         
           
           

</body>
</html>