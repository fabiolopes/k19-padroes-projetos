package com.bios.teste;

import com.bios.decorator.EmissorDecoratorComCompressao;
import com.bios.decorator.EmissorDecoratorComCriptografia;
import com.bios.impl.EmissorBasico;
import com.bios.interfaces.Emissor;

public class TesteEmissaoDecorator {
	public static void main(String[] args) {
		String mensagem = "Uma vez flamengo";
		
		Emissor emissorScript = new EmissorDecoratorComCriptografia(new EmissorBasico());
		emissorScript.envia(mensagem);
		
		Emissor compr = new EmissorDecoratorComCompressao(new EmissorBasico());
		compr.envia(mensagem);
		
		Emissor emissorCripComp = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCripComp.envia(mensagem);
	}
}
