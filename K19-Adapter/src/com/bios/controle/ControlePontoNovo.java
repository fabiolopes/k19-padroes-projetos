package com.bios.controle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bios.model.Funcionario;

public class ControlePontoNovo {
	public void registra(Funcionario f, boolean entrada){
		String time = getActualTime();
		if(entrada){
			System.out.println("Entrada: " + f.getNome() + " às " + time);
		}else{
			System.out.println("Saída: " + f.getNome() + " às " + time);
		}
	}
	
	
	public String getActualTime(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		return simpleDateFormat.format(calendar.getTime());
		
	}
}
