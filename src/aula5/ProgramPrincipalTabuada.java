package aula5;

import java.util.Scanner;

/**
 * 
 * Faça um program que leia 1 numero n inteiro entre 1 a 9 e imprima sua tabuada 
 *  z vezes enquanto o valor n for diferente de zero.
 *  Quando usuario digitar 0 o programa deve ser encerrado com uma mensagem.
 * 
 * 
 * @author Virmerson
 *
 */
public class ProgramPrincipalTabuada {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			int n=0;
			do{
				System.out.println("Digite n ou 0 para sair:");
				n =  leitor.nextInt();
				if(n!=0){
					Tabuada tab = new Tabuada();
					tab.imprimirTabuada(n);
				}
			}while(n!=0);
			System.out.println("Programa Encerrado");
			leitor.close();
	}

}
