package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.Instrutor;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.FuncionarioInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.percistence.FuncionarioDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioFuncionario;
import br.com.fitNet.util.ValidarCPF;

@Service
public class RegrasInstrutorServeice {

	
	IRepositorioFuncionario repFuncionarioDao = new FuncionarioDao();

	public void incluir(Instrutor instrutor)
			throws SQLException, FuncionarioInvalidoException, NomeUsuarioInvalidoException, CPFInvalidoException {

		if (!ValidarCPF.validarCpf(instrutor.getCpf())) {
			throw new CPFInvalidoException("Numero de CPF invalido!");
		} else {
			if (instrutor.getAcesso().getUsuario().equals("") || instrutor.getAcesso().getSenha().equals("")
					|| instrutor.getEmail().equals("") || instrutor.getNome().equals("")) {
				throw new FuncionarioInvalidoException("Campos n�o podem ser vazio!");
			} else {
				Set<Funcionario> listaInstrutores = consultar();
				if (!listaInstrutores.isEmpty()) {
					for (Funcionario instrutorDaLista : listaInstrutores) {
						if (instrutorDaLista.getCpf().equals(instrutor.getCpf())) {
							throw new FuncionarioInvalidoException("CPF j� cadastrado para outro Funcion�rio!");
						}
						if (instrutorDaLista.getAcesso().getUsuario().equals(instrutor.getAcesso().getUsuario())) {
							throw new NomeUsuarioInvalidoException("Nome de us�rio j� existe. Tente outro!");
						}
					}
					repFuncionarioDao.incluir(instrutor);

				} else {
					repFuncionarioDao.incluir(instrutor);
				}
			}
		}
	}

	public void alterar(Instrutor instrutor) throws SQLException {

		repFuncionarioDao.alterar(instrutor);

	}

	public Set<Funcionario> consultar() throws SQLException {
		return repFuncionarioDao.consultar();
	}


	public Set<Instrutor> consultarInstrutor() throws SQLException{
		Set<Instrutor>listaInstrutores = new LinkedHashSet<>(); 
		
		for(Funcionario funcionarioDaConsulta : consultar()){
			if(funcionarioDaConsulta.getFuncao().equals("INSTRUTOR")){
				listaInstrutores.add((Instrutor) funcionarioDaConsulta);
			}
		}
		return listaInstrutores;
	}
	
	public Endereco consultarEndereco(String cep) {
		return null;

	}

/*
	public int consultarUltimoIdCliente() throws SQLException {
		return repClienteDao.consultarAutoIncremento();
	}

	public String carregarNumeroMatricula() throws SQLException {
		return repClienteDao.gerarNumeroMatricula();
	}

	public int carregarIdContrato() throws SQLException {
		return repClienteDao.consultarAutoIncrementoContrato();
	}

	public Cliente consultarClientePorId(int idCliente) throws SQLException {

		return repClienteDao.consultarClientePorId(idCliente);
	}

	public Set<Cliente> consultarClientesPorNome(String nomeCliente) throws SQLException {
		return repClienteDao.consultarClientePorNome(nomeCliente);

	}

	public Cliente consultarClientePorMatricula(int matricula) {
		return null;

	}

	public Set<Cliente> consultarClienteParaPagamento() {
		return null;

	}*/

}
