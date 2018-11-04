package br.com.fitNet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcessoController {
	
	@RequestMapping("logarSistema")
	public String execEfetuarLogin(){
		return "logadoSistema";
	}

}
