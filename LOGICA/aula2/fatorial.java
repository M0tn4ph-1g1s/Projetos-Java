package aula2;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int fat;
        Scanner num = new Scanner(System.in);
        System.out.println("digite um numero");
        n = num.nextInt();

        for (fat = 1;n>1;n --){
        	fat = fat*n;
        }
        System.out.println("o fatorial eh"+fat);

	}

}
