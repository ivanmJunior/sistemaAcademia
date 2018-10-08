package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.exception.TreinoInvalidoException;
//import org.springframework.web.servlet.ModelAndView;
import br.com.fitNet.model.service.RegrasTreinoServeice;


@Controller
public class TreinoController {

	RegrasTreinoServeice regraTreino = new RegrasTreinoServeice();
	
	@RequestMapping("areaDoCLiente")
	public String efetuarLoginCliente() {
		return "cliente/areaDoCliente";
	}
	
	@RequestMapping("adicionaTreino")
	public String execInserirTreino(Treino treino) {
		try {
			regraTreino.incluir(treino);
		} catch (TreinoInvalidoException | SQLException e) {
			System.out.println("cheguei!!!cath inserir"+e.getMessage());
			e.printStackTrace();
		}
		return "redirect:listarTreino";
	}

	@RequestMapping("listarTreino")
	public String execListarTreino(Model modelo) {
		
		try {
			Set<Treino> listaDeTreinosConsultado;
			listaDeTreinosConsultado = regraTreino.consultar();
			modelo.addAttribute("listaTreino", listaDeTreinosConsultado);
			
		} catch (SQLException e) {
			System.out.println("cheguei!!!cath inserir"+e.getMessage());
			e.printStackTrace();
		}
		return "cliente/areaDoCliente";
	}
	
	@RequestMapping("removerTreino")
	public String execRemoverTreino(Treino treino) {
		
		try {
			regraTreino.remover(treino);
		} catch (SQLException e) {
			System.out.println("cheguei!!!cath inserir"+e.getMessage());
			e.printStackTrace();
		}
		return "redirect:listarTreino";
	}
	
	@RequestMapping("alteraTreino")
	public String execAlterarTreino(Treino treino) {
		
		try {
			regraTreino.remover(treino);
		} catch (SQLException e) {
			System.out.println("cheguei!!!cath inserir"+e.getMessage());
			e.printStackTrace();
		}
		return "redirect:listarTreino";
	}
	

}
