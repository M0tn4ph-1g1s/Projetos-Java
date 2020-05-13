package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import Controller.Conexao;

import java.awt.*;
import java.util.*;
public class Listar extends JFrame  implements ActionListener{
	public void Tela() {
		//Connection connection = new ConnectionFactory().getConnection();
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		init();
		
		
		setVisible(true);
		
	} 
	JButton btn1;
	public void init(){
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("listar");
		btn1.setLocation(80,290);
		btn1.addActionListener(this);
		btn1.setBorder(null);
		add(btn1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Conexao conexao = new Conexao();
		Connection conn = conexao.getConexao();
			
		//String sql = "INSERT INTO tbusuario(nome,login,senha) values ('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"')";
		String sql = "SELECT * FROM tbusuario ";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				
				ArrayList<String> lista = new ArrayList<String>();	
				lista.add("Nome Usuario :"+rs.getString("usuario"));
				lista.add("Login usuario : " +rs.getString("nome"));
				lista.add("Senha usuario : " +rs.getString("senha"));
				lista.remove(rs.getString("usuario"));
				lista.remove(rs.getString("nome"));
				lista.remove(rs.getString("senha"));
				JOptionPane.showMessageDialog(null,lista);
			}
			
		} catch (SQLException e1) {
			System.err.println("Erro"+ e1);
			e1.printStackTrace();
		}
	}
}
	


