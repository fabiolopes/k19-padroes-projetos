package com.banco.app;

import com.banco.chain.BancoChain;
import com.banco.concrete.BancoA;
import com.banco.concrete.BancoB;
import com.banco.concrete.BancoC;
import com.banco.concrete.BancoD;
import com.banco.enums.IDBancos;

public class Main {

	public static void main(String[] args) {
		BancoChain bancos = new BancoA();
		bancos.setNext(new BancoB());
		bancos.setNext(new BancoC());
		bancos.setNext(new BancoD());

		try {
			bancos.efetuarPagamento(IDBancos.bancoC);
			bancos.efetuarPagamento(IDBancos.bancoD);
			bancos.efetuarPagamento(IDBancos.bancoA);
			bancos.efetuarPagamento(IDBancos.bancoB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
