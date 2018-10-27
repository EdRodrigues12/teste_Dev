package br.com.testdev.controler;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.testdev.model.Item;
import br.com.testdev.model.Lancamento;
import br.com.testdev.repository.ItemRepository;
import br.com.testdev.repository.LancamentoRepository;
import br.com.testdev.util.jpa.Transacional;

@Named
@ViewScoped
public class MbLancamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private LancamentoRepository lancamentoDAO;
	@Inject
	private ItemRepository itemDAO;
	
	private Lancamento lancamento = new Lancamento();
	private List<Item> itens = new ArrayList<Item>();
	
	private String valorPesquisa;
	private int seq;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getValorPesquisa() {
		return valorPesquisa;
	}

	public void setValorPesquisa(String valorPesquisa) {
		this.valorPesquisa = valorPesquisa;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	

		@Transacional
		public void salvar(){
			try {
				lancamentoDAO.salvar(lancamento);			
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Lancamento Salvo"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}

		}
		
		@Transacional
		public void pesquisar() {
			Item item = new Item();
			item = itemDAO.pesquisarItem(valorPesquisa);
			adicionarItem(item);
			
		}
		
		@Transacional
		public void adicionarItem(Item item) {
			itens.add(item);
			lancamento.setVl_total(BigDecimal.ZERO);
			for(Item i : itens){
				lancamento.setVl_total(lancamento.getVl_total().add(i.getValor()));
				
			}
			
			
		}
	

}
