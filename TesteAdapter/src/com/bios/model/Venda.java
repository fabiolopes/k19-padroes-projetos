package com.bios.model;

import java.util.Calendar;

public class Venda {
	private Carro car;
	private String horaVenda;

	public Venda(Carro car){
		this.car = car;
	}
	
	public Venda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro getCar() {
		return car;
	}

	public void setCar(Carro car) {
		this.car = car;
	}

	public String getHoraVenda() {
		return horaVenda;
	}

	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
}
