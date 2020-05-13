package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Controller.Conexao;
import Model.Usuario;

public class RemoveConfig {
	public void Remove(Usuario usuario) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/usuario";
		String user = "root";
		String password = "";
		String login = usuario.getlogin();
		try {
			Connection myConn = DriverManager.getConnection(url,user,password);
			java.sql.Statement myStmt = myConn.createStatement();
			String sql = "delete from tbusuario where usuario ='"+login+"'";
			int rowsAffected = myStmt.executeUpdate(sql);
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			
		}
	}

}
