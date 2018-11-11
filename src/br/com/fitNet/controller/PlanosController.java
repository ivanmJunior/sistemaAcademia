package br.com.fitNet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanosController {
	
	@RequestMapping("novoPlano")
	public String execFormCadastrarPlano(){
		return "planos/novoPlano";
	}
	
}
