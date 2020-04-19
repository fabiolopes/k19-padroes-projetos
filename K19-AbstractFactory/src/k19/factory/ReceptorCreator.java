package k19.factory;

import k19.impl.ReceptorMastercard;
import k19.impl.ReceptorVisa;
import k19.interfaces.Receptor;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Receptor create(int tipoReceptor){
		if(tipoReceptor == VISA){
			return new ReceptorVisa();
		}else if(tipoReceptor == MASTERCARD){
			return new ReceptorMastercard();
		}else{
			throw new IllegalArgumentException("Tipo de Receptor não suportado");
		}
	}
}
