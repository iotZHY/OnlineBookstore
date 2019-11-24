<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
</head>
<body>
<%
String name=request.getParameter("Name");
String phone=request.getParameter("Phone");
String email=request.getParameter("Email");
String passWord=request.getParameter("Password");
String output = name+phone+email+passWord;
%>
<%=output%>
</body>
</html>