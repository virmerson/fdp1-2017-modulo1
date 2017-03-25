package aula4;

public class Aluno {
	
	
	String calcularMedia(double nota1,double nota2, double nota3){
			double media = (nota1 + nota2 + nota3)/3;
			
			
			String situacao;
			
			if (media>=7){
				 situacao = "Aprovado";
			}else if (media >=4 && media <7) {
				 situacao = "Prova Final";
			}else {
				 situacao = "Reprovado";
			}
			
			
			return situacao;
			
	}

	
}
