package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pub.DAO.ItensVendasDAO;
import br.com.pub.DAO.MesaDAO;
import br.com.pub.DAO.PessoaFisicaDAO;
import br.com.pub.DAO.PessoaJuridicaDAO;
import br.com.pub.DAO.UsuarioDAO;
import br.com.pub.DAO.VendasDAO;

public class Main {
	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();


		PessoaFisicaDAO pf =  new  PessoaFisicaDAO ();
		pf.addPessoaF();

		UsuarioDAO u =  new  UsuarioDAO ();
		u.addUsuario();

		PessoaJuridicaDAO pj =  new  PessoaJuridicaDAO ();
		pj.addPessoaJ();

		VendasDAO v =  new  VendasDAO ();
		v.addVendas();

		MesaDAO m =  new  MesaDAO ();
		m.addMesa();
		
		ItensVendasDAO iv =  new  ItensVendasDAO ();
		iv.addItemV();
    }
}
