package k19.factory;

import k19.impl.EmissorMastercard;
import k19.impl.EmissorVisa;
import k19.interfaces.Emissor;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Emissor create(int tipoEmissor){
		if(tipoEmissor == VISA){
			return new EmissorVisa();
		}else if(tipoEmissor == MASTERCARD){
			return new EmissorMastercard();
		}else{
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
