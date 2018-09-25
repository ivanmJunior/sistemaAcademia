package br.com.fitNet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fitNet.model.service.RegrasClienteServeice;

@WebServlet("/ControllerAcessoCorporativo")
public class ControllerAcessoCorporativo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	RegrasClienteServeice rcs = new RegrasClienteServeice();
	
	private static String DESTINO = "/views/logadoSistema.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("txtUsuarioLogin");
		request.setAttribute("usuarioLogado", usuario);
		request.getRequestDispatcher(DESTINO).forward(request, response);

	
	}
}
