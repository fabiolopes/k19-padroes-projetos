package com.bios.teste;

import com.bios.impl.Caminho;
import com.bios.impl.TrechoAndando;
import com.bios.impl.TrechoDeCarro;
import com.bios.interfaces.Trecho;

public class TestaTrecho {
	public static void main(String[] args) {
		Trecho trecho = new TrechoAndando(
				"V� at� o cruzamento da Av Rebou�as com a Av Brigadeiro Farias",
				500);

		Trecho trecho2 = new TrechoDeCarro(
				"V� at� o cruzamento da Av Brigadeiro Faria Lima com a Av Cidade Jardim",
				1500);
		
		Trecho trecho3 = new TrechoDeCarro("Vire � direita na marginal Pinheiros", 500);
		
		Caminho caminho = new Caminho();
		caminho.adiciona(trecho);
		caminho.adiciona(trecho2);
		
		System.out.println("Caminho 1");
		
		caminho.imprime();
		
		Caminho caminho2 = new Caminho();
		caminho2.adiciona(caminho);
		caminho2.adiciona(trecho3);
		System.out.println("--------------");
		System.out.println("Caminho 2: ");
		caminho2.imprime();
	}
}
