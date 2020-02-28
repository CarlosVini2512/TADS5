package br.com.pub.DAO;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.ItensVendas;
import br.com.pub.model.Produto;

public class ItensVendasDAO {
	
	public void addItemV(){
		ItensVendas itemV = new ItensVendas();
		GenericDAO<ItensVendas> itemVDAO = new GenericDAO<ItensVendas>();
		Produto produto = new Produto();
		
		itemV.setProduto(produto);
		itemV.setQtd(50);
		itemVDAO.novo(itemV);
	}
}
