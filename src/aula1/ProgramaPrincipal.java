package aula1;

public class ProgramaPrincipal {

	// Método ou FUnção principal
	public static void main(String[] args) {

		// Instancia de humano

		Humano h1 = new Humano();
		h1.altura = 1.75;
		h1.nome = "Virmerson";
		h1.idade = 35;

		Humano h2 = new Humano();
		h2.nome = "Jão";
		h2.idade = 1;
		h2.altura = 0.50;

		System.out.println("Dados do H1:");
		System.out.println("Nome:" + h1.nome);
		System.out.println("Idade:" + h1.idade);
		System.out.println("Altura:" + h1.altura);

		System.out.println("\nDados do H2:");
		System.out.println("Nome:" + h2.nome);
		System.out.println("Altura:" + h2.altura);

		System.out.println("Idade:" + h2.idade);

	}

}
