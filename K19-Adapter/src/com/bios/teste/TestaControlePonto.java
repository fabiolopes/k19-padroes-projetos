package com.bios.teste;

import com.bios.adapter.ControlePontoAdapter;
import com.bios.controle.ControlePonto;
import com.bios.model.Funcionario;

public class TestaControlePonto {
	public static void main(String[] args) throws InterruptedException {
		ControlePonto controlePonto = new ControlePontoAdapter();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controlePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controlePonto.registrarSaida(funcionario);
	}
}
