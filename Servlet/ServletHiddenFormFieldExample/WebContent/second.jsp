<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="secondpage">

   Data Of Index Page : - <%=request.getAttribute("t1") %>
   <input type="hidden" name="indexpagefield" value="<%=request.getAttribute("t1")%>">
   Second Page Data : - <input type="text" name="secondData"><br><br>
  <input type="submit" value="Ok">
</form>

</body>
</html>