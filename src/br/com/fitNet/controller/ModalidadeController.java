package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.service.RegrasModalidadeServeice;

@Controller
public class ModalidadeController {
	static int ID = 1; //provisório. Apenas para testes.
	
	@Autowired
	RegrasModalidadeServeice regraModalidade;
	
	@RequestMapping("novaModalidade")
	public String execNovaModalidades(){
		return "modalidade/novaModalidade";
	}
	
	@RequestMapping("adicionaModalidades")
	public String execInserirModalidades(Modalidade modalidade){
		
		modalidade.setIdModalidade(ID++);
		modalidade.getDataCadastro().setTime(new Date());
		modalidade.setDescricao(modalidade.getDescricao().toUpperCase());
		try {
			regraModalidade.incluir(modalidade);
		} catch (ClienteInvalidoException | SQLException e) {
			ID--;
			e.printStackTrace();
		}
		return "redirect:listarModalidades";
	}
	
	@RequestMapping("listarModalidades")
	public String execListarModalidades(Model modelo){
		
		try {
			Set<Modalidade>listaModalidades = regraModalidade.consultar();
			modelo.addAttribute("listaModalidades", listaModalidades);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "modalidade/modalidades";
	}
	
	@RequestMapping("removeModalidade")
	public String execRemoverModalidades(Modalidade modalidade){
		
		try {
			regraModalidade.remover(modalidade);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "redirect:listarModalidades";
	}
	
	@RequestMapping("carregarTelaModalidade")
	public String execCarregarModalidades(int idModalidade, Model modelo){
		
		try {
			Modalidade modalidadeDaConsulta = regraModalidade.consultarPorId(idModalidade);
			modalidadeDaConsulta.getDataAlteracao().setTime(new Date());
			modelo.addAttribute("modalidade", modalidadeDaConsulta);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "modalidade/editarModalidade";
	}
	
	@RequestMapping("editarModalidade")
	public String execEditarModalidades(Modalidade modalidade){
			
		try {
			modalidade.setDescricao(modalidade.getDescricao().toUpperCase());
			regraModalidade.alterar(modalidade);
			} catch (Exception e) {

				e.printStackTrace();
			}
		
		return "redirect:listarModalidades";
	}
	
	@RequestMapping("filtrarTelaModalidade")
	public String execCarregarFiltrar(String descricao, Model modelo){
		
		try {
			descricao = descricao.toUpperCase();
			Set<Modalidade>listaModalidades = regraModalidade.consultarPorDescricao(descricao);
			modelo.addAttribute("listaModalidades", listaModalidades);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "modalidade/modalidades";
	}
	
	
}
