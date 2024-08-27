<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.UserBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Welcome User : "+ub.getUfn()+"<br>");
%>

<a href="view">ViewProfile</a>
<br>
 <a href="logout">Logout</a>
 <br>

</body>
</html>