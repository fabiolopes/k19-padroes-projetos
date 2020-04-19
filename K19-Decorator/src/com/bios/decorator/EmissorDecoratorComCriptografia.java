package com.bios.decorator;

import com.bios.interfaces.Emissor;

public class EmissorDecoratorComCriptografia extends EmissorDecorator{

	public EmissorDecoratorComCriptografia(Emissor emissor) {
		super(emissor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void envia(String msg) {
		System.out.println("Criptografando uma imagem...");
		this.getEmissor().envia(criptografa(msg));
		
	}
	
	private String criptografa(String msg){
		String msgCriptografada = new StringBuilder(msg).reverse().toString();
		return msgCriptografada;
	}

}
