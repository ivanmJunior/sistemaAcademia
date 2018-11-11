package br.com.fitNet.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.exception.UsuarioInexistenteException;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioAcesso;

@Service
public class RegrasAcesso {

	@Autowired
	IRepositorioAcesso repAcessoDao;
	
	public Acesso consultarAcessoFuncionario(Acesso acesso) throws SQLException, UsuarioInexistenteException{
		Acesso acessoDaConsulta = null;
		
		if(acesso != null){
			acessoDaConsulta = repAcessoDao.consultarAcesso(acesso);
		}
		
		if(acessoDaConsulta == null || acessoDaConsulta.getIdFuncionario() < 0){
			throw new UsuarioInexistenteException("Usuário ou senha incorretos! Volte e tente novamente.");
		}
		
		return acessoDaConsulta;
	}
	
	public Acesso consultarAcessoCliente(Acesso acesso) throws SQLException, UsuarioInexistenteException{
		Acesso acessoDaConsulta = null;
		
		if(acesso != null){
			acessoDaConsulta = repAcessoDao.consultarAcesso(acesso);
		}
		
		if(acessoDaConsulta == null || acessoDaConsulta.getIdCliente() < 0){
			throw new UsuarioInexistenteException("Usuário ou senha incorretos! Volte e tente novamente.");
		}
		
		return acessoDaConsulta;
	}
}
