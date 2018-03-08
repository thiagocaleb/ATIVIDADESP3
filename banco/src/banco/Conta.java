package banco;

public abstract class Conta {
	private static int agencia;
	private static int conta;
	private String titular;
	protected static double saldo;
	private double limite;
	private double valorLimite;
	
	public Conta(int agencia,int conta,String titular) {
		this.agencia =agencia;
		this.conta =conta;
		this.titular =titular;
	}
	public Conta(int agencia,int conta,String titular,
		double saldo,double limite,double valorLimite) {
		
		this.agencia =agencia;
		this.conta =conta;
		this.titular =titular;
		this.saldo = saldo;
		this.limite =limite;
		this.setValorLimite(valorLimite);
		}

	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public static void sacar(double valor) {
		saldo-=valor;
	}
	
	public final void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}



}