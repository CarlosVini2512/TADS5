package br.com.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Cliente extends  Pessoa{

	private LocalDate dt_cadastro;

	public LocalDate getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(LocalDate dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	

	
}
