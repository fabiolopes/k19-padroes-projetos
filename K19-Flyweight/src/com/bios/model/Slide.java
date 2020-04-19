package com.bios.model;

import com.bios.interfaces.TemaFlyweight;

public class Slide {
	private TemaFlyweight tema;
	private String titulo;
	private String texto;
	
	public Slide(TemaFlyweight tema, String titulo, String texto) {
		super();
		this.tema = tema;
		this.titulo = titulo;
		this.texto = texto;
	}

	public void imprime(){
		this.tema.imprime(titulo, texto);
	}
	
	public TemaFlyweight getTema() {
		return tema;
	}

	public void setTema(TemaFlyweight tema) {
		this.tema = tema;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
