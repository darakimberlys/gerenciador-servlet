package br.com.darau.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.darau.gerenciador.servlet.modelo.Banco;
import br.com.darau.gerenciador.servlet.modelo.Empresa;

import javax.servlet.ServletException;

public class MostraEmpresa implements Acao{

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		System.out.println("mostrando dados da empresa");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		
		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
}