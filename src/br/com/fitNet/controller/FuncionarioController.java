package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Atendente;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.Instrutor;
import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.Nutricionista;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.FuncionarioInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.service.RegrasAtendenteServeice;
import br.com.fitNet.model.service.RegrasFuncionarioServeice;
import br.com.fitNet.model.service.RegrasInstrutorServeice;
import br.com.fitNet.model.service.RegrasModalidadeServeice;
import br.com.fitNet.model.service.RegrasNutricionistaServeice;
import br.com.fitNet.util.ConfigMetodo;
import br.com.fitNet.util.Mensagens;

@Controller
public class FuncionarioController {

	private static int ID = 0; //Provisório, apenas para testes.
	private Mensagens msg = new Mensagens();
	private static Set<String>ESPECIALIDADES = new LinkedHashSet<>();
	
	@Autowired
	RegrasAtendenteServeice regraAtendente;
	@Autowired
	RegrasInstrutorServeice regraInstrutor;
	@Autowired
	RegrasNutricionistaServeice regraNutricionista;
	@Autowired
	RegrasFuncionarioServeice regraFuncionario;
	@Autowired
	RegrasModalidadeServeice regraModalidade;
	
	
	//Seleciona Inserir
	@RequestMapping("selecionaInserir")
	public ModelAndView selecionaInserir(ConfigMetodo configMetodo){
		
		configMetodo.setFuncao(configMetodo.getFuncao().toUpperCase());	
		List<Modalidade> listaModalidades = null;
		
			if(configMetodo.getFuncao().equals("RECEPCIONISTA")){
				configMetodo.setMetodo("adicionaAtendente");
			}else if(configMetodo.getFuncao().equals("INSTRUTOR")){
				try {
					configMetodo.setMetodo("adicionaInstrutor");
					listaModalidades = regraModalidade.consultar();
				} catch (SQLException e) {
					msg.setMensagemErro("Erro: " +e.getMessage());
					return execMensagens(msg);
				}
			}else if(configMetodo.getFuncao().equals("NUTRICIONISTA")){
				configMetodo.setMetodo("adicionaNutricionista");
			}else{
				msg.setMensagemErro("Selecione uma Função!");
				return execMensagens(msg);
			}
			
			ModelAndView modelo = new ModelAndView("funcionario/novoFuncionario");
			modelo.addObject("objetoConfigMetodo", configMetodo);
			modelo.addObject("listaModalidades", listaModalidades);
			return modelo;
	
	}  //Fim Seleciona Inserir
	
	
	//Inserir Atendente
	@RequestMapping("adicionaAtendente")
	public String execInserirAtendente(Atendente atendente){
		ID++;
		atendente.setId(ID);
		atendente.getDataCadastro().setTime(new Date());
		atendente.getDataAlteracao().setTime(new Date());
		atendente.setNome(atendente.getNome().toUpperCase());
		
		try {
			regraAtendente.incluir(atendente);
		} catch (FuncionarioInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException e) {
			ID--;
			msg.setMensagemErro("Erro ao Incluir: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
			
		}
		return "redirect:listarFuncionarios";
	
	}  //Fim Inserir Atendente
	
	
	//Inserir Instrutor
	@RequestMapping("adicionaInstrutor")
	public String execInserirAtendente(Instrutor instrutor){
		ID++;
		instrutor.setId(ID);
		instrutor.getDataCadastro().setTime(new Date());
		instrutor.getDataAlteracao().setTime(new Date());
		instrutor.setNome(instrutor.getNome().toUpperCase());
		instrutor.setEspecialidades(ESPECIALIDADES);
		
		try {
			regraInstrutor.incluir(instrutor);
			ESPECIALIDADES.clear();
		} catch (FuncionarioInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException e) {
			ID--;
			msg.setMensagemErro("Erro ao Incluir: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
		}
		return "redirect:listarFuncionarios";
	
	}  //Fim Inserir instrutor
	
	
	//Inserir Nutricionista
	@RequestMapping("adicionaNutricionista")
	public String execInserirNutricionista(Nutricionista nutricionista){
		ID++;
		nutricionista.setId(ID);
		nutricionista.getDataCadastro().setTime(new Date());
		nutricionista.getDataAlteracao().setTime(new Date());
		nutricionista.setNome(nutricionista.getNome().toUpperCase());
		
		try {
			regraNutricionista.incluir(nutricionista);
		} catch (FuncionarioInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException e) {
			ID--;
			msg.setMensagemErro("Erro ao Incluir: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
			
		}
		return "redirect:listarFuncionarios";
	
	}  //Fim Inserir Nutricionista
	
	
	//Listar Funcionários
	@RequestMapping("listarFuncionarios")
	public String execListarFuncionarios(Model modelo){
		
		try {
			Set<Funcionario> listaFuncionarios = regraFuncionario.consultar();
			modelo.addAttribute("listaFuncionarios", listaFuncionarios);
		} catch (SQLException e) {
			msg.setMensagemErro("Erro: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
		}
		return "funcionario/funcionarios";
	
	}  //Fim Listar Funcionários
	
	
	//Formulário Funcionário
	@RequestMapping("formFuncionario")
	public String execFonrmFuncionario(){
		return "funcionario/novoFuncionario";
	
	}  //Fim Formulário Funcionário
	
	
	//Mensagens Funcionarios
	@RequestMapping("mostraMensagemFuncionario")
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
	
	}  //Fim Mensagens Funcionários
	
	@RequestMapping("passaMensagemFuncionario")
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
	
	@RequestMapping("adcionaEspecialidade")
	public void execAdcionaExpecialidade(String especialidades){
		especialidades = especialidades.toUpperCase();
		ESPECIALIDADES.add(especialidades);
		System.out.println(ESPECIALIDADES.toString());
	}
	
	@RequestMapping("removeEspecialidade")
	public void execRemoveExpecialidade(String especialidades){
		especialidades = especialidades.toUpperCase();
		ESPECIALIDADES.remove(especialidades);
		System.out.println(ESPECIALIDADES.toString());
	}
	
	@RequestMapping("limparListaEspecialidades")
	public void execLimparLista(){
		ESPECIALIDADES.clear();
		System.out.println(ESPECIALIDADES.toString());
	}
	
	
	@RequestMapping("removeFuncionario")
	public String execRemoverFuncionario(int id){
		
		try {
			regraFuncionario.remover(id);
		} catch (SQLException e) {
			msg.setMensagemErro("Erro ao remover: "+e.getMessage());
			return "redirect:mostraMensagemFuncionario";
		}
		
		return "redirect:listarFuncionarios";
	}
	
	
	@RequestMapping("carregarTelaFuncionario")
	public String execCarregarFuncionario(int id, Model modelo){
		ConfigMetodo configMetodo = new ConfigMetodo();
		try {
			Funcionario funcionarioDaConsulta = regraFuncionario.consultarPorId(id);
			
			
			if(funcionarioDaConsulta.getFuncao().equals("RECEPCIONISTA")){
				configMetodo.setMetodo("editarAtendente");
			
			}else if(funcionarioDaConsulta.getFuncao().equals("INSTRUTOR")){
				configMetodo.setMetodo("editarInstrutor");
				
			}else if(funcionarioDaConsulta.getFuncao().equals("NUTRICIONISTA")){
				configMetodo.setMetodo("editarNutricionista");
			}
			
			funcionarioDaConsulta.getDataAlteracao().setTime(new Date());
			modelo.addAttribute("funcionario", funcionarioDaConsulta);
			modelo.addAttribute("listaModalidades", regraModalidade.consultar());
			modelo.addAttribute("objetoConfigMetodo", configMetodo);
		} catch (SQLException e) {
			msg.setMensagemErro("Erro! "+e.getMessage());
			return "redirect:mostraMensagemFuncionario";
		}
		
		return "funcionario/editarFuncionario";
	}
	
	@RequestMapping("editarAtendente")
	public String execEditarAtendente(Atendente atendente){
			
		try {
			atendente.setNome(atendente.getNome().toUpperCase());
			regraFuncionario.alterar(atendente);
			} catch (Exception e) {
				msg.setMensagemErro("Erro! "+e.getMessage());
				return "redirect:mostraMensagemFuncionario";
			}
		return "redirect:listarFuncionarios";
	}
	
	@RequestMapping("editarInstrutor")
	public String execEditarInstrutor(Instrutor instrutor){
			
		try {
			instrutor.setNome(instrutor.getNome().toUpperCase());
			regraFuncionario.alterar(instrutor);
			} catch (Exception e) {
				msg.setMensagemErro("Erro! "+e.getMessage());
				return "redirect:mostraMensagemFuncionario";
			}
		return "redirect:listarFuncionarios";
	}
	
	@RequestMapping("editarNutricionista")
	public String execEditarNutricionista(Nutricionista nutricionista){
			
		try {
			nutricionista.setNome(nutricionista.getNome().toUpperCase());
			regraFuncionario.alterar(nutricionista);
			} catch (Exception e) {
				msg.setMensagemErro("Erro! "+e.getMessage());
				return "redirect:mostraMensagemFuncionario";
			}
		return "redirect:listarFuncionarios";
	}
	
	
	@RequestMapping("filtrarTelaFuncionario")
	public String execCarregarFiltrar(String nome, Model modelo){
		
		try {
			nome = nome.toUpperCase();
			Set<Funcionario>listaFuncionario = regraFuncionario.consultarPorNome(nome);
			modelo.addAttribute("listaFuncionarios", listaFuncionario);
		} catch (SQLException e) {
			msg.setMensagemErro("Erro! "+e.getMessage());
			return "redirect:mostraMensagemFuncionario";
		}
		
		return "funcionario/funcionarios";
	}
	
	
	public ModelAndView execCarregarModalidades(String paginaRetorno){
		List<Modalidade> listaModalidades = null;
		
		try {
			listaModalidades = regraModalidade.consultar();
		} catch (SQLException e) {
			msg.setMensagemErro("Erro! "+e.getMessage());
			return execMensagens(msg);
		}
		ModelAndView modelo = new ModelAndView(paginaRetorno);
		modelo.addObject("listaModalidades", listaModalidades);
		
		return modelo;
	}
	
}
