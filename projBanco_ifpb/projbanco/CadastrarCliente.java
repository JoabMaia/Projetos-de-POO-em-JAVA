package Banco_IFPB;

import java.math.BigDecimal;

public class CadastrarCliente {
	private int n�mero;
	private String titular;
	private double saldo;
	
	public CadastrarCliente(int n�mero, String titular, double saldo){
		setN�mero(n�mero);
		setTitular(titular);
		setSaldo(saldo);
		
	}
	public CadastrarCliente() {
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
		BigDecimal quantia1 = new BigDecimal(valor);
		if(quantia1.doubleValue() > 0 && quantia1.doubleValue() <= saldo){
			double cpmf = CalculaCPMF(quantia1); 
			saldo -= valor;
			DescontaCPMF(cpmf); 
			return true;
		}
		return false;
	}
	public boolean	deposito(double valor) {
		BigDecimal quantia2 = new BigDecimal(valor);
		if(quantia2.doubleValue() > 0){ 
			saldo += quantia2;
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

