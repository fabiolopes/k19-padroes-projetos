package com.bios.proxy;

import com.bios.subject.Conta;

public class ContaProxy implements Conta{
	
	private Conta conta;
	
	public ContaProxy(Conta conta) {
		super();
		this.conta = conta;
	}

	@Override
	public void deposita(double valor) {
		System.out.println("Depósito no valor de R$" +valor);
		this.conta.deposita(valor);
	}

	@Override
	public void saca(double valor) {
		System.out.println("Daque no valor de R$" +valor);
		this.conta.saca(valor);
		
	}

	@Override
	public double getValor() {
		System.out.println("Saldo R$" +this.conta.getValor());
		return this.conta.getValor();
	}

}
