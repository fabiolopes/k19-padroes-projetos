package com.bios.impl;


public class TrechoDeCarro extends AbstractTrecho{

	public TrechoDeCarro(String direcao, double distancia) {
		super(direcao, distancia);

	}

	@Override
	public void imprime() {
		System.out.println("Vá de carro: ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida é " + this.distancia + " metros");		
	}

}
