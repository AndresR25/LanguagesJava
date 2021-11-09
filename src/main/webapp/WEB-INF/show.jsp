<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java</title>
</head>
<body>
	<a href="/languages">DashBoard</a><br>
	
	<h1>Name: <c:out value="${language.name}"/></h1>
	<h1>Creator: <c:out value="${language.creator}"/></h1>
	<h1>Version: <c:out value="${language.version}"/> </h1>
	<a href="">Edit</a><br>
	<a href="/languages/delete/<c:out value="${language.id}"/>">Delete</a><br>

</body>
</html>