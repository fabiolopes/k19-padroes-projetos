package k19.impl;

import k19.interfaces.Emissor;

public class EmissorVisa implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para o Visa.");
		System.out.println(mensagem);
		
	}

}
