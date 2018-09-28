package br.com.fitNet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerAcessoCliente")
public class ControllerAcessoCliente extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/views/areaDoCliente.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("txtUsuarioLogin");
		request.setAttribute("usuarioLogado", usuario);
		request.getRequestDispatcher(DESTINO).forward(request, response);

	
	}
}
