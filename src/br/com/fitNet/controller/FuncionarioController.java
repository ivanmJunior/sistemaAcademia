package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Atendente;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.Instrutor;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.FuncionarioInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.service.RegrasAtendenteServeice;
import br.com.fitNet.model.service.RegrasFuncionarioServeice;
import br.com.fitNet.model.service.RegrasInstrutorServeice;
import br.com.fitNet.model.service.RegrasModalidadeServeice;
import br.com.fitNet.util.FuncaoConfig;
import br.com.fitNet.util.Mensagens;

@Controller
public class FuncionarioController {

	static int ID = 0; //Provisório, apenas para testes.
	Mensagens msg = new Mensagens();
	
	
	@Autowired
	RegrasAtendenteServeice regraAtendente;
	
	@Autowired
	RegrasInstrutorServeice regraInstrutor;
	
	@Autowired
	RegrasFuncionarioServeice regraFuncionario;
	
	@Autowired
	RegrasModalidadeServeice regraModalidade;
	
	static Set<String>ESPECIALIDADES = new LinkedHashSet<>();
	
	//Seleciona Função
	@RequestMapping("selecionaInserir")
	public ModelAndView selecionaFuncao(FuncaoConfig funcao){
		funcao.setFuncao(funcao.getFuncao().toUpperCase());	
		
			if(funcao.getFuncao().equals("RECEPCIONISTA")){
				funcao.setMetodo("adicionaAtendente");
			}else if(funcao.getFuncao().equals("INSTRUTOR")){
				try {
					funcao.setMetodo("adicionaInstrutor");
					funcao.setListaModalidades(regraModalidade.consultar());
				} catch (SQLException e) {
					msg.setMensagemErro("Erro: " +e.getMessage());
					return execMensagens(msg);
				}
			}else{
				msg.setMensagemErro("Selecione uma Função!");
				return execMensagens(msg);
			}
			
			ModelAndView modelo = new ModelAndView("funcionario/novoFuncionario");
			modelo.addObject("objetoFuncao", funcao);
			return modelo;
	
	}  //Fim Seleciona Função
	
	
	//Incluir Atendente
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
			e.printStackTrace();
			msg.setMensagemErro("Erro ao Incluir: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
			
		}
		return "redirect:listarFuncionarios";
	
	}  //Fim Incluir Atendente
	
	
	//Incluir Instrutor
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
			e.printStackTrace();
			msg.setMensagemErro("Erro ao Incluir: " +e.getMessage());
			return "redirect:mostraMensagemFuncionario";
			
		}
		return "redirect:listarFuncionarios";
	
	}  //Fim incluir instrutor
	
	
	//Listar Funcionários
	@RequestMapping("listarFuncionarios")
	public String execListarFuncionarios(Model modelo){
		
		try {
			Set<Funcionario> listaFuncionarios = regraFuncionario.consultar();
			modelo.addAttribute("listaFuncionarios", listaFuncionarios);
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	/*@RequestMapping("adicionaClientesUsuario")
	public String execInserirClienteUsuario(Cliente cliente){
		ID++;
		cliente.setId(ID);
		cliente.getDataCadastro().setTime(new Date());
		cliente.getDataAlteracao().setTime(new Date());
		cliente.setNome(cliente.getNome().toUpperCase());
		msg.setMensagemSucesso("");
		msg.setMensagemErro("");
		//criando provisóriamente a matricula
		String matricula = ID +""+cliente.getDataCadastro().get(Calendar.YEAR);
		cliente.getMatricula().setNumeroMatricula(Integer.parseInt(matricula));
		try {
			regraCliente.incluir(cliente);
			msg.setMensagemSucesso("Secesso! Seja Bem Vindo!");
		} catch (ClienteInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException e) {
			msg.setMensagemErro("Erro ao cadastrar! Erro: "+e.getMessage());
			e.printStackTrace();
		}
		return "redirect:mostraMensagem";
	}
	
	
	
	@RequestMapping("removeCliente")
	public String execRemoverCliente(Cliente cliente){
		
		try {
			regraCliente.remover(cliente);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "redirect:listarClientes";
	}
	
	@RequestMapping("carregarTelaCliente")
	public String execCarregarCliente(int id, Model modelo){
		
		try {
			Cliente clienteDaConsulta = regraCliente.consultarClientePorId(id);
			clienteDaConsulta.getDataAlteracao().setTime(new Date());
			modelo.addAttribute("cliente", clienteDaConsulta);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "cliente/editarClienteSistema";
	}
	
	@RequestMapping("editarCliente")
	public String execEditarCliente(Cliente cliente){
			
		try {
			cliente.setNome(cliente.getNome().toUpperCase());
			regraCliente.alterar(cliente);
			} catch (Exception e) {

				e.printStackTrace();
			}
		return "redirect:listarClientes";
	}
	
	@RequestMapping("filtrarTelaCliente")
	public String execCarregarFiltrar(String nome, Model modelo){
		
		try {
			nome = nome.toUpperCase();
			Set<Cliente>listaClientes = regraCliente.consultarClientesPorNome(nome);
			modelo.addAttribute("clientes", listaClientes);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "cliente/clientes";
	}*/
	
	
}
