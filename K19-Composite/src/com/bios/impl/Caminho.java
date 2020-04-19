package com.bios.impl;

import java.util.ArrayList;
import java.util.List;

import com.bios.interfaces.Trecho;

public class Caminho extends AbstractTrecho{

	private List<Trecho> trechos;
	
	public Caminho(String direcao, double distancia) {
		super(direcao, distancia);
		// TODO Auto-generated constructor stub
	}

	public Caminho() {
		super();
		this.setTrechos(new ArrayList<Trecho>());
	}

	public void adiciona(Trecho trecho){
		trechos.add(trecho);
	}
	
	public void remove(Trecho trecho){
		trechos.remove(trecho);
	}

	@Override
	public void imprime() {
		for(Trecho curTrecho: trechos){
			curTrecho.imprime();
		}
		
	}

	public List<Trecho> getTrechos() {
		return trechos;
	}

	public void setTrechos(List<Trecho> trechos) {
		this.trechos = trechos;
	}

}
