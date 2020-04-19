package colleague;

import concretemediator.CentralDeTaxi;

public class Taxi{
	private int id;
	private static int contador = 0;
	private CentralDeTaxi central;
	
	public Taxi(CentralDeTaxi central) {
		this.central = central;
		this.id = Taxi.contador++;
	}

	public CentralDeTaxi getCentral() {
		return central;
	}

	public void setCentral(CentralDeTaxi central) {
		this.central = central;
	}

	public void atende(){
		try {
			long time = (long) (Math.random() * 3000.0);
			System.out.println("Tempo (min) da corrida para o taxi " + this.id + ":" + (time/60));
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.central.adicionarTaxiDisponivel(this);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
