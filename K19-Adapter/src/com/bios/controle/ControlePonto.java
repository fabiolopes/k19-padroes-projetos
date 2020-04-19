package com.bios.controle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bios.model.Funcionario;

public class ControlePonto {
	public void registraEntrada(Funcionario f){
		String time = getActualTime();
		System.out.println("Entrada: " + f.getNome() + " �s " + time);
	}
	
	public void registrarSaida(Funcionario f){
		String time = getActualTime();
		System.out.println("Sa�da: " + f.getNome() + " �s " + time);
	}
	
	public String getActualTime(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		return simpleDateFormat.format(calendar.getTime());
		
	}
}
