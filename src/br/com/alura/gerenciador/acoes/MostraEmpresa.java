package br.com.alura.gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import br.com.alura.gerenciador.servlet.modelo.Banco;
import br.com.alura.gerenciador.servlet.modelo.Empresa;

public class MostraEmpresa {

    public void executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		System.out.println("mostrando dados da empresa");

		String paramd = request.getParameter("id");
		Integer id = Integer.valueOf(paramd);
				
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);

		request.setAttribute("empresa", empresa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
	}
}
