package aula2;
import java.util.Scanner;
public class primosProva {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inicio = in.nextInt();
		int fim = in.nextInt();
		for(int i=inicio;i<=fim;i++) {
			int primo = i;int div =0;
			for(int j=1;j<=primo;j++) {
				if(primo%j==0) {
					div++;
				}
			}
			if(div<3) {
				System.out.println(primo);
			}
		}
		
	}
	
	

}
