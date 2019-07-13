package entities;

public class Controle {
	
	private int nConta;
	private String name;
	private double balanco;
	
	public Controle() {
	}
	
	public Controle(int nConta, String name, double depInicial) {
		this.nConta = nConta;
		this.name = name;
		deposito(depInicial);
	}
	
	public Controle(int nConta, String name) {
		this.nConta = nConta;
		this.name = name;
	}

	public int getnConta() {
		return nConta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalanco() {
		return balanco;
	}

	public void deposito(double amount) {
		balanco += amount;
	}
	public void saque(double amount) {
		balanco -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ nConta
				+ ", holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balanco);
	}
	


}
