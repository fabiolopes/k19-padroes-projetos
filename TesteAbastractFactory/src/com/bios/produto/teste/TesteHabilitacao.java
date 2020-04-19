package com.bios.produto.teste;

import com.bios.produto.impl.CNHFactory;
import com.bios.produto.interfaces.Habilitacao;
import com.bios.produto.interfaces.HabilitacaoFactory;

public class TesteHabilitacao {
	public static void main(String[] args) {
		HabilitacaoFactory cnhFactory = new CNHFactory();
		Habilitacao habilitacao = cnhFactory.createHabilitacao();
		habilitacao.setCondutor("João da Silva");
		habilitacao.setCarro("Corsa");
		habilitacao.setEstado("PE");
		System.out.println(habilitacao);
	}
}
