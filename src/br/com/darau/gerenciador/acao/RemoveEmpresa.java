package br.com.darau.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.darau.gerenciador.servlet.modelo.Banco;
import br.com.darau.gerenciador.servlet.modelo.Empresa;

import javax.servlet.ServletException;

public class RemoveEmpresa implements Acao{
	
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		System.out.println("acao removendo empresas");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
}
