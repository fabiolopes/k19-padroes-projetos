package com.bios.realsubject;

import com.bios.subject.Conta;

public class ContaPadrao implements Conta{

	private double saldo;
	
	@Override
	public void deposita(double valor) {
		this.saldo+=valor;		
	}

	@Override
	public void saca(double valor) {
		this.saldo-=valor;		
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

}
