package aula2;

import java.util.Scanner;

public class mediaPonderada {
	public static void main(String[]args) {
		int n1;
		int n2;
		int n3;
		
		int np;
		int np2;
		int np3;
		Scanner nota1 = new Scanner(System.in);
		System.out.println("digite a nota 1:.");
		n1 = nota1.nextInt();
		np = n1*5;
		
		Scanner nota2 = new Scanner(System.in);
		System.out.println("digite a nota 2:.");
		n2 = nota2.nextInt();
		
	    np2 = n2*3;
	    
	    Scanner nota3 = new Scanner(System.in);
	    System.out.println("digite a nota 3:.");
	    n3 = nota3.nextInt();
	    
	    np3 = n3*2;
	    int media;
	    media = (np+np2+np3)/10;
	    System.out.println("a media eh :"+media);
	    
	}

}
