package br.com.fitNet.controller;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.exception.CampoVazioException;
import br.com.fitNet.model.exception.ModalidadeInvalidoException;
import br.com.fitNet.model.service.RegrasModalidadeServeice;
import br.com.fitNet.util.Mensagens;

@Transactional
@Controller
public class ModalidadeController {
	
	Mensagens msg = new Mensagens();
	
	@Autowired
	RegrasModalidadeServeice regraModalidade;
	
	@RequestMapping("novaModalidade")
	public String execNovaModalidades(){
		return "modalidade/novaModalidade";
	}
	
	@RequestMapping("adicionaModalidades")
	public String execInserirModalidades(Modalidade modalidade){
		
		modalidade.setIdUsuarioCadastro(1);//provisório
		modalidade.setIdUsuarioAlteracao(1);//provisório
		modalidade.getDataCadastro().setTime(new Date());
		modalidade.setDescricao(modalidade.getDescricao().toUpperCase());
		try {
			regraModalidade.incluir(modalidade);
		
		} catch (CampoVazioException | SQLException | ModalidadeInvalidoException e) {
			msg.setMensagemErro("Erro na Inclusão! "+e.getMessage());
			return "redirect:mostraMensagemModalidade";
		}
		return "redirect:listarModalidades";
	}
	
	@RequestMapping("listarModalidades")
	public String execListarModalidades(Model modelo){
		
		try {
			modelo.addAttribute("listaModalidades", regraModalidade.consultar());
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
			modelo.addAttribute("modalidade", modalidadeDaConsulta);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "modalidade/editarModalidade";
	}
	
	@RequestMapping("editarModalidade")
	public String execEditarModalidades(Modalidade modalidade){
			
		try {
			modalidade.getDataAlteracao().setTime(new Date());
			modalidade.setDescricao(modalidade.getDescricao().toUpperCase());
			regraModalidade.alterar(modalidade);
			
		} catch (Exception e) {
				msg.setMensagemErro("Erro ao Alterar! " + e.getMessage());
				return "redirect:mostraMensagemModalidade";
			}
		
		return "redirect:listarModalidades";
	}
	
	@RequestMapping("filtrarTelaModalidade")
	public String execCarregarFiltrar(String descricao, Model modelo){
		
		try {
			descricao = descricao.toUpperCase();
			modelo.addAttribute("listaModalidades", regraModalidade.consultarPorDescricao(descricao));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "modalidade/modalidades";
	}
	
	//Mensagens
	@RequestMapping("mostraMensagemModalidade")
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
	
	}  //Fim Mensagens
	
}
