package com.bios.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque {
	public void enviaProduto(String produto, String enderecoEntrega){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("O produto " + produto + " ser� entregue no endere�o " + enderecoEntrega
				+ " at� as 18h do dia " + format);
	}
}
