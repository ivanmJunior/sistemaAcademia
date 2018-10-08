package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.Contrato;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Matricula;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioCliente;

public class ClienteDao implements IRepositorioCliente{

	public static Set<Cliente> LISTA_CLIENTE = new LinkedHashSet<>();
	
	@Override
	public void incluir(Cliente cliente) throws SQLException {
		
		LISTA_CLIENTE.add(cliente);
	}

	@Override
	public void alterar(Cliente cliente) throws SQLException {

		for(Cliente clienteDaLista : LISTA_CLIENTE){
			if(clienteDaLista.getId() == cliente.getId()){
				clienteDaLista.getAcesso().setSenha(cliente.getAcesso().getSenha());
				clienteDaLista.setNome(cliente.getNome());
				clienteDaLista.setCpf(cliente.getCpf());
				clienteDaLista.setDataAlteracao(cliente.getDataAlteracao());
				clienteDaLista.setDataNascimento(cliente.getDataNascimento());
				clienteDaLista.setFone(cliente.getFone());
				clienteDaLista.setFone2(cliente.getFone2());
				clienteDaLista.setStatusAtivo(cliente.isStatusAtivo());
				
				LISTA_CLIENTE.add(clienteDaLista);
			}
		}
	}

	@Override
	public void remover(Cliente cliente) throws SQLException {
		
		for(Cliente clienteDaConsulta : LISTA_CLIENTE){
			if(clienteDaConsulta.getId() == clienteDaConsulta.getId()){
				LISTA_CLIENTE.remove(clienteDaConsulta);
				break;
			}
		}
		
	}

	@Override
	public Set<Cliente> consultar() throws SQLException {
		return LISTA_CLIENTE;
	}

	@Override
	public Set<Cliente> consultarMatriculados() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> consultarClienteParaPagamento() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> consultarNaoMatriculados() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incluirEnderecoCliente(Endereco endereco) throws SQLException {
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
	public Cliente consultarClientePorId(int idCliente) throws SQLException {
		Cliente clienteRetorno = null;
		for(Cliente clienteDaConsulta : LISTA_CLIENTE){
			if(clienteDaConsulta.getId() == idCliente){
				clienteRetorno = clienteDaConsulta;
			}
		}
		return clienteRetorno;
	}

	@Override
	public Set<Cliente> consultarClientePorNome(String nome) throws SQLException {
		Set<Cliente>clientesRetorno = new LinkedHashSet<>();
			if(!nome.equals("")){
			for(Cliente clienteDaConsulta : LISTA_CLIENTE){
				if(clienteDaConsulta.getNome().contains(nome)){
					clientesRetorno.add(clienteDaConsulta);
				}
			}
			return clientesRetorno;
		}else{
			return LISTA_CLIENTE;
		}
	}

	@Override
	public Cliente consultarClientePorMatricula(int matricula) throws SQLException {
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
	public Set<String> consultarListaModalidadeCliente(int idContrato) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
