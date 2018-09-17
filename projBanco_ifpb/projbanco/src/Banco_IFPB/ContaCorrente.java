package Banco_IFPB;

public class ContaCorrente {
	private int n�mero;
	private String titular;
	private double saldo;
	
	public ContaCorrente(int n�mero, String titular, double saldo){
		setN�mero(n�mero);
		setTitular(titular);
		setSaldo(saldo);
		
	}
	public ContaCorrente() {
		setN�mero(0);
		setTitular("Sem identifica��o de nome");
		setSaldo(0.0);
	}
	
	public int getN�mero() {
		return n�mero;
	}
	public void setN�mero(int n�mero) {
		if( n�mero > 0 )
		this.n�mero = n�mero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if( titular != null && titular.length() > 0 ) 
			this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(n�mero > 0) {
		this.saldo = saldo;
		}
	}
	public boolean saque(double valor) {
		if(valor > 0 && valor <= saldo){
			double cpmf = CalculaCPMF(valor); 
			saldo -= valor;
			DescontaCPMF(cpmf); 
			return true;
		}
		return false;
	}
	public boolean	deposito(double valor) {
		if( valor > 0 ){ 
			saldo += valor;
			return true;
		}
		return false;
	}
	public double saldo() {
		return saldo;
	}
	public void extrato(){
		System.out.printf("Conta: %d\nTitular: %s\nSaldo: R$%.2f\n", n�mero, titular, saldo);	
	}
	public void extrato_saldo() {
		System.out.printf("Saldo: R$%.2f\n", saldo);	
	}
	private double CalculaCPMF(double quantia) {
		return quantia * .01;
	}
	private void DescontaCPMF(double valor) {
		 saldo = saldo -  valor;
	}

}

