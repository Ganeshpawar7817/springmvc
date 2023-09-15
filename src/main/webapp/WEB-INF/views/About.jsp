<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Object object=request.getAttribute("names");
List<String> names=(List<String>) object;
List<String> list =(List<String>) request.getAttribute("names");
for(String name:names){
%>
<h2><%=name %></h2>
<%} %>



</body>
</html>