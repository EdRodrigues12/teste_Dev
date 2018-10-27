package br.com.testdev.controler;


import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.testdev.model.Item;
import br.com.testdev.repository.ItemRepository;
import br.com.testdev.util.jpa.Transacional;

@Named
@ViewScoped
public class MbItem implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private ItemRepository itemDAO;
	
	private Item item = new Item();

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@Transacional
	public void salvar(){
		try {
			itemDAO.salvar(item);			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Item Salvo"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}

	}
	
	@Transacional
	public void pesquisar() {
		item = itemDAO.pesquisarItem(item.getDescricao());
		
		
	}

}
