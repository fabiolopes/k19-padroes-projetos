package com.bios.impl;

import com.bios.interfaces.Emissor;

public class EmissorBasico implements Emissor{

	@Override
	public void envia(String msg) {
		System.out.println("Enviando mensagem: \n"+msg);
	}

}
