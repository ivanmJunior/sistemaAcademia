package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import br.com.fitNet.model.Cliente;
import br.com.fitNet.model.Endereco;
import br.com.fitNet.model.exception.ClienteInvalidoException;
import br.com.fitNet.model.percistence.ClienteDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioCliente;


public class RegrasClienteServeice{

	IRepositorioCliente repClienteDao = new ClienteDao();
	
	public void incluir(Cliente cliente) throws ClienteInvalidoException, SQLException{
	
		if(cliente.getAcesso().getUsuario().equals("")
				|| cliente.getAcesso().getSenha().equals("")
				|| cliente.getEmail().equals("")
				|| cliente.getNome().equals(""))
		{
			throw new ClienteInvalidoException("Campos não podem ser vazio!");
		}else{
			repClienteDao.incluir(cliente);
		}
	}
	
	public Integer getIdade(Date data) {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(data);
		Calendar dataAtual = Calendar.getInstance();
		Integer diferencaMes = dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
		Integer diferencaDia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
		Integer idade = (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));
		if(diferencaMes < 0	|| (diferencaMes == 0 && diferencaDia < 0)) {
			idade--;
		}
		return idade;
	}
	
	public void remover(int idCliente) throws NullPointerException, SQLException{
			
		if(idCliente <= 0)	
			throw new NullPointerException();
		
		repClienteDao.remover(idCliente);
	}
	
	public void alterar(Cliente Cliente) throws Exception{
		//Cliente ClienteConsultado = consultarClientePorId(Cliente.getId());
		repClienteDao.alterar(Cliente);
		
	}
	
	public ArrayList<Cliente> consultar() throws SQLException{
		ArrayList<Cliente> ClientesDaConsulta = null;
		ClientesDaConsulta = repClienteDao.consultar();
		return ClientesDaConsulta;
	}
	
	public Endereco consultarEndereco(String cep) {
		return null;
		
	}
	

	
	public boolean verificarCliente(Cliente cliente) {
		return false;
		
	}
	
	public int consultarUltimoIdCliente() throws SQLException{
		return repClienteDao.consultarAutoIncremento();
	}
	
	public String carregarNumeroMatricula() throws SQLException{
		return repClienteDao.gerarNumeroMatricula();
	}
	
	public int carregarIdContrato() throws SQLException{
		return repClienteDao.consultarAutoIncrementoContrato();
	}
	
	public Cliente consultarClientePorId(int idCliente) {
		
		
		return null;
	}
	
	public Set<Cliente> consultarClientesPorNome(String nomeCliente) {
		return null;
		
	}
	
	public Cliente consultarClientePorMatricula(int matricula) {
		return null;
		
	}
	
	public Set<Cliente> consultarClienteParaPagamento() {
		return null;
		
	}

}
