package aula3;

public class ProgramaPrincipalOperadores {

	public static void main(String[] args) {
		//<   <=   >  >=    ==   !=
		boolean relampago=false;
		boolean chuva=false;
		
		//boolean chora = (relampago && chuva);
		//boolean chora = (relampago || chuva);
		boolean chora = !(relampago && chuva);
		
		
		
		System.out.println("Thiago chora: " + chora);

	}

}
