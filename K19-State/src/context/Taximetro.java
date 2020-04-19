package context;

import state.Bandeira;

public class Taximetro {
	private Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		super();
		this.setBandeira(bandeira);
	}

	public double calculaValorDaCorrida(double tempo, double distancia) {
		return getBandeira().calculaValorDaCorrida(tempo, distancia);
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	
}
