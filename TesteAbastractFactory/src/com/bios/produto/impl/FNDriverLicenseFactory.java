package com.bios.produto.impl;

import com.bios.produto.creator.HabilitacaoCreator;
import com.bios.produto.interfaces.Habilitacao;
import com.bios.produto.interfaces.HabilitacaoFactory;

public class FNDriverLicenseFactory implements HabilitacaoFactory{
	
	@Override
	public Habilitacao createHabilitacao() {
		return HabilitacaoCreator.create(HabilitacaoCreator.FN_DRIVER_LICENSE);
	}

}
