<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<script type="text/javascript">
function editData(){
	alert("Do you want Edit..?");
	document.mypage.action="edit";
	document.mypage.submit();	
}
function deleteData(){
	alert("Do you want delete..?");
	document.mypage.action="del";
	document.mypage.submit();	
}
</script>
<body>
<%  List<Student> list=(List) request.getAttribute("s"); %>
<form name="mypage">
<table border="5">
<thead>
<tr>
<th>SELECT</th>
<th>ID</th>
<th>Name</th>
<th>ADDRESS</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
     </tr>
    </thead>
    <tbody>
    <tr>
    <%for(Student s :list ) { %>
    <td><input type="radio" name="sid" value="<%=s.getSid() %>"></td>
    <td><%=s.getSid()%></td>
    <td><%=s.getEname()%></td>
    <td><%=s.getEaddress()%></td>
    <td><%=s.getUname()%></td>
    <td><%=s.getUpass()%></td>
    <td><input type="submit" value="edit" onclick="editData()"></td>
    <td><input type="submit" value="delete" onclick="deleteData()"></td>
    </tr>
    <%} %>
    </tbody>
    </table>
</form>
</body>
</html>