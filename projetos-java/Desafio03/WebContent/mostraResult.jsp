<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>Calculadora de IMC</title>
		<link rel="stylesheet" href="style.css">
	</head>
	
	<body class="bkgPadrao">
		<form method="get" action="index.jsp">
			<h2><%=request.getAttribute("frase")%></h2>
			<h3><%=request.getAttribute("result")%></h3>
			<input type="submit" class="botao2" value="Calcular Novamente">
		</form>
	</body>
	
</html>