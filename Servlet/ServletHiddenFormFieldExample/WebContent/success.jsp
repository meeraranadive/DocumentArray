<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Index Page Data : <%=request.getAttribute("t1") %>
Second Page Data : <%=request.getAttribute("t2") %>
Third Page Data  : <%=request.getAttribute("t3") %>

</body>
</html>