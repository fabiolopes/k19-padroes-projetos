package com.k19.teste;

import java.util.Calendar;
import java.util.Scanner;

import com.k19.factory.BancoFactory;
import com.k19.factory.GeradorDeBoleto;
import com.k19.interfaces.Boleto;
import com.k19.interfaces.BoletoBuilder;

public class TestaGeradorDeBoleto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Banco 24hs. Qual o banco que será utilizado? BB(0) ou Santander(1)?");
		int banco = scan.nextInt();
		BoletoBuilder boletoBuilder = BancoFactory.createBanco(banco);
		boletoBuilder = preencheBuilder(boletoBuilder, scan);
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
	
	public static BoletoBuilder preencheBuilder(BoletoBuilder boletoBuilder, Scanner scan){
		System.out.println("Sacado: ");
		boletoBuilder.buildSacado(scan.nextLine());
		System.out.println("Cedente: ");
		boletoBuilder.buildCedente(scan.next());
		System.out.println("Valor: ");
		boletoBuilder.buildValor(scan.nextDouble());
		System.out.println("Nosso número: ");
		boletoBuilder.buildNossoNumero(scan.nextInt());
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		boletoBuilder.buildVencimento(vencimento);
		return boletoBuilder;
		
	}
}
