package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.exception.CPFInvalidoException;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.exception.NomeUsuarioInvalidoException;
import br.com.fitNet.model.exception.SenhaInvalidaException;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioCliente;
import br.com.fitNet.util.ValidarCPF;

@Service
public class RegrasClienteServeice {

	@Autowired
	IRepositorioCliente repClienteDao;

	public void incluir(Cliente cliente)
			throws SQLException, ClienteInvalidoException, NomeUsuarioInvalidoException, CPFInvalidoException, SenhaInvalidaException {

		if(!cliente.getAcesso().getSenha().equals(cliente.getAcesso().getConfirmarSenha())){
			throw new SenhaInvalidaException("Senhas invalidas! Senhas Diferem.");
		}
		if (!ValidarCPF.validarCpf(cliente.getCpf())) {
			throw new CPFInvalidoException("Numero de CPF invalido!");
		} else {
			if (cliente.getAcesso().getUsuario().equals("") || cliente.getAcesso().getSenha().equals("")
					|| cliente.getEmail().equals("") || cliente.getNome().equals("")) {
				throw new ClienteInvalidoException("Campos não podem ser vazio!");
			} else {
				Set<Cliente> listaClientes = consultar();
				if (!listaClientes.isEmpty()) {
					for (Cliente clienteDaLista : listaClientes) {
						if (clienteDaLista.getCpf().equals(cliente.getCpf())) {
							throw new ClienteInvalidoException("CPF já cadastrado para outro cliente!");
						}
						if (clienteDaLista.getAcesso().getUsuario().equals(cliente.getAcesso().getUsuario())) {
							throw new NomeUsuarioInvalidoException("Nome de usário já existe. Tente outro!");
						}
					}
					repClienteDao.incluir(cliente);

				} else {
					repClienteDao.incluir(cliente);
				}
			}
		}
	}

	public Integer getIdade(Date data) {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(data);
		Calendar dataAtual = Calendar.getInstance();
		Integer diferencaMes = dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
		Integer diferencaDia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
		Integer idade = (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));
		if (diferencaMes < 0 || (diferencaMes == 0 && diferencaDia < 0)) {
			idade--;
		}
		return idade;
	}

	public void remover(Cliente cliente) throws NullPointerException, SQLException {

		if (cliente.getId() <= 0)
			throw new NullPointerException();

		repClienteDao.remover(cliente);
	}

	public void alterar(Cliente cliente) throws SQLException {

		repClienteDao.alterar(cliente);

	}

	public Set<Cliente> consultar() throws SQLException {
		return repClienteDao.consultar();
	}

	public Endereco consultarEndereco(String cep) {
		return null;

	}

	public boolean verificarCliente(Cliente cliente) {
		return false;

	}

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

	}

}
