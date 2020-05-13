package Controller;

import java.sql.SQLException;

import View.Tela;
import View.TelaLogin;
import View.TelaUser;
import View.UpdateProduto;

public class init {
	public static void main(String[]args) throws SQLException{
		TelaLogin l = new TelaLogin();
		l.Tela();	
	}
}

