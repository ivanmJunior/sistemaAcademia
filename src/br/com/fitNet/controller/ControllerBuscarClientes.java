package br.com.fitNet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.service.RegrasClienteServeice;


@WebServlet("/ControllerListarCliente")
public class ControllerBuscarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegrasClienteServeice rcs = new RegrasClienteServeice();
	
	private static String DESTINO = "/views/clientes.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ArrayList<Cliente> listaClientes = rcs.consultar();
			request.setAttribute("clientes", listaClientes);
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}

}
