package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.List;

import br.com.fitNet.model.Modalidade;


public interface IRepositorioModalidade {

	void incluir(Modalidade modalidade) throws SQLException;
	List<Modalidade> consultar()throws SQLException;
	void removerDefinitivo(Modalidade modalidade) throws SQLException;
	void remover(Modalidade modalidade) throws SQLException;
	void alterar(Modalidade modalidade) throws SQLException;
	int consultaAutoIncremento() throws SQLException;
	Modalidade consultarModalidade(Modalidade modalidade) throws SQLException;
	Modalidade consultarModalidade(String modalidade) throws SQLException;
	Modalidade consultarPorId(int idModalidade) throws SQLException;
	List<Modalidade> consultarParteDescricao(String descricaoModalidade) throws SQLException;
}
