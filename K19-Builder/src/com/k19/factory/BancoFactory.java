package com.k19.factory;

import com.k19.impl.BBBoletoBuilder;
import com.k19.impl.SantanderBoletoBuilder;
import com.k19.interfaces.BoletoBuilder;

public class BancoFactory {
	public static final int BB = 0;
	public static final int SANTANDER = 1;
	
	public static BoletoBuilder createBanco(int bancoType){
		BoletoBuilder boletoBuilder;
		switch (bancoType) {
			case BB:
				boletoBuilder = new BBBoletoBuilder();
				break;
			case SANTANDER:
				boletoBuilder = new SantanderBoletoBuilder();
				break;
		
			default:
				throw new IllegalArgumentException("Banco n�o suportado para gera��o de boletos");
		}
		
		return boletoBuilder;
	}
}
