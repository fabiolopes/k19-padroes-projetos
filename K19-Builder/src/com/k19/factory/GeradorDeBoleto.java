package com.k19.factory;

import com.k19.interfaces.Boleto;
import com.k19.interfaces.BoletoBuilder;

public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder){
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto  geraBoleto(){
		Boleto boleto = boletoBuilder.getBoleto();
		return boleto;
	}
}
