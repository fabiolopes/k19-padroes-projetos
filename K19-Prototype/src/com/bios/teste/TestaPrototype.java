package com.bios.teste;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import com.bios.impl.Campanha;

public class TestaPrototype {
	public static void main(String[] args) {
		String nome = "K-19";
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Curso");
		hashSet.add("Java");
		hashSet.add("K-19");
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);
		
		Campanha clone = campanha.clone();
		System.out.println(clone);
	}
}
