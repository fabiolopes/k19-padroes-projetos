package app;

import concretestate.Bandeira1;
import concretestate.Bandeira2;
import context.Taximetro;
import state.Bandeira;

public class TestaTaximetro {
	public static void main(String[] args) {
		Bandeira b1 = new Bandeira1();
		Bandeira b2 = new Bandeira2();
		Taximetro taximetro = new Taximetro(b1);
		double valor1 = taximetro.calculaValorDaCorrida(10, 20);
		System.out.println("Valor da corrida bandeira 1: " + valor1);
		taximetro.setBandeira(b2);
		double valor2 = taximetro.calculaValorDaCorrida(10, 20);
		System.out.println("Valor da corrida bandeira 2: " + valor2);
	}
}
