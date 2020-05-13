import java.util.Scanner;
public class Calculadora {
	public static void main(String [] args) {
		int esc ;
		double num1;
		double num2;
		double num3;
		double num4;
		
		while(true) {
		    Operacoes op = new Operacoes();
	        System.out.println("1 - somar");
	        System.out.println("2 - subitrair");
	        System.out.println("3 - dividir");
	        System.out.println("4 - multiplicar");
	        Scanner n = new Scanner(System.in);
	        System.out.println("digite a operação");
	        esc = n.nextInt();
	    
	        //Somar
	        if (esc == 1) {
	    	    Scanner n2 = new Scanner(System.in);
	    	    System.out.print("digite o numero de variaveis(2,3 ou 4) ");
	    	    esc = n2.nextInt();
	    	    if (esc == 2) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        op.somar(num1, num2);
	    	     
	    	    } 
	    	
	    	    else if (esc == 3) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	    
	    	        op.somar(num1, num2,num3);
	    	     
	    	    }
	    	
	    	    else if (esc == 4) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	     
	    	        Scanner numero4 = new Scanner(System.in);
	    	        System.out.print("digite o quarto numero");
	    	        num4 = numero4.nextDouble();
	    	    
	    	        op.somar(num1, num2,num3,num4);
	    	     
	    	    }
	        }
	    
	        //subtrair
	    
	        else if (esc == 2) {
	    	    Scanner n2 = new Scanner(System.in);
	    	    System.out.print("digite o numero de variaveis(2,3 ou 4) ");
	    	    esc = n2.nextInt();
	    	    if (esc == 2) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        op.subtrair(num1, num2);
	    	     
	    	    }
	    	
	    	    else if (esc == 3) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	    
	    	        op.subtrair(num1, num2,num3);
	    	     
	     	    }
	    	
	    	    else if (esc == 4) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	     
	    	        Scanner numero4 = new Scanner(System.in);
	    	        System.out.print("digite o quarto numero");
	    	        num4 = numero4.nextDouble();
	    	    
	    	        op.subtrair(num1, num2,num3,num4);
	    	     
	    	    }
	    	
	        }
	        //dividir
	    
	        else if (esc == 3) {
	    	    Scanner n2 = new Scanner(System.in);
	    	    System.out.print("digite o numero de variaveis(2,3 ou 4) ");
	    	    esc = n2.nextInt();
	    	    if (esc == 2) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        op.dividir(num1, num2);
	    	     
	    	    }
	    	
	    	    else if (esc == 3) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	    
	    	        op.dividir(num1, num2,num3);
	    	     
	    	    }
	    	
	    	    else if (esc == 4) {
	    	        Scanner numero1 = new Scanner(System.in);
	    	        System.out.print("digite o primeiro numero");
	    	        num1 = numero1.nextDouble();
	    	     
	    	        Scanner numero2 = new Scanner(System.in);
	    	        System.out.print("digite o segundo numero");
	    	        num2 = numero2.nextDouble();
	    	     
	    	        Scanner numero3 = new Scanner(System.in);
	    	        System.out.print("digite o terceiro numero");
	    	        num3 = numero3.nextDouble();
	    	     
	    	        Scanner numero4 = new Scanner(System.in);
	    	        System.out.print("digite o quarto numero");
	    	        num4 = numero4.nextDouble();
	    	    
	    	        op.dividir(num1, num2,num3,num4);
	    	     
	    	    }
	        }
	    	//multiplicaçao
	    	
	    	else if (esc == 4) {
	 	    	Scanner n3 = new Scanner(System.in);
	 	    	System.out.print("digite o numero de variaveis(2,3 ou 4) ");
	 	    	esc = n3.nextInt();
	 	    	if (esc == 2) {
	 	    	    Scanner numero1 = new Scanner(System.in);
	 	    	    System.out.print("digite o primeiro numero");
	 	    	    num1 = numero1.nextDouble();
	 	    	     
	 	    	    Scanner numero2 = new Scanner(System.in);
	 	    	    System.out.print("digite o segundo numero");
	 	    	    num2 = numero2.nextDouble();
	 	    	     
	 	    	    op.mult(num1, num2);
	 	    	     
	 	    	}
	 	    	
	 	    	else if (esc == 3) {
	 	    	    Scanner numero1 = new Scanner(System.in);
	 	    	    System.out.print("digite o primeiro numero");
	 	    	    num1 = numero1.nextDouble();
	 	    	     
	 	    	    Scanner numero2 = new Scanner(System.in);
	 	    	    System.out.print("digite o segundo numero");
	 	    	    num2 = numero2.nextDouble();
	 	    	     
	 	    	    Scanner numero3 = new Scanner(System.in);
	 	    	    System.out.print("digite o terceiro numero");
	 	    	    num3 = numero3.nextDouble();
	 	    	    
	 	    	    op.mult(num1, num2,num3);
	 	    	     
	 	    	}
	 	    	
	 	    	else if (esc == 4) {
	 	    	    Scanner numero1 = new Scanner(System.in);
	 	    	    System.out.print("digite o primeiro numero");
	 	    	    num1 = numero1.nextDouble();
	 	    	     
	 	    	    Scanner numero2 = new Scanner(System.in);
	 	    	    System.out.print("digite o segundo numero");
	 	    	    num2 = numero2.nextDouble();
	 	    	     
	 	    	    Scanner numero3 = new Scanner(System.in);
	 	    	    System.out.print("digite o terceiro numero");
	 	    	    num3 = numero3.nextDouble();
	 	    	     
	 	    	    Scanner numero4 = new Scanner(System.in);
	 	    	    System.out.print("digite o quarto numero");
	 	    	    num4 = numero4.nextDouble();
	 	    	    
	 	    	    op.mult(num1, num2,num3,num4);
	 	    	     
	 	    	}	
	 	    }	
	    }    
	}
}
