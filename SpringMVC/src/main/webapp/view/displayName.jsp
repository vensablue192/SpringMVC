<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Name View</title>
</head>
<body>
<%-- Hello <%= request.getAttribute("firstName") %> --%>
Hello ${name} <br>
Today is : ${date}<br>
-------------------<br>
List of team members
<c:forEach var="temp" items="${team}">
${temp}
</c:forEach>
</body> 
</html> 