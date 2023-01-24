<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.bean.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Validation Page</h1>
	<jsp:useBean id="beanobj" class="com.bean.UserBean" scope="session">
		<jsp:setProperty property="*" name="beanobj" />
	</jsp:useBean>
	<%
	String role = beanobj.validate();
	%>
	<jsp:forward page='<%=role%>'></jsp:forward>
</body>
</html>