package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioAcesso;

@Repository
public class AcessoDao implements IRepositorioAcesso {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void incluir(Acesso acesso) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar(Acesso acesso) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Acesso acesso) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Acesso> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acesso consultarAcesso(Acesso acesso) throws SQLException {
		Acesso acessoDaConsulta = new Acesso();
		try{
			acessoDaConsulta = (Acesso) 
					manager.createQuery("select a from Acesso as a where a.usuario = '" + acesso.getUsuario() +
							"' and a.senha = '" + acesso.getSenha() + "'")
					.getSingleResult();
		
		}catch (NoResultException e){
			acessoDaConsulta = null;
			}
		return acessoDaConsulta;
	}

}
