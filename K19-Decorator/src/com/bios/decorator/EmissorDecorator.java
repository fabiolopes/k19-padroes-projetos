package com.bios.decorator;

import com.bios.interfaces.Emissor;


public abstract class EmissorDecorator implements Emissor{
	private Emissor emissor;
	
	public EmissorDecorator(Emissor emissor) {
		super();
		this.emissor = emissor;
	}
	
	public abstract void envia(String msg);

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}
}
