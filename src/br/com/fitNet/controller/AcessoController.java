package br.com.fitNet.controller;


import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.exception.UsuarioInexistenteException;
import br.com.fitNet.model.service.RegrasAcesso;
import br.com.fitNet.util.Mensagens;

@Transactional
@Controller
public class AcessoController {
	
	Mensagens msg = new Mensagens();
	
	@Autowired
	RegrasAcesso regraAcesso;
	
	@RequestMapping("formLoginCorporativo")
	public String abrirFormLoginCorporativo() {
		return "loginCorporativo";
	}
	
	@RequestMapping("logarSistema")
	public String execEfetuarLogin(Acesso acesso, HttpSession session){

		try {
			Acesso acessoDaConsulta = regraAcesso.consultarAcessoFuncionario(acesso);
			session.setAttribute("usuarioLogado", acessoDaConsulta);
		
		} catch (SQLException | UsuarioInexistenteException e) {
			msg.setMensagemErro("Erro ao Logar! "+e.getMessage());
			return "redirect:mostraMensagemAcesso";
		}
		return "logadoSistema";
	}
	
	@RequestMapping("telaPrincipalSistema")
	public String abrirTelaPrincipal(){
		return "logadoSistema";
	}
	
	@RequestMapping("formLoginCliente")
	public String abrirFormLoginCliente() {
		return "cliente/loginCliente";
	}
	
	@RequestMapping("areaClienteLogado")
	public String abrirClienteLogado() {
		return "cliente/areaDoCliente";
	}
	
	@RequestMapping("logarNaAreaDoCLiente")
	public String efetuarLoginCliente(Acesso acesso, HttpSession session) {
		
		try {
			Acesso acessoDaConsulta = regraAcesso.consultarAcessoCliente(acesso);
			session.setAttribute("usuarioLogado", acessoDaConsulta);
		
		} catch (SQLException | UsuarioInexistenteException e) {
			msg.setMensagemErro("Erro ao Logar! "+e.getMessage());
			return "redirect:mostraMensagemAcesso";
		}
		return "cliente/areaDoCliente";
		
	}
	
	@RequestMapping("logoutSistema")
	public String logout(HttpSession session) {
	  session.invalidate();
	  return "redirect:formLoginCorporativo";
	}
	
	@RequestMapping("logoutCliente")
	public String logoutCliente(HttpSession session) {
	  session.invalidate();
	  return "redirect:formLoginCliente";
	}
	
	//Mensagens
	@RequestMapping("mostraMensagemAcesso")
	public ModelAndView execMensagens(){
		String paginaMensagem = "";
		
		if(!msg.getMensagemSucesso().equals("")){
			paginaMensagem = "/mensagemSucesso";
		}else if(!msg.getMensagemErro().equals("")){
			paginaMensagem = "/mensagemErro";
		}else{
			msg.setMensagemErro("Acesso não permitido!");
			paginaMensagem = "/mensagemErro";
		}
		
		ModelAndView modelo = new ModelAndView(paginaMensagem);
		modelo.addObject("msg", msg);
		return modelo;
	
	}  //Fim Mensagens

}
