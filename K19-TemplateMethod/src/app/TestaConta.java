package app;

import concretetemplate.ContaCorrente;
import concretetemplate.ContaPoupanca;
import template.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.deposita(100);
		contaCorrente.saca(10);
		
		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);
		
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupan�a: " + contaPoupanca.getSaldo());
	}
}
