<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg">

<hr>
<%-- <p style="color: red">
  <%String m=(String)request.getAttribute("msg"); %>
  <%if(m !=null){ %>
  <%=request.getAttribute("msg")%>
  <%} %>
  </p> --%>
  <p style="color: red">
  <%String ms=(String)request.getAttribute("ms"); %>
  <%if(ms !=null){ %>
  <%=request.getAttribute("ms")%>
  <%} %>
  </p>
<hr>


Id   : - <input type="text" name="oid"><br><br>  
Name : - <input type="text" name="oname"><br><br>
  <p style="color: red">
  <%String ms1=(String)request.getAttribute("ms"); %>
  <%if(ms1 !=null){ %>
  <%=request.getAttribute("ms")%>
  <%} %>
  </p>
Date : - <input type="text" name="odate"><br><br>

<input type="submit" value="Register">

</form>
</body>
</html>