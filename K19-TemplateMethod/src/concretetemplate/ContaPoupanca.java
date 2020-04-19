package concretetemplate;

import template.Conta;

public class ContaPoupanca extends Conta{

	@Override
	public double calculaTaxa() {
		return 1;
	}

}
