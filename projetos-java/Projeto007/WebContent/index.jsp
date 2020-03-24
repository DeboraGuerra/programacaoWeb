<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form action="calculo" method="get">
			<input type="number" name="num1">
			<input type="number" name="num2">
			<select name="operador">
				<option value = "+">
					Somar
				</option>
				<option value = "-">
					Subtrair
				</option>
				<option value = "*">
					Multiplicar
				</option>
				<option value = "/">
					Dividir
				</option>
			</select>
			<input type="submit" value="Enviar dados">
		</form>
	</body>

</html>