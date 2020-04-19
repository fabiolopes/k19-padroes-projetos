package com.bios.interfaces;

import java.util.Date;
import java.util.List;

public interface Artigo {
	void setAutor(String nome);
	void setTitulo(String nome);
	void setMarcacoes(List<String> marcacoes);
	void setPaginas(int paginas);
	void setDataDaPublicacao(Date data);
	void setTexto(String texto);
}
