package br.com.fitNet.model.service;

import java.sql.SQLException;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.fitNet.model.Treino;
import br.com.fitNet.model.exception.TreinoInvalidoException;
import br.com.fitNet.model.percistence.TreinoDao;
import br.com.fitNet.model.percistence.Interfaces.IRepositorioTreino;
@Service
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

	public Set<Treino> consultar() throws SQLException {
		
		return repTreinoDao.consultar();
	}

	public void remover(Treino treino) throws SQLException {
		
		for (Treino treinoDaConsulta : consultar()) {
			if(treinoDaConsulta.getInstrutor().getNome().equals(treino.getInstrutor().getNome())){
				treino = treinoDaConsulta;
				repTreinoDao.remover(treino);
				System.out.println("Removido!! Regra");
				break;
			}else{
				System.out.println("Não removeu!! Regra. Nome em treino: "+treino.getInstrutor().getNome());
			}
			
		}
		
	}
	
	public void alterar(Treino treino) throws SQLException{
		for (Treino treinoDaConsulta : consultar()) {
			if(treinoDaConsulta.getInstrutor().getNome().equals(treino.getInstrutor().getNome())){
				repTreinoDao.remover(treinoDaConsulta);
				repTreinoDao.alterar(treino);
				
				break;
			}
		
		}

	}


}
