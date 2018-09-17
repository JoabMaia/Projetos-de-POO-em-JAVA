package Banco_IFPB;

import java.util.Scanner;
import java.math.BigDecimal;

public class Menu{
	public static void main(String[] args){
	ContaCorrente cadastro = new ContaCorrente(4342, "Joab Silva", 0);
			
        int op��o = 0;
        while ( op��o != 5 )
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

            System.out.print( "Digite uma op��o: " );
            Scanner	in = new Scanner( System.in );
            op��o = in.nextInt();

            if ( op��o == 1 ){
            	double valor_deposito;
            	System.out.println("Digite seu Deposito:");
            	valor_deposito = in.nextDouble();
            	cadastro.deposito(valor_deposito);
            } 
            else if (op��o == 2) {
            	double valor_saque;
            	System.out.println("Digite o valor do seu Saque:");
            	valor_saque = in.nextDouble();
            	cadastro.saque(valor_saque);
            }
            else if (op��o == 3) {
            	cadastro.extrato();
            }
            else if(op��o == 4) {
            	cadastro.extrato_saldo();
            }
            else if (op��o == 5){
                System.out.println( "At� logo..." );
                System.exit( 0 );
            } 
            else{
                System.out.println( "Op��o inv�lida! Digite um n�mero entre 1 e 5" );
            }
        }
    }
 }

