package aula2;
import java.util.Scanner;
public class vetorPrimos {
	public static void main (String[] args) {
		//int div=0;
		int l = 1;
		for(int n=0;n<=30;n++) {
			int div=0;
			for (int i=1;i<=n;i++) {
				if(n%i==0) {
					div=div+1;	
				}
				
			}
			if(div==2) {
				System.out.println("eh primo:."+n);
			}
			else {
				continue;
			}
			
		}
		
	}

}
