package com.k19.impl;

import java.util.Calendar;

import com.k19.interfaces.Boleto;
import com.k19.interfaces.BoletoBuilder;

public class SantanderBoletoBuilder implements BoletoBuilder{

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
		
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
		
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
		
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
		
	}

	@Override
	public void buildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
		
	}

	@Override
	public Boleto getBoleto() {
		return new SantanderBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}

}
