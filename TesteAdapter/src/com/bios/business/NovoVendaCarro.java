package com.bios.business;

import com.bios.model.Venda;

public class NovoVendaCarro {
	public void confirmarVenda(Venda venda) {
		System.out.println("Nova venda registrada\nCarro: "
				+ venda.getCar().getName() + "; Valor: "
				+ venda.getCar().getValue() + "; data de confirma��o da venda:"
				+ venda.getHoraVenda());
	}
}
