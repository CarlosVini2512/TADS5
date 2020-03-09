package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.Produto;


@ManagedBean(name="produtoBean")
@SessionScoped
public class ProdutoController implements Serializable {

	private static final long serialVersionUID = 1L;
	Produto produto = new Produto();
	GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto p) {
		this.produto = produto;
	}
	
	private String limparDados() {
		produto = new Produto();
		return "";		
	}
	
	public String addProduto(){
		produtoDAO.novo(produto);
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Salvo com sucesso"));
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		limparDados();
		return "";
	}

	
}
