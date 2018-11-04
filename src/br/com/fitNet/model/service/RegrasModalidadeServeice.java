package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.exception.CampoVazioException;
import br.com.fitNet.model.exception.ModalidadeInvalidoException;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioModalidade;

@Service
public class RegrasModalidadeServeice{

	@Autowired
	IRepositorioModalidade repModalidadeDao;
	
	public void incluir(Modalidade modalidade) throws CampoVazioException, SQLException, ModalidadeInvalidoException{
	
		if(modalidade.getDescricao().equals("")){
			throw new CampoVazioException("Campos não podem ser vazio!");
		
		}else if(existeDescricaoModalidade(modalidade.getDescricao())){
			throw new ModalidadeInvalidoException("Descrição já existe para outra modalidade cadastrada!");
			
		}else{
			repModalidadeDao.incluir(modalidade);
		}
	}
	
	public void remover(Modalidade modalidade) throws NullPointerException, SQLException{
			
		if(modalidade.getIdModalidade() <= 0){
			throw new NullPointerException();
		}else{
			
			repModalidadeDao.remover(modalidade);
		}
	}
	public void alterar(Modalidade modalidade) throws Exception{
		
		repModalidadeDao.alterar(modalidade);
		
	}
	
	public List<Modalidade> consultar() throws SQLException{
	
		return repModalidadeDao.consultar();
	}
	
	public Modalidade consultar(Modalidade modalidade) throws SQLException{
		Modalidade modalidadeRetorno = null;
		for(Modalidade modalidadeDaConsulta : repModalidadeDao.consultar()){
			if(modalidade.getIdModalidade() == modalidadeDaConsulta.getIdModalidade()){
				modalidadeRetorno = modalidadeDaConsulta;
			}
		}
		return modalidadeRetorno;
	}

	public Modalidade consultarPorId(int id) throws SQLException{
		Modalidade modalidadeRetorno = null;
		for(Modalidade modalidadeDaConsulta : repModalidadeDao.consultar()){
			if(id == modalidadeDaConsulta.getIdModalidade()){
				modalidadeRetorno = modalidadeDaConsulta;
			}
		}
		return modalidadeRetorno;
	
	}
	
	public List<Modalidade> consultarPorDescricao(String descricao) throws SQLException{
		return repModalidadeDao.consultarParteDescricao(descricao);
	}
	
	public boolean existeDescricaoModalidade(String descricao) throws SQLException{
		Modalidade modalidadeDaConsulta = repModalidadeDao.consultarModalidade(descricao);
		if(modalidadeDaConsulta != null){
			return true;
		}else{
			return false;
		}
	}


}
