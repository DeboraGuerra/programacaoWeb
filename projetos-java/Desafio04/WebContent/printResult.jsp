<%@page import="br.com.web.CalcServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>Desafio03</title>
	</head>
	
	<body>
		<h1>O resultado é <%=request.getAttribute("result")%></h1>
	</body>

</html>