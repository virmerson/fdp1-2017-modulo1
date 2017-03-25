package aula5;

import java.util.Scanner;
/**
 * Faça um programa que leia um inteiro n digitado
 * pelo usuário, invoque um método para imprimir
 * N vezes a mensagem "oi" na tela.
 * @author Virmerson
 *
 */
public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Repeticao r =  new Repeticao();
		System.out.println("Digite qtd de ois:");
		
		//Lendo o numero digitado
		int n =  leitor.nextInt();
		//Invoca métodos
		r.repetirOis(n);
		
		
		leitor.close();
		
		
	}
}
