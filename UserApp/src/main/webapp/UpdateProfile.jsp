<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fString=(String)request.getAttribute("ufn");
String msg = (String)request.getAttribute("msg");
out.println("Page belongs to : "+fString+"<br>");
out.println(msg);
%>
 	<a href="view">ViewProfile</a>
<br>
 <a href="logout">Logout</a>
</body>
</html>