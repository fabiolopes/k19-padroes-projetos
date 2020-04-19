package com.banco.concrete;

import com.banco.chain.BancoChain;
import com.banco.enums.IDBancos;

public class BancoA extends BancoChain{

	public BancoA() {
		super(IDBancos.bancoA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco A");
	}
	
}
