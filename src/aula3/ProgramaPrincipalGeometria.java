package aula3;

import java.util.Scanner;

public class ProgramaPrincipalGeometria {

	public static void main(String[] args) {
		//Instanciando um objeto capaz de ler dados
		Scanner leitor =  new Scanner(System.in);
		
		// ##### Entrada de dados (leitura de dados) ####
		System.out.println("Base:");
		double b = leitor.nextDouble();
		
		System.out.println("Altura:");
		double a = leitor.nextDouble();
		
		//##### Processamento #####
		//Instanciando um objeto da classe Geometria
		Geometria geo = new Geometria();
		double area = geo.calAreaRetangulo(b, a);
		
		//##### Saída ##### 
		System.out.println("Área: " + area);
		
		leitor.close();
	}

}
