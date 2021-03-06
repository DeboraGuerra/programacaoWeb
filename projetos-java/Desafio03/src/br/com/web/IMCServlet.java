package br.com.web;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imc")
public class IMCServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// divide-se o peso do paciente pela sua altura elevada ao quadrado;
		// o indivíduo tem peso normal quando o resultado do IMC está entre 18,5 e 24,9
		
		float peso = Float.parseFloat(req.getParameter("peso"));
		float altura = Float.parseFloat(req.getParameter("altura"));
		float imc = peso / (altura * altura);
		
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		String frase = "O valor do seu IMC é " + decimal.format(imc) + ".";
		String result = "";
		
		if ( (imc > 18.4) && (imc < 25.0) ) {
			result = "Está dentro dos padrões de normalidade.";
		} else if (imc < 18.5) {
			result = "Está abaixo do normal.";
		} else {
			result = "Está acima do normal.";
		}
		
		req.setAttribute("frase", frase);
		req.setAttribute("result", result);
		req.getRequestDispatcher("/mostraResult.jsp").forward(req, resp);;
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
