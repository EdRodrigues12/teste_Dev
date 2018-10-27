package br.com.testdev.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Lancamento")
public class Lancamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "oid ")
	private int oid ;
	@Column(name = "dt_inicial")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_inicial ;
	@Column(name = "dt_final")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dt_final ;
	@Column(name = "vl_total")
	private BigDecimal vl_total  = BigDecimal.ZERO;
	@Column(name = "observacao")
	private String observacao;
	
//	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Item> lancamentoItem;
//	
//
//	public List<Item> getLancamentoItem() {
//		return lancamentoItem;
//	}
//	public void setLancamentoItem(List<Item> lancamentoItem) {
//		this.lancamentoItem = lancamentoItem;
//	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getDt_inicial() {
		return dt_inicial;
	}
	public void setDt_inicial(Date dt_inicial) {
		this.dt_inicial = dt_inicial;
	}
	public Date getDt_final() {
		return dt_final;
	}
	public void setDt_final(Date dt_final) {
		this.dt_final = dt_final;
	}
	public BigDecimal getVl_total() {
		return vl_total;
	}
	public void setVl_total(BigDecimal vl_total) {
		this.vl_total = vl_total;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	

}
