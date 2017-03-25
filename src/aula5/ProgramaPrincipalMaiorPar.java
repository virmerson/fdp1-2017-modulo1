package aula5;

import aula4.Calculo;

public class ProgramaPrincipalMaiorPar {

	public static void main(String[] args) {

		
		Calculo calc = new Calculo();
		int maiorPar = calc.maiorPar(12,12,13,15);
		System.out.println(maiorPar);
	}

}
