package com.banco.concrete;

import com.banco.chain.BancoChain;
import com.banco.enums.IDBancos;

public class BancoD extends BancoChain{

	public BancoD() {
		super(IDBancos.bancoC);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco C");
	}
	
}
