package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Treino;

public interface IRepositorioTreino {
	
	void incluir(Treino treino) throws SQLException;
	void alterar(Treino treino) throws SQLException;
	void remover(Treino treino) throws SQLException;
	Set<Treino> consultar() throws SQLException;


}
