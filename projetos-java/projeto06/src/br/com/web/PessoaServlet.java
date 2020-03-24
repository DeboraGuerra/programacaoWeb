package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation
@WebServlet("/Pessoa")

// extends: herança
public class PessoaServlet extends HttpServlet {
	
	String arrayFrases[] = {"A persistência é o caminho do êxito.", 
	                        "No meio da dificuldade encontra-se a oportunidade.", 
	                        "O sucesso é ir de fracasso em fracasso sem perder entusiasmo."};
	
	Random gerador = new Random();
	
	
	// toda vez que o usuário requisita alguma coisa, vai
	// cair aqui
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter p = resp.getWriter();
		p.write("<html>");
		p.write("<head>");
		p.write("<title>Frase Motivacional</title>");
		p.write("</head>");
		p.write("<body>");
		p.write(arrayFrases[gerador.nextInt(arrayFrases.length)]);
		p.write("</body>");
		p.write("</html>");
		
	}

}
