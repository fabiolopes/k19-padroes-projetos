package subject;

import java.util.HashSet;
import java.util.Set;

import observer.AcaoObserver;

public class Acao {

	private String codigo;
	private double valor;
	
	private Set<AcaoObserver> interessados = new HashSet<AcaoObserver>();
	
	public Acao(String codigo, double valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public void registraInteressados(AcaoObserver interessado){
		interessados.add(interessado);
	}
	
	public void cancelaInteresse(AcaoObserver interessado){
		interessados.remove(interessado);
	}

	public String getCodigo() {
		return codigo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
		for (AcaoObserver curAcao : interessados) {
			curAcao.notificaAlteracao(this);
		}
	}
	
	
}
