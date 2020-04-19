package com.bios.implementors.impl;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.bios.implementors.GeradorArquivo;

public class GeradorArquivoTxt implements GeradorArquivo{

	@Override
	public void gera(StringBuffer conteudo) {
		PrintStream saida;
		try {
			saida = new PrintStream("arquivo.txt");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
