package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fitNet.model.Atendente;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.FuncionarioInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioFuncionario;
import br.com.fitNet.util.ValidarCPF;

@Service
public class RegrasFuncionarioServeice {

	@Autowired
	IRepositorioFuncionario repFuncionarioDao;

	public void incluir(Atendente atendente)
			throws SQLException, FuncionarioInvalidoException, NomeUsuarioInvalidoException, CPFInvalidoException {

		if (!ValidarCPF.validarCpf(atendente.getCpf())) {
			throw new CPFInvalidoException("Numero de CPF invalido!");
		} else {
			if (atendente.getAcesso().getUsuario().equals("") || atendente.getAcesso().getSenha().equals("")
					|| atendente.getEmail().equals("") || atendente.getNome().equals("")) {
				throw new FuncionarioInvalidoException("Campos não podem ser vazio!");
			} else {
				Set<Funcionario> listaFuncionarios = consultar();
				if (!listaFuncionarios.isEmpty()) {
					for (Funcionario atendenteDaLista : listaFuncionarios) {
						if (atendenteDaLista.getCpf().equals(atendente.getCpf())) {
							throw new FuncionarioInvalidoException("CPF já cadastrado para outro Funcionario!");
						}
						if (atendenteDaLista.getAcesso().getUsuario().equals(atendente.getAcesso().getUsuario())) {
							throw new NomeUsuarioInvalidoException("Nome de usário já existe. Tente outro!");
						}
					}
					repFuncionarioDao.incluir(atendente);

				} else {
					repFuncionarioDao.incluir(atendente);
				}
			}
		}
	}

	public void remover(int id) throws NullPointerException, SQLException {

		if (id <= 0)
			throw new NullPointerException();

		repFuncionarioDao.remover(id);
	}

	public void alterar(Funcionario funcionario) throws SQLException {

		repFuncionarioDao.alterar(funcionario);

	}
	
	public Set<Funcionario> consultar() throws SQLException {
		return repFuncionarioDao.consultar();
	}
	
	public Funcionario consultarPorId(int id) throws SQLException {
		return repFuncionarioDao.consultarPorId(id);
	}
	
	public Set<Funcionario> consultarPorNome(String nome) throws SQLException {
		return repFuncionarioDao.consultarPorNome(nome);
	}

	public Endereco consultarEndereco(String cep) {
		return null;

	}



}
