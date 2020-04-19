package concreteelement;

import visitor.AtualizadorDeFuncionario;
import element.Funcionario;

public class Telefonista extends Funcionario {

	private String ramal;
	
	public Telefonista(String nome, double salario, String ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public void aceita(AtualizadorDeFuncionario atualizador) {
		atualizador.atualiza(this);
	}

}
