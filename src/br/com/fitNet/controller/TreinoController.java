package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Instrutor;
import br.com.fitNet.model.Treino;
import br.com.fitNet.model.exception.TreinoInvalidoException;
import br.com.fitNet.model.service.RegrasInstrutorServeice;
//import org.springframework.web.servlet.ModelAndView;
import br.com.fitNet.model.service.RegrasTreinoServeice;
import br.com.fitNet.util.Mensagens;


@Controller
public class TreinoController {

	@Autowired
	RegrasTreinoServeice regraTreino;
	
	@Autowired
	RegrasInstrutorServeice regraIntrutor;
	Mensagens msg = new Mensagens();
	
	
	@RequestMapping("areaClienteTreino")
	public ModelAndView execAreaClienteTreino(){
		
		try {
			Set<Instrutor>listaInstrutores = regraIntrutor.consultarInstrutor();
			ModelAndView modelo = new ModelAndView("cliente/areaClienteTreino");
			modelo.addObject("listaInstrutores", listaInstrutores);
			return modelo;
		} catch (SQLException e) {
			msg.setMensagemErro("Erro ao Carregar Lista de Instrutor: "+e.getMessage());
			return execMensagens(msg);
		}
		
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
		return "cliente/areaDoClienteTreino";
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
	

	//Mensagens Treino
	@RequestMapping("mostraMensagemTreino")
	public ModelAndView execMensagens(){
		String paginaMensagem = "";
		
		if(!msg.getMensagemSucesso().equals("")){
			paginaMensagem = "/mensagemSucesso";
		}else{
			paginaMensagem = "/mensagemErro";
		}
		
		ModelAndView modelo = new ModelAndView(paginaMensagem);
		modelo.addObject("msg", msg);
		return modelo;
	
	}  //Fim Mensagens Treinos
	
	
	public ModelAndView execMensagens(Mensagens msg){
		String paginaMensagem = "";
		
		if(!msg.getMensagemSucesso().equals("")){
			paginaMensagem = "/mensagemSucesso";
		}else{
			paginaMensagem = "/mensagemErro";
		}
		
		ModelAndView modelo = new ModelAndView(paginaMensagem);
		modelo.addObject("msg", msg);
		return modelo;
	}
	
	
	public void execCarregaEspecialidadesInstrutor(int id){
		
	}
}
