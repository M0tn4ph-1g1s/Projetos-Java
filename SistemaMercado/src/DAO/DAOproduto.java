package DAO;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.Conexao;
import Model.Produto;
import Model.ProdutoUpdate;
import Model.UsuarioUpdate;

public class DAOproduto {
	public void Remove(Produto pro) throws SQLException{
		int id = pro.getId();
		try {
			Conexao conexao = new Conexao();
			Connection conn = conexao.getConexao();	
		    java.sql.Statement myStmt = conn.createStatement();
		    String sql = "delete from tbproduto where idProduto = "+id;
		    int rowsAffected = myStmt.executeUpdate(sql);		
	    }
	    catch(Exception exc) {
		  exc.printStackTrace();	
	    }
	}
	
	public void Update(ProdutoUpdate produto) throws SQLException{

		int id = produto.getId();
		String novonome = produto.getnovoNome();
		int novoqtd = produto.getnovoQtd();
		Double novopreco = produto.getnovopreco();
		
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();	
		ResultSet rs = null;
		try {
			java.sql.Statement myStmt = conn.createStatement();
			String sql = "update tbproduto"
					+ " set nome = '"+novonome+"'"
					+ " where idProduto ='"+id+"'";
			
			
			String sql2 ="update tbproduto"
					+ " set preco = '"+novopreco+"'"
					+ " where idProduto ='"+id+"'";
			
			String sql3="update tbproduto"		
					+ " set qtd = '"+novoqtd+"'"
					+ " where idProduto ='"+id+"'";
			myStmt.executeUpdate(sql);
			myStmt.executeUpdate(sql2);	
			myStmt.executeUpdate(sql3);	
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			
		}
	}
	public void cadastro(Produto produto ) throws SQLException{
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
		
		String nome = produto.getNome();
		int qtd = produto.getQtd();
		Double preco = produto.getpreco();
		int codigo = produto.getcodigo();
		
		
		String sql = "INSERT INTO tbproduto(nome,preco,qtd,codigo) values (?,?,?,?)";
		PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setString(1, nome);
		pstm.setDouble(2, preco);
		pstm.setInt(3, qtd);
		pstm.setInt(4,codigo);
		pstm.execute();
	}
	

}
