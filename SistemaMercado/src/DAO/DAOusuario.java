package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Conexao;
import Model.Login;
import Model.UsuarioUpdate;

public class DAOusuario {
	String login;
	String nome;
	String senha;
	int caixa;
	int iduser;
	public void cadastro(Login usuario) throws SQLException{
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		
		login = usuario.getlogin();
		senha = usuario.getsenha();
		caixa = usuario.getcaixa();
			
		String sql = "INSERT INTO tbusuario(login,senha) values (?,?)";
		PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setString(1, login);
		pstm.setString(2, senha);
		pstm.execute();
		caixa();
	}
	
	public void caixa() throws SQLException {
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		String consul = "SELECT * FROM tbusuario ";
		PreparedStatement consuluser = null;
		ResultSet rs = null;
		consuluser = conn.prepareStatement(consul);
		rs = consuluser.executeQuery();
		while (rs.next()) {		
			iduser = Integer.parseInt(rs.getString("idUser"));
			//System.out.println(rs.getString("idUser"));
		}
		String sql2 = "INSERT INTO tbcaixa(idCaixa,dinheiroCaixa,idUser) values (?,?,?)";
		PreparedStatement pstm2 = (PreparedStatement) conn.prepareStatement(sql2);
		pstm2.setInt(1, caixa);
		pstm2.setInt(2,500);
		pstm2.setInt(3, iduser);
		pstm2.execute();
		
	}
	public void Remove(Login usuario) throws SQLException{
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		int login = Login.getid();
		System.out.println(login);
		try {
			//String sql = "delete from tbusuario where login = '"+login+"'";
			String sql = "delete from tbcaixa where idUser = ?";
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, login);
			pstm.execute();
			
			String sql2 = "delete from tbusuario where idUser = ?";
			PreparedStatement pstm2 = (PreparedStatement) conn.prepareStatement(sql2);
			pstm2.setInt(1, login);
			pstm2.execute();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			
		}
	}
	
	public void Update(UsuarioUpdate userupdate) throws SQLException{
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		
		String login = userupdate.getlogin();
		String newlogin = userupdate.getnewlogin();
		String newsenha = userupdate.getnewsenha();
		
		
		try {
			
			java.sql.Statement myStmt = conn.createStatement();
			
			String sql = "update tbusuario"
					+ " set login = '"+newlogin+"'"
					+ " where login ='"+login+"'";
			
			
			String sql1 = "update tbusuario"
					+ " set senha = '"+newsenha+"'"
					+ " where login ='"+login+"'";
			
			
			myStmt.executeUpdate(sql1);
			myStmt.executeUpdate(sql);
			//myStmt.executeUpdate(sql1);

		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
