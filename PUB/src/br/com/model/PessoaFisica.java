package br.com.model;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente{
	private int cpf;
	private int rg;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
}
