package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class CalculadoraServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// versão após a aula do dia 23/03/2020 ----------------------
		
		float num1 = Float.parseFloat(req.getParameter("num1"));
		float num2 = Float.parseFloat(req.getParameter("num2"));
		float result = 0;
		
		String op = req.getParameter("operador");
		
		switch (op) {
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
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		
		out.print(	"<head>");
		out.print(		"<title>Calculadora Simples</title>");
		out.print(	"</head>");
		
		out.print(	"<body>");
		out.print(		"O resultado é " + result);
		out.print(	"</body>");
		
		out.print("</html>");
		
		
		// primeira versão -------------------------------------------
		
//		PrintWriter out = resp.getWriter();
//		out.print("<html>");
//		
//		out.print("	 <head>");
//		
//		out.print("		<title>Calculadora Simples</title>");
//	
//		out.print("	 	<script type=\"text/javascript\">");
//		
//		out.print("			function calcular(op) {");
//		out.print("				var num1 = parseFloat(document.getElementById(\"txtNum1\").value);");
//		out.print("				var num2 = parseFloat(document.getElementById(\"txtNum2\").value);");
//		out.print("				var result = 0;");
//		out.print("				switch(op) {");
//		out.print("					case '+':");
//		out.print("						result = num1 + num2;");
//		out.print("						break;");
//		out.print("					case '-':");
//		out.print("						result = num1 - num2;");
//		out.print("						break;");
//		out.print("					case '*':");
//		out.print("						result = num1 * num2;");
//		out.print("						break;");
//		out.print("					case '/':");
//		out.print("						result = num1 / num2;");
//		out.print("						break;");
//		out.print("				}");
//		out.print("				alert(\'Resultado: \'+result);");
//		out.print("			}");
//		
//		out.print("	 	</script>");
//		
//		out.print("	 </head>");
//		
//		out.print("	 <body>");
//		
//		out.print("		<h1>Calculadora Simples</h1>");
//		out.print("		<h2>Número 1</h2>");
//		out.print("		<input type=\"number\" id=\"txtNum1\">");
//		out.print("		<h2>Número 2</h2>");
//		out.print("		<input type=\"number\" id=\"txtNum2\">");
//		out.print("		<h2>Operador</h2>");
//		out.print("		<input type=\"button\" OnClick=\"calcular(this.value);\" value=\"+\" id=\"btnSoma\">");
//		out.print("		<input type=\"button\" OnClick=\"calcular(this.value);\" value=\"-\" id=\"btnSubtr\">");
//		out.print("		<input type=\"button\" OnClick=\"calcular(this.value);\" value=\"*\" id=\"btnMult\">");
//		out.print("		<input type=\"button\" OnClick=\"calcular(this.value);\" value=\"/\" id=\"btnDiv\">");
//	
//		out.print("	 </body>");
//		
//		out.print("</html>");	
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
