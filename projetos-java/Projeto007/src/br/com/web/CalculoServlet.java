package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculo")
public class CalculoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int numero1 = Integer.parseInt(req.getParameter("num1"));
		int numero2 = Integer.parseInt(req.getParameter("num2"));
		String op = req.getParameter("operador");
		int resultado = 0;
		
		if (op.equals("+")) {
			resultado = numero1 + numero2;
		
		} else if (op.equals("-")) {
			resultado = numero1 - numero2;
		
		} else if (op.equals("*")) {
			resultado = numero1 * numero2;
		
		} else if (op.equals("/")) {
			resultado = numero1 / numero2;
		}
		
		PrintWriter p = resp.getWriter();
		p.print("<html>");
		
		p.print("<head>");
		p.print("<title>Projeto007</title>");
		p.print("</head>");
		
		p.print("<body>");
		p.print("RESULTADO " + resultado);
		p.print("</body>");
		
		p.print("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
