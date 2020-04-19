package com.bios.teste;

import com.bios.fachada.PedidoFacade;
import com.bios.model.Estoque;
import com.bios.model.Financeiro;
import com.bios.model.Pedido;
import com.bios.model.PosVenda;

public class TestaProduto {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		
		PedidoFacade facade = new PedidoFacade(estoque, posVenda, financeiro);
		Pedido pedido = new Pedido("Notebook", "João das Couves", "Rua nenhuma");
		facade.registraPedido(pedido);
	}
}
