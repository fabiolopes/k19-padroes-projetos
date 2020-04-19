package com.bios.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
	private static Configuracao instance;
	private Map<String, String> propriedades;
	
	private Configuracao(){
		this.propriedades = new HashMap<String, String>();
		this.propriedades.put("time-zone", "America/Sao_Paulo");
		this.propriedades.put("currency-mode", "BRL");
	}
	
	public static Configuracao getInstance(){
		if(Configuracao.instance == null){
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}
	
	public String getPropriedade(String nomeDaPropriedade){
		return this.propriedades.get(nomeDaPropriedade);
	}
}
