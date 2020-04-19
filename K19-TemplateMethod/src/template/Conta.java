package template;

public abstract class Conta {
	private double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
		this.saldo -= this.calculaTaxa();
	}
	
	public void saca(double valor){
		this.saldo -= valor;
		this.saldo -= this.calculaTaxa();
	}
	
	public abstract double calculaTaxa();

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
