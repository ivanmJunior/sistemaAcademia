package br.com.fitNet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Planos {
	
	@RequestMapping("active")
	public String execEfetuarActive(){
		return "planos/active";
	}
	
	@RequestMapping("pro")
	public String execEfetuarPro(){
		return "planos/pro";
	}

	@RequestMapping("proPlus")
	public String execEfetuarProPlus(){
		return "planos/proPlus";
	}
	
}
