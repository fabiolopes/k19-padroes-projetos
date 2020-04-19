package com.bios.produto.impl;

import com.bios.produto.interfaces.Habilitacao;

public abstract class AbstractHabilitacao implements Habilitacao{

	private String condutor;
	private String estado;
	private String carro;
	
	public String getCondutor() {
		return condutor;
	}
	
	@Override
	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}
	
	public String getEstado() {
		return estado;
	}
	
	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCarro() {
		return carro;
	}
	
	@Override
	public void setCarro(String carro) {
		this.carro = carro;
	}
	
	@Override
	public String toString() {
		String[] typeHab = this.getClass().getName().split("\\.");
		return "Type: " +typeHab[typeHab.length - 1]
				+"\nCondutor: " + this.getCondutor()
				+"\nEstado: " + this.getEstado()
				+"\nCarro: " + this.getCarro();
	}

}
