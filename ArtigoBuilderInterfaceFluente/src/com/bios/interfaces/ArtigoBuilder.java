package com.bios.interfaces;


public interface ArtigoBuilder {
	ArtigoBuilder autor(String autor);
	ArtigoBuilder titulo(String titulo);
	ArtigoBuilder assuntos(String... assuntos);
	ArtigoBuilder totalDePaginas(int total);
	ArtigoBuilder publicadoEm(int dia, int mes, int ano);
	ArtigoBuilder texto(String texto);
	
	Artigo get();
}
