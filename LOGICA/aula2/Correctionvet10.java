package aula2;

public class Correctionvet10 {
	public static void main(String[] args) {
		int vet[] = new int[10];
		int primo = 1;
		int contador=0;
		int div =0;
		while (contador<10) {
			for (int i = 1;i<=primo;i++) {
				if(primo%i==0) {
					div++;
				}
			}
			if(div<3) {
				vet[contador] = primo;
				contador++;
			}
			primo++;
		}
		for (int i=0;i<vet.length;i++) {
			System.out.println("vet["+i+"] = "+vet[i]);
		}
 	}

}
