package aula2;

public class ProgramaPrincipalCalculadora {

	
	public static void main(String[] args) {
		//Instancia de calculadora
		Calculadora calc =  new Calculadora();
		calc.marca="Marca X";
		calc.tamanho='p';
		
		int soma = calc.somar(20, 30);
		
		System.out.println(soma);
		
		int sub = calc.subtrair(20,10);
		
		System.out.println(sub);
		
	}
}
