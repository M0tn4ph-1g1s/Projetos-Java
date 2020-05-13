package aula2;

import java.util.Scanner;

public class media {
	public static void main(String[]args) {
		int n1;
		int n2;
		int n3;
		
		Scanner num = new Scanner(System.in);
		System.out.println("digite a nota 1:.");
		n1 = num.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("digite a nota 2:.");
		n2 = num2.nextInt();
		
		Scanner num3 = new Scanner(System.in);
		System.out.println("digite a nota 3:.");
		n3 = num3.nextInt();
		
		int cal;
		cal = (n1+n2+n3)/3;
		System.out.println("a media eh "+cal);
		
		
		
	}
	

}
