package com.bios.model;

import java.util.ArrayList;
import java.util.List;

public class Apresentacao {
	private List<Slide> slides = new ArrayList<Slide>();
	
	public void adicionaSlide(Slide slide){
		slides.add(slide);
	}
	
	public void imprime(){
		for(Slide curSlide: slides){
			curSlide.imprime();
			System.out.println();
		}
	}
}
