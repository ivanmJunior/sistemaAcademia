package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.Funcionario;

public interface IRepositorioFuncionario {

	void incluirAcesso(Acesso acesso) throws SQLException;
	void incluir(Funcionario funcionario);
	void alterar(Funcionario funcionario);
	void remover(Funcionario funcionario) throws SQLException;
	void alterarAcesso(Acesso acesso) throws SQLException;
	void removerAcesso(int idAcesso) throws SQLException;
	Acesso consultarAcesso(Acesso acesso) throws SQLException;
	Acesso consultarAcessoPorUsuario(String usuario) throws SQLException;
	Acesso consultarAcessoPorId(int idAcesso) throws SQLException;
	Set<Acesso> consultarTodosAcessos() throws SQLException;
	Set<Funcionario> consultar()throws SQLException;
	Funcionario consultarPorId(int id)throws SQLException;
}
