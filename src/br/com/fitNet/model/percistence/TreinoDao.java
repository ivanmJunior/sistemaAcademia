package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioTreino;

public class TreinoDao implements IRepositorioTreino{

	public static ArrayList<Treino> LISTA_TREINO = new ArrayList<>();

	@Override
	public void incluir(Treino treino) throws SQLException {
		
		LISTA_TREINO.add(treino);
	}

	@Override
	public void alterar(Treino treino) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Treino treino) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Treino> consultar() throws SQLException {
		
		return LISTA_TREINO;
	}
	
	

}
