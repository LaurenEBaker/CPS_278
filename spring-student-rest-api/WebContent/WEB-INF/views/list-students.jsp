<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Students</title>
</head>
<body>
	<table>
	<tr>
	<th>First Name </th>
	<th>Last Name </th>
	<th>Email</th>
	</tr>
	<c:forEach var="eachStudent" items="${students}">
	<tr>
	<td>${eachStudent.firstName}</td>
	<td>${eachStudent.lastName}</td>
	<td>${eachStudent.email}</td>
	</tr>
	</c:forEach>	
	</table>
</body>
</html>