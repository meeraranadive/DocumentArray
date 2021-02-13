<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="log" enctype="multipart/form-data">

 NAME    : -  <input type="text" name="name"><br><br>
 ADDRESS : -  <input type="text" name="address"><br><br>
 File    : -  <input type="file" name="fname"><br><br>
 <input type="submit" value="Register">
 <a href="getfile">Get Files</a>
</form>
</body>
</html>