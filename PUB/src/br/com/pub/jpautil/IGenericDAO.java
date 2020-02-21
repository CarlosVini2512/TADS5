package br.com.pub.jpautil;

import java.util.List;

public interface IGenericDAO<E> {
	
	public void novo(E entidade);
	
	public void alterar(E entidade);
	
	public void deletar(E entidaede);
	
	public List<E> listarTodos(Class<E> entidade);

	//cascade
}
