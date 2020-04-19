package com.k19.creator;

import com.k19.impl.EmissorEmail;
import com.k19.impl.EmissorJMS;
import com.k19.impl.EmissorSMS;
import com.k19.interfaces.Emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create(int tipoEmissor){
		if(tipoEmissor == SMS){
			return new EmissorSMS();
		}else if(tipoEmissor == EMAIL){
			return new EmissorEmail();
		}else if (tipoEmissor == JMS){
			return new EmissorJMS();
		}else{
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
