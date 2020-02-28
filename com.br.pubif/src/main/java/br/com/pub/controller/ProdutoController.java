package br.com.pub.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.model.Produto;


@ManagedBean(name="produtoBean")
@SessionScoped
public class ProdutoController {

	Produto p = new Produto();
}
