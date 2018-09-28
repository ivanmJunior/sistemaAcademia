package br.com.fitNet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.service.RegrasTreinoServeice;


@WebServlet("/ControllerListarTreinos")
public class ControllerListarTreinos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegrasTreinoServeice regraTreinoService = new RegrasTreinoServeice();
	
	private static String DESTINO = "/views/areaDoCliente.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ArrayList<Treino> listaTreino = regraTreinoService.consultar();
			request.setAttribute("listaTreino", listaTreino);
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}

}
