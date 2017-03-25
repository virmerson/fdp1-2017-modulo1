package aula7;

public class Numeros {

	
	private int vetor[] = new int[10];
	private int indice=0;
	private int maiorPar=0;
	private int maiorImpar=0;
	private int maiorTodos=0;
	
	public void adicionar(int numero) {
		
		//descobre o maior par
		if (numero%2==0){
			if (numero>maiorPar){
				maiorPar =numero;
			}
		}else{ //descobre o maior impar
			if (numero>maiorImpar){
				maiorImpar =numero;
			}
		}
		//Descobre o maior de todos
		if (numero>maiorTodos){
			maiorTodos = numero;
		}
		
		//Insere no vetor
		if (indice<vetor.length){
			vetor[indice]=numero;
			indice++;
		}
	}

	public int obterMaiorPar() {
		return maiorPar;
	}

	public int obterMaiorImpar() {
		
		return maiorImpar;
	}

	public int obterMaiorTodos() {
		return maiorTodos;
	}

	
	
	
	
	
	
	
	
	
	
	
	/* public void adicionar(int numero) {
		if (indice<vetor.length){
			vetor[indice]=numero;
			indice++;
		}
	}

	public int obterMaiorPar() {
		int maior =0;
		for (int i=0;i<vetor.length; i++){
			if (vetor[i]%2==0){ //é par?
				if (vetor[i] > maior){// é maior que o maior?
					maior = vetor[i];//troca o maior
				}
			}
		}
		return maior;
	}

	public int obterMaiorImpar() {
		
		int maior =0;
		for (int i=0;i<vetor.length; i++){
			if (vetor[i]%2!=0){ //é impar?
				if (vetor[i] > maior){// é maior que o maior?
					maior = vetor[i];//troca o maior
				}
			}
		}
		return maior;
	}

	public int obterMaiorTodos() {
		int maior =0;
		for (int i=0;i<vetor.length; i++){
				if (vetor[i] > maior){// é maior que o maior?
					maior = vetor[i];//troca o maior
				}
		}
		return maior;
	}
*/
	
	

}
