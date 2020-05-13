package aula2;

import java.util.Scanner;

public class numSerie {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite um numero:.");
		int n = in.nextInt();
		for (int i=1;i<n;i++) {
			//imp 0 a esq
			int qtdeZero = n;
			for(int j=0;j<qtdeZero;j++) {
				System.out.println("0");
				
			}
			//imp o valor
			for(int j=0;j<(i*2);j++) {
				System.out.println(i);
				
			}
			//imp zero dir
			for(int j=0;j<qtdeZero;j++) {
				System.out.println("0");
			}
			qtdeZero--;
			System.out.println();
		}
		
		
	}

}
