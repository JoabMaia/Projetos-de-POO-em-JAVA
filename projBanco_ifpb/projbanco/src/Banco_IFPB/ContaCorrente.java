package Banco_IFPB;

public class ContaCorrente {
	private int número;
	private String titular;
	private double saldo;
	
	public ContaCorrente(int número, String titular, double saldo){
		setNúmero(número);
		setTitular(titular);
		setSaldo(saldo);
		
	}
	public ContaCorrente() {
		setNúmero(0);
		setTitular("Sem identificação de nome");
		setSaldo(0.0);
	}
	
	public int getNúmero() {
		return número;
	}
	public void setNúmero(int número) {
		if( número > 0 )
		this.número = número;
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
		if(número > 0) {
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
		System.out.printf("Conta: %d\nTitular: %s\nSaldo: R$%.2f\n", número, titular, saldo);	
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

