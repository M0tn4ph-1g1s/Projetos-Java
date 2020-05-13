package aula2;

import java.util.Scanner;
public class provaPrimos2 {
	public static void main(String [] args) {
		int n1;
		int n2;
		Scanner num1 = new Scanner(System.in);
		System.out.println("digite o maior numero:.");
		n1 = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		System.out.println("digite o menor numero:.");
		n2 = num2.nextInt();
		
		for(int i = n2;i<=n1;i++) {
			int div = 0;
			for (int n = 1;n<=i;n++) {
				if(i%n == 0) {
					div++;
				}
				
			}
			if (div == 2) {
				System.out.println("primo:."+i);
			}
		}
		
	}

}
