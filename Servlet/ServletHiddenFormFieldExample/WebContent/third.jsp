<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="thirdpage">
Index Page Data : <%=request.getAttribute("t1") %>
Second Page Data : <%=request.getAttribute("t2") %>

<input type="hidden" name="first" value="<%=request.getAttribute("t1") %>">
<input type="hidden" name="second" value="<%=request.getAttribute("t2") %>">
Third Page Data : - <input type="text" name="thirdpagedata"><br><br>
<input type="submit" value="Ok">

</form>
</body>
</html>