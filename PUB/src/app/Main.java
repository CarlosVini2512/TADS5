package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.ItensVendasDAO;
import DAO.MesaDAO;
import DAO.PessoaFisicaDAO;
import DAO.PessoaJuridicaDAO;
import DAO.UsuarioDAO;
import DAO.VendasDAO;

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
