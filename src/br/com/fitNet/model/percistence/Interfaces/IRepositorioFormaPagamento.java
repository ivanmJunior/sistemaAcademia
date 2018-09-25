package br.com.fitNet.model.percistence.Interfaces;
import java.sql.SQLException;

import br.com.fitNet.model.FormaPagamento;

public interface IRepositorioFormaPagamento {
	FormaPagamento consultarFormaPagamento(String nomeFormaPagamento) throws SQLException;
}
