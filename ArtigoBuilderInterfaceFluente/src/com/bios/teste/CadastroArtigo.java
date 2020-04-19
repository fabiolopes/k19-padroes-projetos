package com.bios.teste;

import com.bios.impl.BlogBuilder;
import com.bios.impl.JornalBuilder;
import com.bios.impl.RevistaBuilder;
import com.bios.interfaces.Artigo;

public class CadastroArtigo {
	public static void main(String[] args) {
		String autor = "Bione, Fabio";
		String titulo = "Aprendendo builder pattern";
		String[] assuntos = new String[]{"Builder", "Design Patterns", "Java"};
		int[] data = new int[]{20, 3, 2005};
		int paginas = 2;
		String texto = "O padrão de projeto Builder...";
		
		Artigo blog = BlogBuilder.builder()
								 .autor(autor)
								 .titulo(titulo)
								 .assuntos(assuntos)
								 .publicadoEm(data[0], data[1], data[2])
								 .totalDePaginas(paginas)
								 .texto(texto)
								 .get();
		
		System.out.println(blog.toString());
		
		Artigo revista = RevistaBuilder.builder()
		   							 .autor(autor)
									 .titulo(titulo)
									 .assuntos(assuntos)
									 .publicadoEm(data[0], data[1], data[2])
									 .totalDePaginas(paginas)
									 .texto(texto)
									 .get();
		
		System.out.println(revista.toString());
		
		Artigo jornal = JornalBuilder.builder()
									.autor(autor)
									 .titulo(titulo)
									 .assuntos(assuntos)
									 .publicadoEm(data[0], data[1], data[2])
									 .totalDePaginas(paginas)
									 .texto(texto)
									 .get();
		
		System.out.println(jornal.toString());
	}
}
