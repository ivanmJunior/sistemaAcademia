package br.com.fitNet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("index")
	public String home() {
		return "index";
	}
	
	@RequestMapping("loginCorporativo")
	public String executarLoginCorporativo() {
		return "loginCorporativo";
	}
	
	@RequestMapping("loginCliente")
	public String executarLoginCliente() {
		return "cliente/login";
	}
	
	@RequestMapping("inscrevase")
	public String executarInscrevase() {
		return "cliente/inscrevase";
	}
	
	@RequestMapping("principalSistema")
	public String execEfetuarLogin(){
		return "/logadoSistema";
	}
}
