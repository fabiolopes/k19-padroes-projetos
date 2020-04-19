package com.bios.fachada;

import com.bios.model.Estoque;
import com.bios.model.Financeiro;
import com.bios.model.Pedido;
import com.bios.model.PosVenda;

public class PedidoFacade {
	private Estoque estoque;
	private PosVenda posVenda;
	private Financeiro financeiro; 
	
	public PedidoFacade(Estoque estoque, PosVenda posVenda, Financeiro financeiro) {
		super();
		this.estoque = estoque;
		this.posVenda = posVenda;
		this.financeiro = financeiro;
	}
	
	public void registraPedido(Pedido p){
		this.estoque.enviaProduto(p.getProduto(), p.getEnderecoEntrega());
		this.financeiro.fatura(p.getCliente(), p.getProduto());
		this.posVenda.agendaContato(p.getCliente(), p.getProduto());
	}
	
}
