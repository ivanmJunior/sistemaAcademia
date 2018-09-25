package br.com.fitNet.controller;

import java.io.IOException;
import java.sql.SQLException;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.service.RegrasClienteServeice;


@WebServlet("/ControllerInserirClienteSistema")
public class ControllerInserirClienteSistema extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/views/clientes.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c = new Cliente();

		
		c.getMatricula().setNumeroMatricula(0000);
		c.setId(00);
		c.setNome(request.getParameter("txtNome"));
		c.setNome(c.getNome()+" "+request.getParameter("txtSobrenome"));
		c.getAcesso().setUsuario(request.getParameter("txtUsuario"));
		c.getAcesso().setSenha(request.getParameter("txtSenha"));
		c.setEmail(request.getParameter("txtEmail"));
		c.setFone(request.getParameter("txtFone"));
		c.setFone2(request.getParameter("txtCelular"));
		c.setCpf(request.getParameter("txtCpf"));
		c.setDataCadastro(new Date());
		c.setDataNascimento(new Date());
				
		
		RegrasClienteServeice rcs = new RegrasClienteServeice();
		
		try {
			rcs.incluir(c);
			request.setAttribute("msg", "Salvo com sucesso!");
			request.getRequestDispatcher(DESTINO).forward(request, response);
			
		} catch (ClienteInvalidoException | SQLException e) {
			request.setAttribute("msg", "Erro ao salvar! "+e.getMessage());
			request.getRequestDispatcher(DESTINO).forward(request, response);
			e.printStackTrace();
		}
		
	}

}
