package k19.impl;

import k19.interfaces.Receptor;

public class ReceptorVisa implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem do Visa.");
		String mensagem = "Mensagem do Visa";
		return mensagem;
	}

}
