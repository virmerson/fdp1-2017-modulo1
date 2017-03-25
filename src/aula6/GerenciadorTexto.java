package aula6;

public class GerenciadorTexto {

	private char texto[]= new char[10];
	
	private int posicao = 0;
	
	public void imprimeTexto() {
		
		int i=0;
		
		while(i<texto.length){
			char letra= texto[i];
			System.out.print(letra);
			i=i+1;
		}
	}

	public void adicionarLetra(char letra) {
		if(posicao<=9){
			texto[posicao] = letra;
			posicao=posicao+1;
		}else{
			System.out.println("Nao cabe mais");
		}
	}
	
	
	
	
	

}
