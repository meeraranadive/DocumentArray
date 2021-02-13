<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello <%=request.getAttribute("m") %></h1>



<jsp:useBean id="data" class="com.Student" scope="request"/>

Student id : - <jsp:getProperty name="data" property="id"></jsp:getProperty><br>
Student Name : - <jsp:getProperty name="data" property="name"/><br>
Student Address : - <jsp:getProperty name="data" property="address"/><br>

Student id  : - <d:out value="${data.id}"/> <br>
Student Name : - ${data.name} <br>
Student Address  : - ${data.address} <br>
<hr>
<jsp:useBean id="data1" class="com.Student" scope="request"/>

Student id : - <jsp:getProperty name="data1" property="id"></jsp:getProperty><br>
Student Name : - <jsp:getProperty name="data1" property="name"/><br>
Student Address : - <jsp:getProperty name="data1" property="address"/><br>

Student id  : - ${data1.id} <br>
Student Name : - ${data1.name} <br>
Student Address  : - ${data1.address} <br>

<hr>
<h1>ONE WAY</h1>
<d:forEach items="${l}" var="stu">
Student id  : - ${stu.id} <br>
Student Name : - ${stu.name} <br>
Student Address  : - ${stu.address} <br>
</d:forEach>


<h1>SECOND WAY</h1>
<d:forEach items="${l}" var="stu">
Student id  : - <d:out value="${stu.id}"></d:out> <br>
Student Name : - <d:out value="${stu.name}"></d:out>  <br>
Student Address  : - <d:out value="${stu.address}"></d:out> <br>
</d:forEach>


</body>
</html>