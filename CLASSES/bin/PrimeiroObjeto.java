
public class PrimeiroObjeto {
	String nome;
	int idade;
	int cal;
	int div = 0;
	//int fat;
	
	public void somar(double a,double b) {
		double soma;
		soma = a+b;
		System.out.println("a soma eh"+soma);
		
	}
    public void falar(String texto) {
    	System.out.println(texto);
    	
    }
    public void calcularfat(int n) {
    	int fat;
    	for(fat=1;n>1;n--) {
    		fat = fat*n;
    	}
    	System.out.println("fatorial"+fat);
    	
    }
   
    public void primo(int p) {
    	int i;
    	for(i =1;i<=p;i++) {
    		if(p%i==0) {
    			div++;
    		}
    	}
    	if (div == 2) {
    		System.out.println("eh primo"+p);
    		
    	}	
    	else {
    		System.out.println("nao eh primo"+p);
    	}
    	
    	
    }
    	
    	
    	
    
}
