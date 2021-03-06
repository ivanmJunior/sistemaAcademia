package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.Contrato;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Matricula;

public interface IRepositorioCliente {
	
	void incluir(Cliente cliente) throws SQLException;
	void alterar(Cliente cliente) throws SQLException;
	void remover(Cliente cliente) throws SQLException;
	Set<Cliente> consultar() throws SQLException;
	Set<Cliente> consultarMatriculados() throws SQLException;
	Set<Cliente> consultarClienteParaPagamento() throws SQLException;
	Set<Cliente> consultarNaoMatriculados() throws SQLException;
	void incluirEnderecoCliente(Endereco endereco) throws SQLException;
	Endereco consultarEndereco(String cep) throws SQLException;
	int consultarAutoIncremento() throws SQLException;
	int consultarAutoIncrementoMatricula() throws SQLException;
	int consultarAutoIncrementoContrato() throws SQLException;
	Cliente consultarClientePorId(int idCliente) throws SQLException;
	Set<Cliente> consultarClientePorNome(String nome) throws SQLException;
	Cliente consultarClientePorMatricula(int matricula) throws SQLException;
	String gerarNumeroMatricula() throws SQLException;
	void incluirContrato(Contrato contrato) throws SQLException;
	void incluirMatricula(Matricula matricula) throws SQLException;
	Set<String> consultarListaModalidadeCliente(int idContrato) throws SQLException;
}
