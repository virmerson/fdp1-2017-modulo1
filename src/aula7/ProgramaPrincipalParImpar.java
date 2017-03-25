package aula7;

import java.util.Scanner;

public class ProgramaPrincipalParImpar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Numeros numeros = new Numeros();
		
		for (int i=0;i<10;i++){
			System.out.println("Digite um numero:");
			numeros.adicionar(leitor.nextInt());
		}
		
		int maiorPar =  numeros.obterMaiorPar();
		int maiorImpar =  numeros.obterMaiorImpar();
		int maiorTodos = numeros.obterMaiorTodos();
		
		System.out.println("Maior Par:" + maiorPar);
		System.out.println("Maior ImPar:" + maiorImpar);
		System.out.println("Maior Todos:" + maiorTodos);
		
		
		leitor.close();
		
		

	}

}
