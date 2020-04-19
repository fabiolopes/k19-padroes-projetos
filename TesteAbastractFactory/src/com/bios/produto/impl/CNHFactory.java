package com.bios.produto.impl;

import com.bios.produto.creator.HabilitacaoCreator;
import com.bios.produto.interfaces.Habilitacao;
import com.bios.produto.interfaces.HabilitacaoFactory;

public class CNHFactory implements HabilitacaoFactory{
	
	@Override
	public Habilitacao createHabilitacao() {
		return HabilitacaoCreator.create(HabilitacaoCreator.CNH);
	}

}
