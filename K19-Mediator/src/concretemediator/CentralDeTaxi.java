package concretemediator;

import java.util.ArrayList;
import java.util.List;

import colleague.Passageiro;
import colleague.Taxi;

public class CentralDeTaxi {
	private List<Taxi> taxisLivres = new ArrayList<Taxi>();
	private List<Passageiro> passageirosEmEspera = new ArrayList<Passageiro>();
	
	public synchronized void adicionarTaxiDisponivel(Taxi taxi){
		System.out.println("Taxi " + taxi.getId() + " voltou para a fila");
		taxisLivres.add(taxi);
		this.notifyAll();
	}
	
	public synchronized void pedeTaxi(Passageiro passageiro){
		Taxi taxi = esperaTaxi(passageiro);
		System.out.println("Taxi " + taxi.getId() + " levando " + passageiro.getNome());
		taxi.atende();
	}
	
	private Taxi esperaTaxi(Passageiro passageiro){
		this.passageirosEmEspera.add(passageiro);
		synchronized (this) {
			while(this.taxisLivres.isEmpty() || this.passageirosEmEspera.get(0).equals(passageiro)){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.passageirosEmEspera.remove(0);
			return this.taxisLivres.remove(0);
		}
	}
}
