package com.bios.model.impl;

import com.bios.implementors.GeradorArquivo;
import com.bios.model.Documento;

public class Recibo implements Documento {

	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorArquivo geradorArquivo;

	public Recibo(String emissor, String favorecido, double valor,
			GeradorArquivo geradorArquivo) {
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorArquivo = geradorArquivo;
	}

	@Override
	public void geraArquivo() {
		StringBuffer buffer;
		buffer = new StringBuffer();
		buffer.append("Recibo: ");
		buffer.append("\nEmpresa: " + this.emissor);
		buffer.append("\nCliente: " + this.favorecido);
		buffer.append("\nValor: " + this.valor);
		this.geradorArquivo.gera(buffer);
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public GeradorArquivo getGeradorArquivo() {
		return geradorArquivo;
	}

	public void setGeradorArquivo(GeradorArquivo geradorArquivo) {
		this.geradorArquivo = geradorArquivo;
	}

}
