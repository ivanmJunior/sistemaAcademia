package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.fitNet.model.Atendente;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.Nutricionista;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.FuncionarioInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.percistence.FuncionarioDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioFuncionario;
import br.com.fitNet.util.ValidarCPF;

@Service
public class RegrasNutricionistaServeice {

	
	IRepositorioFuncionario repFuncionarioDao = new FuncionarioDao();

	public void incluir(Nutricionista nutricionista)
			throws SQLException, FuncionarioInvalidoException, NomeUsuarioInvalidoException, CPFInvalidoException {

		if (!ValidarCPF.validarCpf(nutricionista.getCpf())) {
			throw new CPFInvalidoException("Numero de CPF invalido!");
		} else {
			if (nutricionista.getAcesso().getUsuario().equals("") || nutricionista.getAcesso().getSenha().equals("")
					|| nutricionista.getEmail().equals("") || nutricionista.getNome().equals("")) {
				throw new FuncionarioInvalidoException("Campos não podem ser vazio!");
			} else {
				Set<Funcionario> listaNutricionista = consultar();
				if (!listaNutricionista.isEmpty()) {
					for (Funcionario nutricionistaDaLista : listaNutricionista) {
						if (nutricionistaDaLista.getCpf().equals(nutricionista.getCpf())) {
							throw new FuncionarioInvalidoException("CPF já cadastrado para outro Funcionário!");
						}
						if (nutricionistaDaLista.getAcesso().getUsuario().equals(nutricionista.getAcesso().getUsuario())) {
							throw new NomeUsuarioInvalidoException("Nome de usário já existe. Tente outro!");
						}
					}
					repFuncionarioDao.incluir(nutricionista);

				} else {
					repFuncionarioDao.incluir(nutricionista);
				}
			}
		}
	}


	public void alterar(Atendente nutricionista) throws SQLException {

		repFuncionarioDao.alterar(nutricionista);

	}

	public Set<Atendente> consultarNutricionista() throws SQLException {
		return null;
	}
	
	public Set<Funcionario> consultar() throws SQLException {
		return repFuncionarioDao.consultar();
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
