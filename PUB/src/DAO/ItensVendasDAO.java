package DAO;

import br.com.model.ItensVendas;
import br.com.model.Produto;
import br.com.pub.jpautil.GenericDAO;

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
