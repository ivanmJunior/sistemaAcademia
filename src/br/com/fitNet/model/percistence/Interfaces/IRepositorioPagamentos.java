package br.com.fitNet.model.percistence.Interfaces;

import java.sql.SQLException;
import java.util.Set;

import br.com.fitNet.model.PagamentoAluno;


public interface IRepositorioPagamentos {
	
	void inserirPagamentoAluno(PagamentoAluno pgAluno) throws SQLException;
	Set<PagamentoAluno> consultarPagamentosAlunos() throws SQLException;
}
