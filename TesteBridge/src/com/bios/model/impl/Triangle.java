package com.bios.model.impl;

import com.bios.model.Shape;
import com.bios.model.implementors.Color;

public class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle filled with a color");
		this.color.applyColor();
		
	}

}
