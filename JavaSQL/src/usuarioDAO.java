import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

public class usuarioDAO {
	
	/*public boolean save(Usuario usuario) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		String sql ="INSERT INTO tbusuario(nome,login,senha) values (?,?,?)";
		//java.sql.PreparedStatement stmt = null;
		try {
			//stmt = conn.prepareStatement(sql);
			java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getnome());
			pstm.setString(2, usuario.getlogin());
			pstm.setString(3, usuario.getSenha());
			pstm.executeUpdate();
			return true;
		}
		catch(SQLException ex) {
			Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE,null,ex);
			return false;
		}
	}*/
    public void save(Usuario usuario) {
		String nome ="ayrton";
		String login ="nnn";
		String senha = "nn";
		try {
			Conexao conexao = new Conexao();
			Connection conn = conexao.getConexao();
			//String sql ="INSERT INTO tbusuario(nome,login,senha) values ('"+usuario.getnome()+"','"+usuario.getlogin()+"','"+usuario.getSenha()+"')";
			String sql ="INSERT INTO tbusuario(nome,login,senha) "+"values ('"+nome+"','"+login+"','"+senha+"')";
			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
			/*pstm.setString(1, usuario.getnome());
			pstm.setString(2, usuario.getlogin());
			pstm.setString(3, usuario.getSenha());*/
			pstm.execute();
			System.out.println("cadastrado com sucesso");
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

	

}
