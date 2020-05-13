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

import Controller.CadastroBanco;
import Controller.Conexao;
import Model.Usuario;

import java.util.EventObject;
import java.awt.image.*;
import java.awt.image.renderable.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Cadastro extends JFrame implements ActionListener{
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
	private JTextField txt1,txt2,txt3;
    private JLabel lb1,lb2,lb3;
    private JButton btn1,btn2,btn3;
    private JPasswordField pass;
	public void init(){
		lb1 =  new JLabel();
		lb1.setSize(270,30);
		lb1.setLocation(140,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("Cadastro");
		add(lb1);
		
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("Usuario");
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
		lb3.setText("Login");
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
		
		lb3 = new JLabel();
		lb3.setSize(270,30);
		lb3.setLocation(30,235);
		lb3.setText("senha");
		lb3.setBackground(Color.white);
		lb3.setForeground(Color.black);
		add(lb3);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Verdana", Font.BOLD, 11));
		txt3.setForeground(Color.black);
    	txt3.setBackground(Color.white);
		txt3.setSize(280,30);
		txt3.setLocation(30,260);
		add(txt3);
		/*
		pass = new JPasswordField();
		pass.setBounds(30,260,290,30);
		add(pass);*/
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("voltar");
		btn1.setLocation(20,300);
		btn1.addActionListener(this);
		btn1.setBorder(null);
		add(btn1);
		
		btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("cadastrar");
		btn2.setLocation(180,300);
		btn2.addActionListener(this);
		btn2.setBorder(null);
		add(btn2);	
					
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		if(arg.getSource().equals(btn1)) {
			Login l = new Login();
			l.Tela();
		}
		else if(arg.getSource().equals(btn2)) {
				
			try {
    			
				Usuario user = new Usuario(); 
				user.setlogin(txt1.getText());
				user.setnome(txt2.getText());
				user.setsenha(txt3.getText());
				
				CadastroBanco cbd = new CadastroBanco();
				cbd.cadastro(user);
    			
    		}
    		catch(Exception e) {
    			System.err.println(e.getMessage());
    		}
			
			
		}
		
	}

}
