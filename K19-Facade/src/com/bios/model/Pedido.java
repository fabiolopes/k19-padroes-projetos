package com.bios.model;

public class Pedido {
	private String produto;
	private String cliente;
	private String enderecoEntrega;
	
	public Pedido(String produto, String cliente, String enderecoEntrega) {
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
}
