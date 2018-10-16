package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Atendente;

public interface IRepositorioAtendente {

	void incluir(Atendente atendente) throws SQLException;
	void alterar(Atendente atendente) throws SQLException;
	void remover(Atendente atendente) throws SQLException;
	Set<Atendente> consultar() throws SQLException;
}
