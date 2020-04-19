package com.bios.model.impl;

import com.bios.model.Shape;
import com.bios.model.implementors.Color;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.println("Filled the pentagon with a color");
		this.color.applyColor();
	}

}
