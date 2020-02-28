package br.com.pub.DAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItensVendas;
import br.com.pub.model.Mesa;
import br.com.pub.model.Vendas;

public class VendasDAO {
	
	public void addVendas(){
		Vendas venda = new Vendas();
		GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();
		List<ItensVendas> itensVendas = new ArrayList<ItensVendas>();
		Cliente cliente = new Cliente();
		Mesa mesa = new Mesa();
		
		venda.setCliente(cliente);
		venda.setData(LocalDate.now());
		venda.setHora(LocalTime.now());
		venda.setMesa(mesa);
		venda.setItensVendas(itensVendas);
		venda.setTotalVenda(20);
		vendasDAO.novo(venda);
	}
}
