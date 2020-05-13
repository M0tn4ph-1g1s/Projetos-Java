package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.Usuario;
import Model.UsuarioUpdate;

public class UpdateConfig {
	public void Update(UsuarioUpdate userupdate) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/usuario";
		String user = "root";
		String password = "";
		
		String login = userupdate.getlogin();
		String newlogin = userupdate.getnewlogin();
		String newnome = userupdate.getnewnome();
		String newsenha = userupdate.getnewsenha();
		
		
		try {
			Connection myConn = DriverManager.getConnection(url,user,password);
			java.sql.Statement myStmt = myConn.createStatement();
			
			String sql = "update tbusuario"
					+ " set usuario = '"+newlogin+"'"
					+ " where usuario ='"+login+"'";
			
			String sql1 = "update tbusuario"
					+ " set nome = '"+newnome+"'"
					+ " where usuario ='"+login+"'";
			
			String sql2 = "update tbusuario"
					+ " set senha = '"+newsenha+"'"
					+ " where usuario ='"+login+"'";
			
			
			myStmt.executeUpdate(sql1);
			myStmt.executeUpdate(sql2);
			myStmt.executeUpdate(sql);
			//myStmt.executeUpdate(sql1);

		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			
		}
	}

	

}
