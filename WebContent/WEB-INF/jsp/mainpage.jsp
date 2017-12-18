<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>web modal main page</title>
	<link rel="stylesheet" href="<%= contextPath %>/css/main.css">
	<script type="text/javascript" src="<%= contextPath %>/js/jquery-latest.js"></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div id="picdiv">
		<ul class="cd-items cd-container">
			<c:forEach items="${names }" var="name">
				<li class="cd-item">
				    <img style="height:160px;max-width:200px;" src="<%= request.getContextPath() %>/images/${name }.jpg" alt="Item Preview">
			  	</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>