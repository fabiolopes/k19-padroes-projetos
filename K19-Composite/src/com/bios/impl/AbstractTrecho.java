package com.bios.impl;

import com.bios.interfaces.Trecho;

public abstract class AbstractTrecho implements Trecho{

	protected String direcao;
	protected double distancia;
		
	public AbstractTrecho(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}
	
	public AbstractTrecho(){
		
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
}
