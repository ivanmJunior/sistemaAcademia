package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Acesso;

public interface IRepositorioAcesso {

	void incluir(Acesso acesso) throws SQLException;
	void alterar(Acesso acesso) throws SQLException;
	void remover(Acesso acesso) throws SQLException;
	Set<Acesso> consultar() throws SQLException;
	Acesso consultarAcesso(Acesso acesso) throws SQLException;
}
