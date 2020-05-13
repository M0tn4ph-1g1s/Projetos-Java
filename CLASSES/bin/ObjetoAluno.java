import java.util.Scanner;
public class ObjetoAluno {
	public static void main(String[] args) {
		PrimeiroObjeto a = new PrimeiroObjeto();
	
		a.idade = 17;
		a.nome ="jose";
		System.out.println("aluno"+a.nome+"de idade"+a.idade);
		
		a.falar("ola");
		a.calcularfat(5);
		a.primo(10);
		
		
		
		
	}

}
