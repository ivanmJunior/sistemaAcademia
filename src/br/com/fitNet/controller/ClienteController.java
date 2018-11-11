package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.exception.SenhaInvalidaException;
import br.com.fitNet.model.service.RegrasClienteServeice;
import br.com.fitNet.util.Mensagens;

@Controller
public class ClienteController {

	static int ID = 0; //Provisório, apenas para testes.
	Mensagens msg = new Mensagens();
	
	@Autowired
	RegrasClienteServeice regraCliente;
	
	@RequestMapping("adicionaClientes")
	public String execInserirCliente(Cliente cliente){
		ID++;
		cliente.setId(ID);
		cliente.getDataCadastro().setTime(new Date());
		cliente.getDataAlteracao().setTime(new Date());
		cliente.setNome(cliente.getNome().toUpperCase());
		//criando provisóriamente a matricula
		String matricula = ID +""+cliente.getDataCadastro().get(Calendar.YEAR);
		cliente.getMatricula().setNumeroMatricula(Integer.parseInt(matricula));
		
		try {
			regraCliente.incluir(cliente);
		} catch (ClienteInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException | SenhaInvalidaException e) {
			msg.setMensagemErro("Erro ao cadastrar! "+e.getMessage());
			return "redirect:mostraMensagemCliente";
		}
		return "redirect:listarClientes";
	}
	
	@RequestMapping("listarClientes")
	public String execListarCliente(Model modelo){
		
		try {
			Set<Cliente> listaClientes = regraCliente.consultar();
			modelo.addAttribute("clientes", listaClientes);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cliente/clientes";
	}
	
	@RequestMapping("formCliente")
	public String execFonrmCliente(){
		return "cliente/novoClienteSistema";
	}
	
	@RequestMapping("adicionaClientesUsuario")
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
		} catch (ClienteInvalidoException | SQLException | NomeUsuarioInvalidoException | CPFInvalidoException | SenhaInvalidaException e) {
			msg.setMensagemErro("Erro ao cadastrar! "+e.getMessage());
		}
		return "redirect:mostraMensagemCliente";
	}
	
	@RequestMapping("mostraMensagemCliente")
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
		
	}
	
	@RequestMapping("removeCliente")
	public String execRemoverCliente(Cliente cliente){
		
		try {
			regraCliente.remover(cliente);
		} catch (SQLException e) {
			msg.setMensagemErro("Erro ao remover! "+e.getMessage());
			return "redirect:mostraMensagemCliente";
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
			msg.setMensagemErro("Erro! "+e.getMessage());
			return "redirect:mostraMensagemCliente";
		}
		
		return "cliente/editarClienteSistema";
	}
	
	@RequestMapping("editarCliente")
	public String execEditarCliente(Cliente cliente){
			
		try {
			cliente.setNome(cliente.getNome().toUpperCase());
			regraCliente.alterar(cliente);
			} catch (Exception e) {
				msg.setMensagemErro("Erro! "+e.getMessage());
				return "redirect:mostraMensagemCliente";
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
			msg.setMensagemErro("Erro! "+e.getMessage());
			return "redirect:mostraMensagemCliente";
		}
		
		return "cliente/clientes";
	}
	
	
}
