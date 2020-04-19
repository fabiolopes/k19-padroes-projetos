package com.bios.impl;

import java.util.Date;
import java.util.List;

import com.bios.interfaces.Artigo;

public class Jornal implements Artigo{
	private String autor;
	private String titulo;
	private List<String> marcacoes;
	private int paginas;
	private Date dataDaPublicacao;
	private String texto;
	
	@Override
	public void setAutor(String nome) {
		this.autor = nome;
	}

	@Override
	public void setTitulo(String nome) {
		this.titulo = nome;
	}

	@Override
	public void setMarcacoes(List<String> marcacoes) {
		this.marcacoes = marcacoes;
	}

	@Override
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public void setDataDaPublicacao(Date data) {
		this.dataDaPublicacao = data;
	}

	@Override
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getMarcacoes() {
		return marcacoes;
	}

	public int getPaginas() {
		return paginas;
	}

	public Date getDataDaPublicacao() {
		return dataDaPublicacao;
	}

	public String getTexto() {
		return texto;
	}
	
	@Override
	public String toString() {
		StringBuilder jornalArtigo = new StringBuilder();
		jornalArtigo.append("Jornal o dia do aprendiz\nColunista: " + this.autor);
		jornalArtigo.append("\n");
		
		jornalArtigo.append("Título: " + this.titulo);
		jornalArtigo.append("\n");
		
		jornalArtigo.append("Marcações: " + this.marcacoes);
		jornalArtigo.append("\n");
		
		jornalArtigo.append("Páginas: " + this.paginas);
		jornalArtigo.append("\n");
		
		jornalArtigo.append("data publicação: " + this.dataDaPublicacao);
		jornalArtigo.append("\n");
		
		jornalArtigo.append("Texto: " + this.texto);
		jornalArtigo.append("\n");
		
		return jornalArtigo.toString();
	}

}
