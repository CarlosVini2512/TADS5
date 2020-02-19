package br.com.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

// venda e cliente -> OnetoMany 1-1
// venda e mesa -> ManytoMany n-1

@Entity
public class Vendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private LocalDate data;
	
	private double totalVenda;
	
	@OneToOne
	private Mesa mesa;
	
	@OneToOne
	private Cliente cliente;
	
	private LocalTime hora;
	
	@ManyToMany
	private List<ItensVendas>itensVendas;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItensVendas> getItensVendas() {
		return itensVendas;
	}
	public void setItemVenda(List<ItensVendas> itensVendas) {
		this.itensVendas = itensVendas;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
