package k19.impl;

import k19.interfaces.Receptor;

public class ReceptorMastercard implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem do Mastercard.");
		String mensagem = "Mensagem do Mastercard";
		return mensagem;
	}

}
