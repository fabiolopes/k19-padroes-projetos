package test;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import visitor.AtualizadorDeFuncionario;

import concreteelement.Departamento;
import concreteelement.Gerente;
import concreteelement.Telefonista;
import concretevisitor.AtualizadorSalarial;
import element.Funcionario;

public class TestaAtualizadorSalarial {
	public static void main(String[] args) {
		List<Departamento> lista = new ArrayList<Departamento>();
		Departamento depto1 = new Departamento("Depto1");
		
		Gerente gerente = new Gerente("Gerente 1", 1500, "1234");
		Telefonista telefonista = new Telefonista("Telefonista", 1000, "2");
		
		depto1.getFuncionarios().add(gerente);
		depto1.getFuncionarios().add(telefonista);
		
		lista.add(depto1);
		
		Departamento depto2 = new Departamento("Depto2");
		Gerente gerente2 = new Gerente("Gerente 2", 1800, "1234");
		Gerente gerente3 = new Gerente("Gerente 3", 1800, "1234");
		Telefonista telefonista2 = new Telefonista("Telefonista 2", 1200, "1");
		depto2.getFuncionarios().add(gerente2);
		depto2.getFuncionarios().add(gerente3);
		depto2.getFuncionarios().add(telefonista2);
		
		lista.add(depto2);
		
		AtualizadorDeFuncionario atualizador = new AtualizadorSalarial();
		for (Departamento d : lista) {
			d.aceita(atualizador);
		}
		
		for (Departamento d : lista) {
			for (Funcionario f : d.getFuncionarios()) {
				System.out.println("Nome "+f.getNome() + " - Salário: "+f.getSalario());
			}
		}
	}
}
