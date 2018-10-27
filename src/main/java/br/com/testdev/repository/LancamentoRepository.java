package br.com.testdev.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.testdev.model.Item;
import br.com.testdev.model.Lancamento;

public class LancamentoRepository implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public LancamentoRepository() {

	}
	
	public LancamentoRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public Lancamento salvar(Lancamento lanc) throws Exception {
		try{
			manager.merge(lanc);
			manager.flush();
			return lanc;
		}catch(Exception e){
			manager.getTransaction().rollback();
			throw new Exception("Não foi possível salvar ");
		}
	}
	
	public Lancamento editar(Lancamento lanc) throws Exception {
		try{
			manager.merge(lanc);
			manager.flush();
			return lanc;
		}catch(Exception e){
			manager.getTransaction().rollback();
			throw new Exception("Não foi possível Atualizar");
		}
	}

}
