package com.bios.adapter;

import com.bios.business.NovoVendaCarro;
import com.bios.business.VendaCarro;
import com.bios.model.Carro;
import com.bios.model.Venda;

public class VendaCarroAdapter extends VendaCarro{
	private NovoVendaCarro novoVendaCarro;
	
	public VendaCarroAdapter() {
		this.novoVendaCarro = new NovoVendaCarro();
	}
	
	@Override
	public void concluirVenda(Carro car) {
		Venda venda = new Venda(car);
		venda.setHoraVenda(getActualTime());
		novoVendaCarro.confirmarVenda(venda);
	}

	public NovoVendaCarro getNovoVendaCarro() {
		return novoVendaCarro;
	}

	public void setNovoVendaCarro(NovoVendaCarro novoVendaCarro) {
		this.novoVendaCarro = novoVendaCarro;
	}
	
}
