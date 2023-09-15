<%@page import="java.time.LocalDateTime"%>
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
String name=(String)request.getAttribute("name");
int rollNumber=(Integer)request.getAttribute("rollNumber");
LocalDateTime dateTime=(LocalDateTime)request.getAttribute("dateTime");
%>
<h1>Hi, I am<%= name%></h1>
<h1>This is help page</h1>
<h1>my rollNumber is <%=rollNumber %></h1>
<h1>now time is <%=dateTime %></h1>

</body>
</html>