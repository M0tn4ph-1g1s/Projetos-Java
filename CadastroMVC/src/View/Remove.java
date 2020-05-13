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

import DAO.RemoveConfig;

import java.util.EventObject;
import java.awt.image.*;
import java.awt.image.renderable.*;
import java.util.ArrayList;
import java.util.Iterator;

//importando os pacotes
import Model.Usuario;
import Model.UsuarioAcess;
public class Remove extends JFrame  implements ActionListener{
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
    private JButton btn1,btn2;
    private JPasswordField pass;
	public void init(){
		// TODO Auto-generated method stub
		lb1 =  new JLabel();
		lb1.setSize(270,30);
		lb1.setLocation(140,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
		lb1.setForeground(Color.black);
		lb1.setBackground(Color.black);
		lb1.setText("Remover usuario");
	    add(lb1);
				
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("Login do usuario a ser removido");
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
			
				
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
		btn1.setForeground(Color.white);
		btn1.setBackground(Color.black);
	    btn1.setSize(150,30);
		btn1.setText("Remover");
		btn1.setLocation(20,300);
	    btn1.addActionListener(this);
		btn1.setBorder(null);
	    add(btn1);
	    
	    btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("voltar");
		btn2.setLocation(20,200);
		btn2.addActionListener(this);
		btn2.setBorder(null);
		add(btn2);
				
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)) {
			Usuario user = new Usuario(); 
			user.setlogin(txt1.getText());
			RemoveConfig  removeconfig = new RemoveConfig ();
			try {
				removeconfig.Remove(user);
				JOptionPane.showMessageDialog(null,"removido com sucesso");
				txt1.setText("");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(btn2)) {
			/*Tela t = new Tela();
			UsuarioAcess usuariodeacesso = new UsuarioAcess();
			usuariodeacesso.getloginUsuarioAcesso();
			t.Tela(usuariodeacesso.getloginUsuarioAcesso());*/
			dispose();
				
		}
		
	}

}
