package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpautil.GenericDAO;
import br.com.pub.model.PessoaFisica;

public class PessoaFisicaDAO {
	
	public void addPessoaF(){
		PessoaFisica pessoaf = new PessoaFisica();
		GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
		
        pessoaf.setNome("CarlosVOP");
        pessoaf.setEndereco("Rua Abraão Leite");
        pessoaf.setTelefone("67991908695");
        pessoaf.setDataNasc(LocalDate.now());
        pessoaf.setDt_cadastro(LocalDate.now());
        pessoaf.setCpf(123456789);
        pessoaf.setRg(123456789);
        pessoaFDAO.novo(pessoaf);
	}
}
