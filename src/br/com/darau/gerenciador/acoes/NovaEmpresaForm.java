package br.com.darau.gerenciador.acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.darau.gerenciador.servlet.modelo.Banco;
import br.com.darau.gerenciador.servlet.modelo.Empresa;

import javax.servlet.ServletException;

public class NovaEmpresaForm implements Acao{

    public String executa (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "forward:formNovaEmpresa.jsp";
    }
}