package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.percistence.ModalidadeDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioModalidade;


public class RegrasModalidadeServeice{

	IRepositorioModalidade repModalidadeDao = new ModalidadeDao();
	
	public void incluir(Modalidade modalidade) throws ClienteInvalidoException, SQLException{
	
		if(modalidade.getDescricao().equals(""))
		{
			throw new ClienteInvalidoException("Campos não podem ser vazio!");
		}else {
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
	
	public Set<Modalidade> consultar() throws SQLException{
	
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
	
	public Set<Modalidade> consultarPorDescricao(String descricao) throws SQLException{
		return repModalidadeDao.consultarPorDescricao(descricao);
	}


}
