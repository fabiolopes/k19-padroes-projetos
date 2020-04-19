package com.banco.concrete;

import com.banco.chain.BancoChain;
import com.banco.enums.IDBancos;

public class BancoC extends BancoChain{

	public BancoC() {
		super(IDBancos.bancoD);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco D");
	}
	
}
