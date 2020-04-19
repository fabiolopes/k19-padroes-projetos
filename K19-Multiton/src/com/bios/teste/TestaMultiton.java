package com.bios.teste;

import com.bios.multiton.Tema;

public class TestaMultiton {
	public static void main(String[] args) {
		Tema temaFire = Tema.getInstance(Tema.FIRE);
		System.out.println("Nome do tema: " + temaFire.getNome());
		System.out.println("Cor de fundo: " + temaFire.getCorDoFundo());
		System.out.println("Cor da fonte: " + temaFire.getCorDaFonte());
		
		Tema temaFire2 = Tema.getInstance(Tema.FIRE);
		System.out.println(temaFire == temaFire2);
	}
}
