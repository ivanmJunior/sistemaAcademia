package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.exception.TreinoInvalidoException;
import br.com.fitNet.model.percistence.TreinoDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioTreino;

public class RegrasTreinoServeice{

	IRepositorioTreino repTreinoDao = new TreinoDao();
	
	public void incluir(Treino treino) throws TreinoInvalidoException, SQLException{
	
		if(treino.getInstrutor().getNome().equals(""))
		{
			throw new TreinoInvalidoException("Campos não podem ser vazio!");
		}else{
			repTreinoDao.incluir(treino);
		}
	}

	public ArrayList<Treino> consultar() throws SQLException {
		
		return repTreinoDao.consultar();
	}
	

}
