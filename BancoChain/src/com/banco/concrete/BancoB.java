package com.banco.concrete;

import com.banco.chain.BancoChain;
import com.banco.enums.IDBancos;

public class BancoB extends BancoChain{

	public BancoB() {
		super(IDBancos.bancoB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco B");
	}
	
}
