package aula2;
import java.util.Scanner;
public class VetorPrimos2 {
	public static void main(String[]args) {
		int l;
		int div=0;
		Scanner num = new Scanner(System.in);
		System.out.println("digite um numero:.");
		l = num.nextInt();
		
		for (int i = 0;i<=l;i++) {
			if(l%i==0) {
				div++;
				
			}
			
		}
		if(div==2) {
			System.out.println("eh primo:."+l);
			
		}
		else {
			System.out.println("nao eh primo");
		}
		
	}

}
