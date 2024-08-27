<%@page import="test.EditProfile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String fname=(String)request.getAttribute("ufn");
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Page belongs to User : "+ub.getUfn()+"<br>");
out.println(ub.getUfn()+"&nbsp&nbsp"+ub.getUln()+"&nbsp&nbsp"+ub.getUad()+"&nbsp&nbsp"+ub.getUmid()+"&nbsp&nbsp"+ub.getUno()+"&nbsp&nbsp"+"<br><a href='edit'>Edit</a>"+"<br>");
%>

 <a href="logout">Logout</a>
</body>
</html>