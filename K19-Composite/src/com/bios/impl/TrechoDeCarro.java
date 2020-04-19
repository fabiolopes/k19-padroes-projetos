package com.bios.impl;


public class TrechoDeCarro extends AbstractTrecho{

	public TrechoDeCarro(String direcao, double distancia) {
		super(direcao, distancia);

	}

	@Override
	public void imprime() {
		System.out.println("V� de carro: ");
		System.out.println(this.direcao);
		System.out.println("A dist�ncia percorrida � " + this.distancia + " metros");		
	}

}
