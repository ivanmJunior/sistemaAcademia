package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioTreino;

public class TreinoDao implements IRepositorioTreino{

	public static Set<Treino> LISTA_TREINO = new LinkedHashSet<Treino>();

	@Override
	public void incluir(Treino treino) throws SQLException {
		
		LISTA_TREINO.add(treino);
	}

	@Override
	public void alterar(Treino treino) throws SQLException {
		
		LISTA_TREINO.add(treino);
		
	}

	@Override
	public void remover(Treino treino) throws SQLException {
		LISTA_TREINO.remove(treino);
	
		System.out.println("Removido!! DAO");
	}

	@Override
	public Set<Treino> consultar() throws SQLException {
		
		return LISTA_TREINO;
	}
	
	

}
