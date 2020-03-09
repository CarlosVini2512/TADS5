package br.com.pub.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.PessoaFisica;

@ManagedBean(name ="pessoaFisicaBean")
@SessionScoped

public class PessoaFisicaController implements Serializable {

	private static final long serialVersionUID = 1L;
	PessoaFisica pessoa = new PessoaFisica();
	GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
	
	public PessoaFisica getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
