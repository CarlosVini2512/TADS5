package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.Usuario;

public class UsuarioDAO {
	
	
	public void addUsuario(){
		Usuario usuario = new Usuario();
		GenericDAO<Usuario> usuarioDAO = new GenericDAO<Usuario>();
		
		usuario.setNome("New User");
		usuario.setTelefone("67991908695");
		usuario.setEndereco("BR262");
		usuario.setDataNasc(LocalDate.now());
		usuario.setLogin("CarlosVini");
		usuario.setSenha("12345");
		usuarioDAO.novo(usuario);
	}
}
