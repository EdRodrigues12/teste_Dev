package br.com.testdev.controler;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MBInter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;

	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public int getNum3() {
		return num3;
	}
	public int getNum4() {
		return num4;
	}
	
	
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	
	public void consultar() {
		if((num1 <= num4 && num1 >= num3)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Existe interseção entre 1 e 2"));
			System.out.println("S");
		}else if((num2 <= num4 && num2 >= num3)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Existe interseção entre 1 e 2"));
			System.out.println("S");
		} else if((num3 >= num1 && num3 <= num2)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Existe interseção entre 1 e 2"));
			System.out.println("S");
		}else if((num4 >= num1 && num4 <= num2)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Existe interseção entre 1 e 2"));
			System.out.println("S");
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação",  "Não Existe interseção entre 1 e 2"));
			System.out.println("N");
		}
	}

}
