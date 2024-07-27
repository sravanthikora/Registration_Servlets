<%@page import="models.student"%>
<%@page import="java.util.List"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="services_dao.studentservice_dao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="bootstrap.jsp" %>
</head>
<body>
<table class="table" border=2px>
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">name</th>
      <th scope="col">branch</th>
      <th scope="col">email</th>
      <th scope="col">phoneno</th>
      <th scope="col">Actions</th>
      
    </tr>
  </thead>
  <tbody>
  <%
studentservice_dao service = new studentservice_dao(studentdb.getconnection());
  List <student> stu = service.fetchall();
  for(student st : stu){ 
  %>
    <tr>
      <th scope="row"><%=st.getId() %></th>
      <td><%=st.getName() %></td>
      <td><%=st.getBranch() %></td>
      <td><%=st.getEmail() %></td>
       <td><%=st.getPhoneno() %></td>
      <td>
      
      <button class="btn btn-outline-warning">Update</button>
      <a href="delete?id=<%= st.getId() %>">
      <button class="btn btn-outline-danger">Delete</button>
      </a>
      </td>
    </tr>
    <%} %>
    
  </tbody>
</table>
</body>
</html>