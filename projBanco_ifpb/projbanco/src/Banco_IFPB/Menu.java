package Banco_IFPB;

import java.util.Scanner;
import java.math.BigDecimal;

public class Menu{
	public static void main(String[] args){
	ContaCorrente cadastro = new ContaCorrente(4342, "Joab Silva", 0);
			
        int opção = 0;
        while ( opção != 5 )
        {
            System.out.println( "+--------------------------+" );
            System.out.println( "Menu: ");
            System.out.println( "+--------------------------+" );
            System.out.println("1-Deposito");
            System.out.println("2-Saque");
            System.out.println("3-Extrato");
            System.out.println("4-Extrato Saldo");
            System.out.println("5- Sair");
            System.out.println( "+--------------------------+" );

            System.out.print( "Digite uma opção: " );
            Scanner	in = new Scanner( System.in );
            opção = in.nextInt();

            if ( opção == 1 ){
            	double valor_deposito;
            	System.out.println("Digite seu Deposito:");
            	valor_deposito = in.nextDouble();
            	cadastro.deposito(valor_deposito);
            } 
            else if (opção == 2) {
            	double valor_saque;
            	System.out.println("Digite o valor do seu Saque:");
            	valor_saque = in.nextDouble();
            	cadastro.saque(valor_saque);
            }
            else if (opção == 3) {
            	cadastro.extrato();
            }
            else if(opção == 4) {
            	cadastro.extrato_saldo();
            }
            else if (opção == 5){
                System.out.println( "Até logo..." );
                System.exit( 0 );
            } 
            else{
                System.out.println( "Opção inválida! Digite um número entre 1 e 5" );
            }
        }
    }
 }

