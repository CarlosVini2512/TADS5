package br.com.pub.DAO;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.Mesa;

public class MesaDAO {
	
	
	public void addMesa(){
		Mesa mesa = new Mesa();
		GenericDAO<Mesa> mesaDAO = new GenericDAO<Mesa>();
		
		mesa.setNumero(10);
		mesa.setStatus(true);
	}
}
