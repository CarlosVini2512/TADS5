package DAO;

import br.com.model.Mesa;
import br.com.pub.jpautil.GenericDAO;

public class MesaDAO {
	
	
	public void addMesa(){
		Mesa mesa = new Mesa();
		GenericDAO<Mesa> mesaDAO = new GenericDAO<Mesa>();
		
		mesa.setNumero(10);
		mesa.setStatus(true);
	}
}
