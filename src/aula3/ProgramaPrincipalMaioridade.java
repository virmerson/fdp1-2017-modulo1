package aula3;

import java.util.Scanner;

public class ProgramaPrincipalMaioridade {

	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Idade:");
		int idade = leitor.nextInt();
		
		Maioridade maioridade =  new Maioridade();
		boolean deMaior = maioridade.deMaior(idade);
		
		System.out.println("De Maior:" +deMaior);
		leitor.close();
	}
}
