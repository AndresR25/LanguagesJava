<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java</title>
</head>
<body>
		<form:form action="/update/${language.id}" method="post" modelAttribute="language">
		<input type="hidden" name="_method" value="put">
		<div>
			Name:
    		<form:input type="text" path="name"/>
    		<form:errors path="name"/>
		</div>
		<div>
  			Creator:
    		<form:input type="text" path="creator"/>
    		<form:errors path="creator"/>
		</div>
		<div>
			Version:
    		<form:input type="text" path="version"/>
    		<form:errors path="version"/>
  		</div>				
		<div>
  			<input type="submit"/> 	
		</div>
		</form:form>
</body>
</html>