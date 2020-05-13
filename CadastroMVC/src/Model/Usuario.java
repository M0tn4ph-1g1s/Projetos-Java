package Model;

public class Usuario {
	static String nome;
	static String senha;
	static String login;
	
	public static String getnome(){
		return nome;
	}
	
	public static String getsenha(){
		return senha;
	}
	
	public static String getlogin(){
		return login;
	}
	
	public void setnome(String nome){
		 this.nome = nome;
	}
	
	public void setsenha(String senha){
		 this.senha = senha;
	}
	
	public void setlogin(String login){
		 this.login = login;
	}

}
