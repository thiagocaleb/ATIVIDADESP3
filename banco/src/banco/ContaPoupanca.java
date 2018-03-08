package banco;

public final class ContaPoupanca extends Conta {
	private double juros;
	
	public ContaPoupanca(int agencia, int conta, String titular, double saldo, double limite, double valorLimite, double juros) {
		super(agencia, conta, titular, saldo, limite, valorLimite);
		this.juros =juros;
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valor) {
		this.saldo+=valor+1;
	}
	
}
