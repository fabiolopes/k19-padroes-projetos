package com.bios.teste;

import com.bios.adapter.VendaCarroAdapter;
import com.bios.business.VendaCarro;
import com.bios.model.Carro;

public class TestaVenda {
	public static void main(String[] args) {
		VendaCarro vendaCarro = new VendaCarroAdapter();
		Carro car = new Carro("Chevete", 1020.50);
		vendaCarro.concluirVenda(car);
	}
}
