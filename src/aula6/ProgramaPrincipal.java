package aula6;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		GerenciadorTexto gerenciador = new GerenciadorTexto();
		
		
		//Adicionar
		gerenciador.adicionarLetra('a'); //0
		gerenciador.adicionarLetra('b'); //1
		gerenciador.adicionarLetra('c');//2
		gerenciador.adicionarLetra('c');
		gerenciador.adicionarLetra('c');
		gerenciador.adicionarLetra('c');
		gerenciador.adicionarLetra('c');
		gerenciador.adicionarLetra('c');
		
		
		//ler
		gerenciador.imprimeTexto();
	}
}
