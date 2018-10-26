package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import br.com.fitNet.model.Modalidade;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioModalidade;
@Repository
public class ModalidadeDao implements IRepositorioModalidade {

	public static Set<Modalidade> LISTA_MODALIDADE = new LinkedHashSet<>();
	
	@Override
	public void incluir(Modalidade modalidade) throws SQLException {
		
		LISTA_MODALIDADE.add(modalidade);

	}

	@Override
	public Set<Modalidade> consultar() throws SQLException {
		
		return LISTA_MODALIDADE;
	}

	@Override
	public void removerDefinitivo(Modalidade modalidade) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Modalidade modalidade) throws SQLException {
		
		for(Modalidade modalidadeDaConsulta : LISTA_MODALIDADE){
		
			if(modalidadeDaConsulta.getIdModalidade() == modalidade.getIdModalidade()){
				
				LISTA_MODALIDADE.remove(modalidadeDaConsulta);
				break;
			}
		}
	}

	@Override
	public void alterar(Modalidade modalidade) throws SQLException {
		
		for(Modalidade modalidadeDaLista : LISTA_MODALIDADE){
			if(modalidadeDaLista.getIdModalidade() == modalidade.getIdModalidade()){
				LISTA_MODALIDADE.remove(modalidadeDaLista);
				LISTA_MODALIDADE.add(modalidade);
				break;
			}
		}
	}

	@Override
	public int consultaAutoIncremento() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Modalidade consultarModalidade(Modalidade modalidade) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidade consultarModalidade(String modalidade) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidade consultarPorId(int idModalidade) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Modalidade> consultarPorDescricao(String descricao) throws SQLException {
		Set<Modalidade>listaModalidadeRetorno = new LinkedHashSet<>();
		if(!descricao.equals("")){
			for(Modalidade modalidadeDaConsulta : LISTA_MODALIDADE){
				if(modalidadeDaConsulta.getDescricao().contains(descricao)){
					listaModalidadeRetorno.add(modalidadeDaConsulta);
				}
			}
			return listaModalidadeRetorno;
		}else{
			return LISTA_MODALIDADE;
		}
	}

}
