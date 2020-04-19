package com.bios.produto.creator;

import com.bios.produto.impl.CNH;
import com.bios.produto.impl.FNDriverLicense;
import com.bios.produto.interfaces.Habilitacao;


public class HabilitacaoCreator {
	public static final int CNH = 0;
	public static final int FN_DRIVER_LICENSE = 1;
	
	public static Habilitacao create(int habilitacaoType){
		if(habilitacaoType == CNH){
			return new CNH();
		}else if(habilitacaoType ==  FN_DRIVER_LICENSE){
			return new FNDriverLicense();
		}else{
			throw new IllegalArgumentException("Tipo de habilitação não aceito");
		}
	}
}
