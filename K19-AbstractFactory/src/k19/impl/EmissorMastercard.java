package k19.impl;

import k19.interfaces.Emissor;

public class EmissorMastercard implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para o Mastercard.");
		System.out.println(mensagem);		
	}

}
