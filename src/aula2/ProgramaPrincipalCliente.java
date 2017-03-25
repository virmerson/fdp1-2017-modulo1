package aula2;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {
		//Exercicio 1
		//Criar 3 instancias c1, c2, c3
		//Atribuir dados as propriedade de cada cliente
		
		
		
		
		//Declaração, Construção da instancia e atribuicao a variavel de ref.
		Cliente c1= new Cliente();
		Cliente c2=new Cliente();
		Cliente c3=new Cliente();
		
		//Atribuição dos dados para as propriedades
		c1.nome="Jão";
		c1.idade=15;
		
		c2.nome="Zé";
		c2.idade=20;
		
		c3.nome="Maria";
		c3.idade=30;
		
		
		System.out.println(c1.nome + " "+ c1.idade);
		System.out.println(c2.nome + " " + c2.idade);
		System.out.println(c3.nome + " "+ c3.idade);
		
		
	}
}
