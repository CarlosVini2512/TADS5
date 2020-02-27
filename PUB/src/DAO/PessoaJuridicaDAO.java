package DAO;

import java.time.LocalDate;

import br.com.model.PessoaJuridica;
import br.com.pub.jpautil.GenericDAO;

public class PessoaJuridicaDAO {
	
	
	public void addPessoaJ(){
		PessoaJuridica pessoaJ = new PessoaJuridica();
		GenericDAO<PessoaJuridica> pessoaJDAO = new GenericDAO<PessoaJuridica>();
		
		pessoaJ.setNome("CarlosVOP");
		pessoaJ.setTelefone("192381293891");
		pessoaJ.setDt_cadastro(LocalDate.now());
		pessoaJ.setDataNasc(LocalDate.now());
		pessoaJ.setEndereco("Rua Zuleide Perez Tabox");
		pessoaJ.setIe("12312");
		pessoaJ.setCnpj(3123123);
		pessoaJDAO.novo(pessoaJ);
	}
}
