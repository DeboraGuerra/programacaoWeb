<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title> Calculadora Simples </title>
	</head>
	
	<body>
		<form action="calcular" method="get">
			<input type="number" step="0.01" name="num1">
			
			<select name="operador">
				<option value = "+"> + </option>
				<option value = "-"> - </option>
				<option value = "*"> * </option>
				<option value = "/"> / </option>
			</select>
			
			<input type="number" step="0.01" name="num2">
			
			<input type="submit" value="Calcular">
		</form>
	</body>
	
</html>