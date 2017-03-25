package aula4;

public class Calculo {

	int maior1(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else {
			// Ifs aninhados
			if (n2 > n1 && n2 > n3) {
				return n2;
			} else {
				return n3;
			}
		}

	}

	int maior2(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n2 > n1 && n2 > n3) {
			return n2;
		} else {
			return n3;
		}

	}
	
	int maior3(int n1, int n2, int n3) {
		int maior;
		if (n1 > n2 && n1 > n3) {
			maior= n1;
		} else if (n2 > n1 && n2 > n3) {
			maior= n2;
		} else {
			maior= n3;
		}
		
		return maior;

	}
	//n1=10
	//n2=8
	//n3=6
	//n4=1
	public int maiorPar(int n1,int n2, int n3, int n4){
		
		if (n1%2!=0) n1=-1;  //n1 = 12
		if (n2%2!=0) n2=-1; //n2 = 12
		if (n3%2!=0) n3=-1; //n3 = -1
		if (n4%2!=0) n4=-1;//n4 = -1
			
		//12>=12
		if (n1>=n2 && n1 >=n3 && n1>=n4)
			return n1;
		else if (n2>=n1 && n2>=n3 && n2>=n4)
			return n2;
		else if (n3>=n1 && n3>=n2 && n3>=n4)
			return n3;
		else
			return n4;
		
		
	}

}
