package com.bios.teste;

import com.bios.implementors.GeradorArquivo;
import com.bios.implementors.impl.GeradorArquivoTxt;
import com.bios.model.impl.Recibo;

public class TestaRecibo {
	public static void main(String[] args) {
		GeradorArquivo geradorArquivo = new GeradorArquivoTxt();
		Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins", 1000, geradorArquivo);
		recibo.geraArquivo();
	}
}
