package Model;

public class UsuarioUpdate {
	static String login;
	static String newsenha;
	static String newlogin;
	public  void setlogin(String login) {
		this.login = login;
	}
	
	public static String getlogin() {
		return login;
	}
		
	public static String getnewsenha(){
		return newsenha;
	}
	
	public static String getnewlogin(){
		return newlogin;
	}
	
	
	public void setnewsenha(String senha){
		 this.newsenha = senha;
	}
	
	public void setnewlogin(String login){
		 this.newlogin = login;
	}

}
