package br.com.testdev.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
			throw new Exception("Não foi possível salvar ");
		}
	}
	
	public Item editar(Item item) throws Exception {
		try{
			manager.merge(item);
			manager.flush();
			return item;
		}catch(Exception e){
			manager.getTransaction().rollback();
			throw new Exception("Não foi possível Atualizar");
		}
	}
	
	public Item pesquisarItem(String valorPesquisa) {
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Item> criteriaQuery = criteriaBuilder.createQuery(Item.class);		
		Root<Item> root = criteriaQuery.from(Item.class);			
		criteriaQuery.select(root);				
		criteriaQuery.where(criteriaBuilder.like(root.get("descricao"), valorPesquisa + "%"));		
		
		TypedQuery<Item> query = manager.createQuery(criteriaQuery);
		
		return query.getSingleResult();
	}

}
