<%@page import="com.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Customer> l=(List)request.getAttribute("data"); %>
<body>
 <h2 style="text-align: center; color: blue"><i>Customer All Info</i></h2>
 <div style="text-align: center; margin-left: 120px">
<table border="5">
  <thead>
    <tr style="color: red">
       <th>ID</th>
        <th>NAME</th>
         <th>ADDRESS</th>
            <th>USERNAME</th>
            <th>PASSWORD</th>
    </tr>
  </thead>
  <tbody>
  
  <% for(Customer s:l){ %>
        <tr>
     <td><%=s.getId() %></td>
      <td><%=s.getName() %></td>
       <td><%=s.getAddress() %></td>
          <td><%=s.getUname() %></td>
           <td><%=s.getPass() %></td>
          
      
      </tr>
  <% } %>
  </tbody>
   <a href="register.jsp">Add Customer</a>
</table>
</div>
</body>
</html>