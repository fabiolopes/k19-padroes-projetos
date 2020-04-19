package com.bios.teste;

import com.bios.model.Shape;
import com.bios.model.impl.Pentagon;
import com.bios.model.implementors.Color;
import com.bios.model.implementors.impl.Red;

public class TesteShape {
	public static void main(String[] args) {
		Color cor = new Red();
		Shape triangulo = new Pentagon(cor);
		triangulo.applyColor();
	}
}
