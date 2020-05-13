package Model;

public class Login {
	static String senha;
	static String login;
	static int idCaixa;
	static int id;
		
	public static String getsenha(){
		return senha;
	}
	
	public static String getlogin(){
		return login;
	}	
	
	public void setsenha(String senha){
		 this.senha = senha;
	}
	
	public void setlogin(String login){
		 this.login = login;
	}
	public void setcaixa(int caixa) {
		this.idCaixa = caixa;
	}
	public static int getcaixa() {
		return idCaixa;
	}
	public void setid(int id) {
		this.id = id;
	}
	public static int getid() {
		return id;
	}

}
