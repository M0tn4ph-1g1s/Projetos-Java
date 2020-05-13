package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Image.*;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.Conexao;
import Model.UsuarioAcess;

import java.util.EventObject;
import java.awt.image.*;
import java.awt.image.renderable.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Login extends JFrame implements ActionListener {
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
	
	JTextField txt1,txt2;
    JLabel lb1,lb2,lb3;
    JButton btn1,btn2,btn3,btn4,btn5;
	public void init(){
		lb1 =  new JLabel();
		lb1.setSize(270,30);
		lb1.setLocation(140,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("Login");
		add(lb1);
		
		
		
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("login");
		lb2.setBackground(Color.white);
		lb2.setForeground(Color.black);
		add(lb2);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt1.setForeground(Color.black);
    	txt1.setBackground(Color.white);
		txt1.setSize(280,30);
		txt1.setLocation(30,120);
		txt1.setVisible(true);
		add(txt1);   
		
		
		lb3 = new JLabel();
		lb3.setSize(270,30);
		lb3.setLocation(30,170);
		lb3.setText("senha");
		lb3.setBackground(Color.white);
		lb3.setForeground(Color.black);
		add(lb3);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt2.setForeground(Color.black);
    	txt2.setBackground(Color.white);
		txt2.setSize(280,30);
		txt2.setLocation(30,200);
		add(txt2);
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("Cadastrar");
		btn1.setLocation(20,240);
		btn1.addActionListener(this);
		btn1.setBorder(null);
		add(btn1);
		
		btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("Entrar");
		btn2.setLocation(180,240);
		btn2.addActionListener(this);
		btn2.setBorder(null);
		add(btn2);	
		
		btn3 = new JButton();
		btn3.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn3.setForeground(Color.white);
    	btn3.setBackground(Color.black);
		btn3.setSize(150,30);
		btn3.setText("Sair");
		btn3.setLocation(90,300);
		btn3.addActionListener(this);
		btn3.setBorder(null);
		add(btn3);	
		
	
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		if(arg.getSource().equals(btn1)) {
			Cadastro c = new Cadastro();
			c.Tela();
			
		}
		else if(arg.getSource().equals(btn2)) {
			String nome = null;
			
			Conexao conexao = new Conexao();
			Connection conn = conexao.getConexao();	
			
			String log = txt1.getText();
			String senha = txt2.getText();
			
			//String sql = "SELECT * FROM tbusuario where senha like '%"+senha+"%'";
			String sql = "SELECT * FROM tbusuario where senha = '"+senha+"'";
			PreparedStatement pstm = null;
			ResultSet rs = null;
			try {
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				
				
				while (rs.next()) {
					System.out.println(rs.getString("senha"));
					if(rs.getString("senha") != "") {
						UsuarioAcess usuariodeacesso = new UsuarioAcess();
						usuariodeacesso.setloginUsuarioAcesso(rs.getString("usuario"));
						Tela t = new Tela();
						t.show(usuariodeacesso.getloginUsuarioAcesso());
						dispose();
					}	
				}
				
			} catch (SQLException e) {
				System.err.println("Erro"+ e);
				e.printStackTrace();
			}
		}
        else if(arg.getSource().equals(btn3)) {
        	
			
		}
	}
}

