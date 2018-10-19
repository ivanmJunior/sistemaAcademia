package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioFuncionario;

public class FuncionarioDao implements IRepositorioFuncionario {

	public static Set<Funcionario> LISTA_FUNCIONARIOS = new LinkedHashSet<>();

	@Override
	public Set<Funcionario> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return LISTA_FUNCIONARIOS;
	}

	@Override
	public void incluirAcesso(Acesso acesso) throws SQLException {
		
		
	}

	@Override
	public void incluir(Funcionario funcionario) {
		LISTA_FUNCIONARIOS.add(funcionario);
		System.out.println("adicionado");
		
	}

	@Override
	public void alterar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarAcesso(Acesso acesso) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAcesso(int idAcesso) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Acesso consultarAcesso(Acesso acesso) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acesso consultarAcessoPorUsuario(String usuario) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acesso consultarAcessoPorId(int idAcesso) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Acesso> consultarTodosAcessos() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Funcionario funcionario) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario consultarPorId(int id) throws SQLException {
		Funcionario funcionarioRetorno = null;
		
		for(Funcionario funcionarioDaConsulta : LISTA_FUNCIONARIOS){
			if(funcionarioDaConsulta.getId() == id){
				funcionarioRetorno = funcionarioDaConsulta;
			}
		}
		
		return funcionarioRetorno;
	}

}
