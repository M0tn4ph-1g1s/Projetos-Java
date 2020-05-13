package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Usuario;

public class CadastroBanco {
	String login;
	String nome;
	String senha;
	public void cadastro(Usuario usuario) throws SQLException{
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		
		nome = usuario.getnome();
		login = usuario.getlogin();
		senha = usuario.getsenha();
		/*System.out.println(nome);
		System.out.println(login);
		System.out.println(senha);*/
		
		String sql = "INSERT INTO tbusuario(usuario,nome,senha) values (?,?,?)";
		PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setString(1, login);
		pstm.setString(2, nome);
		pstm.setString(3, senha);
		pstm.execute();
		
		
		
	}

}
