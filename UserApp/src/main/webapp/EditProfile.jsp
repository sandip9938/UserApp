<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="test.UserBean"
    %>
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
out.println("Page Belongs To user : "+ub.getUfn()+"<br>");
%>
<form action="update" method="post">
           Address: <input type="text"  name="uad" value=<%=ub.getUad() %>>
          Email : <input type="mail"  name="umid" value=<%=ub.getUmid() %>>
         Phone No: <input type="number"  name="uno" value=<%=ub.getUno() %>><br>
          <input type="submit" value="UpdateInfo">
        </form>
</body>
</html>