import concreteobserver.Corretora;
import subject.Acao;


public class TestaObserver {
	public static void main(String[] args) {
		Acao acao = new Acao("VALE3", 45.77);
		Corretora corretora1 = new Corretora("corretora1");
		Corretora corretora2 = new Corretora("corretora2");
		
		acao.registraInteressados(corretora1);
		acao.registraInteressados(corretora2);
		
		acao.setValor(50);
	}
}
