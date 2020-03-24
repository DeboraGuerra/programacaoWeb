package br.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class CalcServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		float num1 = Float.parseFloat(req.getParameter("num1"));
		float num2 = Float.parseFloat(req.getParameter("num2"));
		float result = 0;
		
		String operador = req.getParameter("operador");
		
		switch (operador) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		
		// Armazena um atributo na requisição.
		req.setAttribute("result", result);
		
		/* Retorna um objeto RequestDispatcher que atua como um wrapper
		 * para o recurso localizado no caminho especificado. 
		 * 
		 * Um objeto RequestDispatcher pode ser usado para encaminhar 
		 * uma solicitação ao recurso ou incluir o recurso em uma resposta. 
		 */
		req.getRequestDispatcher("/printResult.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}
	
}
