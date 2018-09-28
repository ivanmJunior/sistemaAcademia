package br.com.fitNet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.exception.TreinoInvalidoException;
import br.com.fitNet.model.service.RegrasTreinoServeice;

@WebServlet("/ControllerInserirTreino")
public class ControllerInserirTreino extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/ControllerListarTreinos";
	

	protected void doGett(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    SimpleDateFormat formatarData = new SimpleDateFormat("yyy-mm-dd");
	    SimpleDateFormat formatarHora = new SimpleDateFormat("hh:mm");
		Treino treino = new Treino();
		
		treino.getInstrutor().setNome(request.getParameter("txtNomeAreaCli"));
		treino.getModalidade().setDescricao(request.getParameter("cbBoxModalidadeAreaCli"));
		treino.setDataDoAgendamento(new Date());
		
		try {
			treino.setDataTreino(formatarData.parse(request.getParameter("cbBoxDataAreaCli")));
			treino.setHoraInicio(formatarHora.parse(request.getParameter("cbBoxHoraIniAreaCli")));
			treino.setHoraTermino(formatarHora.parse(request.getParameter("cbBoxHoraFimAreaCli")));
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		
		RegrasTreinoServeice regraTreinoService = new RegrasTreinoServeice();
		
		try {
			regraTreinoService.incluir(treino);
			request.getRequestDispatcher(DESTINO).forward(request, response);
			
		} catch (TreinoInvalidoException | SQLException e) {
			request.setAttribute("msg", "Erro ao salvar! "+e.getMessage());
			request.getRequestDispatcher(DESTINO).forward(request, response);
			e.printStackTrace();
		}
		
	}

}
