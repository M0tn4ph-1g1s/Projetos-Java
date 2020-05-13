import java.util.ArrayList;
import java.util.Scanner;
public class menuArray {
	public static void main(String [] args){
		ArrayList<String> lista = new ArrayList<String>();
		String vet[] = new String [10];
		while(true) {
			int c=0;
		    Scanner e = new Scanner(System.in);
		    System.out.println("digite sua acao:.");
		    System.out.println("1 - cadastrar um nome");
		    System.out.println("2 - excluir um nome");
		    System.out.println("3 - editar um nome");
		    System.out.println("4 - apresentar todos os nomes");
		    System.out.println("5 - sair");
		    int esc = e.nextInt();
		    if (esc==1) {
		    	Scanner n = new Scanner(System.in);
		    	System.out.println("digite o nome a ser adicionado:.");
		    	String nome = n.nextLine();

		    	
		        lista.remove(nome);
		        lista.add(nome);
		    	
		    	 	    	
		    	//MenuClass m = new MenuClass();
		    	//m.add(nome);
		    	
		    }
		    else if(esc == 2) {
		    	Scanner n1 = new Scanner(System.in);
		    	System.out.println("digite o nome a ser removido:.");
		    	String nome1 = n1.nextLine();
		    	lista.remove(nome1);
				System.out.println("nome removido com sucesso");
		    	
		    	//MenuClass m = new MenuClass();
		    	//m.remo(nome1);
		    	
		    	
		    }
		    else if (esc == 3) {
		    	Scanner n2 = new Scanner(System.in);
		    	System.out.println("digite o nome a ser alterado:.");
		    	String nome2 = n2.nextLine();
		    	
		    	Scanner n3 = new Scanner(System.in);
		    	System.out.println("digite o nome substituitor:.");
		    	String nome3 = n3.nextLine();
		    	lista.remove(nome2);
		    	lista.remove(nome3);
		    	lista.add(nome3);
		    	
		    	
		    	//MenuClass m = new MenuClass();
		    	//m.altnome(nome2,nome3);
		    	
		    	
		    }
		    else if(esc == 4) {
		    	for(int i=0;i<lista.size();i++) {
					System.out.println(lista.get(i));
					
				}
		    	
		    }
		    else if(esc == 5) {
		    	System.out.println("finalizado");
		    	break;
		    }
		    
		}
		System.exit(0);
	}

}
