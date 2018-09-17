package Banco_IFPB;

import java.math.BigDecimal;

public class CadastrarCliente {
	private int número;
	private String titular;
	private double saldo;
	
	public CadastrarCliente(int número, String titular, double saldo){
		setNúmero(número);
		setTitular(titular);
		setSaldo(saldo);
		
	}
	public CadastrarCliente() {
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

