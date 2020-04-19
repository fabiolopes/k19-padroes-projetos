package com.bios.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import com.bios.interfaces.Emissor;

public class EmissorDecoratorComCompressao extends EmissorDecorator{

	public EmissorDecoratorComCompressao(Emissor emissor) {
		super(emissor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void envia(String msg) {
		System.out.println("Enviando mensagem comprimida...");
		String msgComprimida;
		try {
			msgComprimida = comprime(msg);
		} catch (IOException e) {
			msgComprimida = msg;
			e.printStackTrace();
		}
		this.getEmissor().envia(msgComprimida);
	}
	
	public String comprime(String msg) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		dout.write(msg.getBytes());
		dout.close();
		return new String (out.toByteArray());
	}

}
