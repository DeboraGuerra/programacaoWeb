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
		<form method="get" action="imc" name="formIMC">
			
			<h1>Calculadora de IMC</h1>
			
			<h2>Altura (m)</h2>
			<input type="number" class="caixa" name="altura" required="required" 
			 placeholder="0,00" step="0.01" min=0>
			
			
			<h2>Peso (kg)</h2>
			<input type="number" class="caixa" name="peso" required="required" 
			 placeholder="0,00" step="0.01" min=0>
			
			<br><br><br>
			<input type="submit" class="botao1" value="Calcular IMC">
		
		</form>
	</body>

</html>