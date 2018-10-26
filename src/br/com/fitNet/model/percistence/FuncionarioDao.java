package br.com.fitNet.model.percistence;

import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import br.com.fitNet.model.Acesso;
import br.com.fitNet.model.Funcionario;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioFuncionario;

@Repository
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
		System.out.println(funcionario.getEspecialidades().toString());
		
	}

	@Override
	public void alterar(Funcionario funcionario) {
		
		for(Funcionario funcionarioDaLista : LISTA_FUNCIONARIOS){
			if(funcionarioDaLista.getId() == funcionario.getId()){
				funcionarioDaLista.getAcesso().setSenha(funcionario.getAcesso().getSenha());
				funcionarioDaLista.setNome(funcionario.getNome());
				funcionarioDaLista.setCpf(funcionario.getCpf());
				funcionarioDaLista.setDataAlteracao(funcionario.getDataAlteracao());
				funcionarioDaLista.setDataNascimento(funcionario.getDataNascimento());
				funcionarioDaLista.setFone(funcionario.getFone());
				funcionarioDaLista.setFone2(funcionario.getFone2());
				funcionarioDaLista.setStatusAtivo(funcionario.isStatusAtivo());
				
				System.out.println("Alterado!!!");
				
			}
		}
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
	public void remover(int id) throws SQLException {
		for(Funcionario funcionarioDaConsulta : LISTA_FUNCIONARIOS){
			if(funcionarioDaConsulta.getId() == id){
				LISTA_FUNCIONARIOS.remove(funcionarioDaConsulta);
				break;
			}
		}
		
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

	@Override
	public Set<Funcionario> consultarPorNome(String nome) throws SQLException {
		Set<Funcionario>funcionariosRetorno = new LinkedHashSet<>();
		if(!nome.equals("")){
			for(Funcionario funcionarioDaConsulta : LISTA_FUNCIONARIOS){
				if(funcionarioDaConsulta.getNome().contains(nome)){
					funcionariosRetorno.add(funcionarioDaConsulta);
				}
			}
			return funcionariosRetorno;
		}else{
			return LISTA_FUNCIONARIOS;
		}
	}
}
