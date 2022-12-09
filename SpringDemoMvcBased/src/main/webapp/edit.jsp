<%@page import="com.example.demo.model.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<%
Student student=(Student) request.getAttribute("s");%>

<body>
<form action="up">
<pre>
<input type="hidden" name="sid" value="<%=student.getSid()%>"><br><br>
 Student Name      :<input type="text" name="ename" value="<%=student.getEname()%>"><br><br>
 Student Address   :<input type="text" name="eaddress" value="<%=student.getEaddress()%>"><br><br>
 Student User Name :<input type="text" name="uname" value="<%=student.getUname()%>"><br><br>
 Student Password  :<input type="text" name="upass" value="<%=student.getUpass()%>"><br><br>
<input type="submit" value="Confirm Registration"><br><br>
</pre>
</form>

</body>
</html>