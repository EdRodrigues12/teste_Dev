package br.com.testdev.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.testdev.model.Item;

public class ItemRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public ItemRepository() {

	}
	
	public ItemRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public Item salvar(Item item) throws Exception {
		try{
			manager.merge(item);
			manager.flush();
			return item;
		}catch(Exception e){
			manager.getTransaction().rollback();
			throw new Exception("Não foi possível salvar o centro de custo");
		}
	}
	
	public Item editar(Item item) throws Exception {
		try{
			manager.merge(item);
			manager.flush();
			return item;
		}catch(Exception e){
			manager.getTransaction().rollback();
			throw new Exception("Não foi possível Atualizar o centro de custo");
		}
	}

}
