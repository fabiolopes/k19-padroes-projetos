package com.bios.impl;


public class TrechoAndando extends AbstractTrecho{
		
	public TrechoAndando(String direcao, double distancia) {
		super(direcao, distancia);
	}

	@Override
	public void imprime() {
		System.out.println("V� andando: ");
		System.out.println(this.direcao);
		System.out.println("A dist�ncia percorrida � " + this.distancia + " metros");
		
	}

}
