package com.bios.business;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bios.model.Carro;

public class VendaCarro {
	
	public void concluirVenda(Carro car){
		System.out.println("Carro vendido: "+car.getName()+"\nValor: R$"+car.getValue()+"; Data:"+getActualTime());
	}
	
	public String getActualTime(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		return simpleDateFormat.format(calendar.getTime());
		
	}
}
