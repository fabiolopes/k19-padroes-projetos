package concreteobserver;

import observer.AcaoObserver;
import subject.Acao;

public class Corretora implements AcaoObserver{

	private String nome;
	
	public Corretora(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void notificaAlteracao(Acao acao) {
		System.out.println("Corretora " + this.nome + " sendo notificada:");
		System.out.println("A ação " + acao.getCodigo() + " teve seu valor alterado para " + acao.getValor());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
