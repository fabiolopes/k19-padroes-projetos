package com.bios.model;

public class Carro {
	private String name;
	private double value;
	
	public Carro(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
