package k19.teste;

import java.util.Scanner;

import k19.interfaces.ComunicadorFactory;
import k19.interfaces.Emissor;
import k19.interfaces.Receptor;

public class TestaComunicador {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha o cartão que será utilizado: Visa ou Mastercard");
		String bandeira = scan.next();
		Class<?> instance = Class.forName("k19.impl."+bandeira+"ComunicadorFactory");
		ComunicadorFactory comunicadorFactory = (ComunicadorFactory) instance.newInstance();
		String transacao = "Valor=560; Senha=123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
