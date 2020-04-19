package com.bios.adapter;

import com.bios.controle.ControlePonto;
import com.bios.controle.ControlePontoNovo;
import com.bios.model.Funcionario;

public class ControlePontoAdapter extends ControlePonto{
	private ControlePontoNovo controlePontoNovo;
	
	public ControlePontoAdapter(){
		this.setControlePontoNovo(new ControlePontoNovo());
	}

	@Override
	public void registraEntrada(Funcionario f) {
		controlePontoNovo.registra(f, true);
	}
	
	@Override
	public void registrarSaida(Funcionario f) {
		controlePontoNovo.registra(f, false);
	}
	
	public ControlePontoNovo getControlePontoNovo() {
		return controlePontoNovo;
	}

	public void setControlePontoNovo(ControlePontoNovo controlePontoNovo) {
		this.controlePontoNovo = controlePontoNovo;
	}
}
