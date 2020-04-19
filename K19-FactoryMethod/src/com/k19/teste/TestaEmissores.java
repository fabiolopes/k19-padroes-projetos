package com.k19.teste;

import com.k19.creator.EmissorCreator;
import com.k19.interfaces.Emissor;

public class TestaEmissores {
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		Emissor emissorSMS = creator.create(EmissorCreator.SMS);
		Emissor emissorEmail = creator.create(EmissorCreator.EMAIL);
		Emissor emissorJMS = creator.create(EmissorCreator.JMS);
		
		emissorSMS.envia("K19 Treinamentos");
		emissorEmail.envia("K19 Treinamentos");
		emissorJMS.envia("K19 Treinamentos");
	}
}
