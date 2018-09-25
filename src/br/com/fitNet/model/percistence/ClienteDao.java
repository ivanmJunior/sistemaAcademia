package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.Contrato;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Matricula;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioCliente;

public class ClienteDao implements IRepositorioCliente{

	public static ArrayList<Cliente> LISTA_CLIENTE = new ArrayList<>();
	
	@Override
	public void incluir(Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		LISTA_CLIENTE.add(cliente);
	}

	@Override
	public void alterar(Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idAluno) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Cliente> consultar() throws SQLException {
		// TODO Auto-generated method stub
		return LISTA_CLIENTE;
	}

	@Override
	public Set<Cliente> consultarMatriculados() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> consultarAlunoParaPagamento() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> consultarNaoMatriculados() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incluirEnderecoAluno(Endereco endereco) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco consultarEndereco(String cep) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int consultarAutoIncremento() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int consultarAutoIncrementoMatricula() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int consultarAutoIncrementoContrato() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente consultarAlunoPorId(int idAluno) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> consultarAlunosPorNome(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente consultarAlunoPorMatricula(int matricula) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gerarNumeroMatricula() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incluirContrato(Contrato contrato) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incluirMatricula(Matricula matricula) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> consultarListaModalidadeAluno(int idContrato) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
