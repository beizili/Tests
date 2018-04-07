<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/5 0005
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.GuessGame" %>
<html>
<head>

    <title>欢迎界面</title><%

%>
</head>
<body>
<jsp:useBean id="game" class="com.GuessGame" scope="page"/>
<jsp:setProperty name="game" property="*"/>
<%
    if(game.getCounter()==0){}
%>

</body>
</html>
