package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioModalidade;

@Repository
public class ModalidadeDao implements IRepositorioModalidade {

	public static Set<Modalidade> LISTA_MODALIDADE = new LinkedHashSet<>();
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void incluir(Modalidade modalidade) throws SQLException {
		manager.persist(modalidade);
	}

	@Override
	public List<Modalidade> consultar() throws SQLException {
		return manager.createQuery("select m from Modalidade m").getResultList();
	}

	@Override
	public void removerDefinitivo(Modalidade modalidade) throws SQLException {
		

	}

	@Override
	public void remover(Modalidade modalidade) throws SQLException {
		Modalidade modalidadeARemover = consultarPorId(modalidade.getIdModalidade());
		manager.remove(modalidadeARemover);
	}

	@Override
	public void alterar(Modalidade modalidade) throws SQLException {
		manager.merge(modalidade);
	}

	@Override
	public int consultaAutoIncremento() throws SQLException {
		
		return 0;
	}

	@Override
	public Modalidade consultarModalidade(Modalidade modalidade) throws SQLException {
		return null;
	}

	@Override
	public Modalidade consultarModalidade(String descricao) throws SQLException {
		Modalidade modalidadeDaConsulta = new Modalidade();
		try{
			modalidadeDaConsulta = (Modalidade) 
					manager.createQuery("select m from Modalidade as m where m.descricao = '" + descricao + "'")
					.getSingleResult();
		
		}catch (NoResultException e){
			modalidadeDaConsulta = null;
			}
		return modalidadeDaConsulta;
	}

	@Override
	public Modalidade consultarPorId(int idModalidade) throws SQLException {
		return manager.find(Modalidade.class, idModalidade);
	}

	
	@Override
	public List<Modalidade> consultarParteDescricao(String descricao) throws SQLException {
		
		List<Modalidade> listaModalidadeRetorno = 
			manager.createQuery("select m from Modalidade m where m.descricao like '%" + descricao + "%'")
			.getResultList();
		
		return listaModalidadeRetorno;
	}

}
