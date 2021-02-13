<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="log">
<hr>
<p style="color: Green">
  <%String m=(String)request.getAttribute("m"); %>
  <%if(m !=null){ %>
  <%=request.getAttribute("m")%>
  <%} %>
  </p>
<hr>
Username : - <input type="text" name="uname"><br><br>
Password : - <input type="text" name="pass"><br><br>

<input type="submit" value="login">
<a href="register.jsp">New user</a>

</form>
</body>
</html>