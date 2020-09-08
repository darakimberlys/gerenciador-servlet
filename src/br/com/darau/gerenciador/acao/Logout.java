package br.com.darau.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.darau.gerenciador.servlet.modelo.Usuario;
import br.com.darau.gerenciador.servlet.modelo.Banco;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		
		sessao.invalidate();
		
		return "redirect:entrada?acao=LoginForm";
	}
}