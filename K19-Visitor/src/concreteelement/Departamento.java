package concreteelement;

import java.util.ArrayList;
import java.util.List;

import visitor.AtualizadorDeFuncionario;

import element.Funcionario;

public class Departamento {
	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Departamento(String nome) {
		super();
		this.nome = nome;
	}

	public void aceita(AtualizadorDeFuncionario atualizador){
		for (Funcionario f : funcionarios) {
			f.aceita(atualizador);
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
