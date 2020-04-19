package com.bios.teste;

import com.bios.factory.TemaFlyweightFactory;
import com.bios.model.Apresentacao;
import com.bios.model.Slide;

public class TesteTemas {
	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.K19), 
				"K11 - Orienta��o � objetos em Java", 
				"Com este curso vc vai obter a base\n s�lida de conhecimento de Java"));
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO), 
				"K12 - Desenvolvimento dcom JSF e JPA", 
				"Com este curso vc vai estar apto a desenvolver\n aplica��es web com JSF e JPA"));
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
				"K21 - Persist�ncia com JPA e Hibernate", 
				"Com este curso vc vai obter a base\n s�lida de persistencia Java"));
		
		a.imprime();
	}
}
