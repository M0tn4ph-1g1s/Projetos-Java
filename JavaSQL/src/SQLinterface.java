
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
import java.util.EventObject;
import java.awt.image.*;
import java.awt.image.renderable.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class SQLinterface extends JFrame implements ActionListener {
	public void Tela() {
		//Connection connection = new ConnectionFactory().getConnection();
		setSize(860,470);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		init();
		
		
		setVisible(true);
		
	}
	JButton btn1,btn2,btn3,btn4,btn5;
    JTextField txt1,txt2,txt3,txt4,txt5;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
	public void init() {
		
		lb1 =  new JLabel();
		lb1.setSize(270,30);
		lb1.setLocation(70,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 18));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("Cadastro de Usuarios");
		add(lb1);
		
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("nome");
		lb2.setBackground(Color.white);
		lb2.setForeground(Color.black);
		add(lb2);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt1.setForeground(Color.black);
    	txt1.setBackground(Color.white);
		txt1.setSize(280,30);
		txt1.setLocation(30,120);
		//txt1.setText("    Digite o nome do produto");
		txt1.setVisible(true);
		//txt1.setBorder(null);
		add(txt1);
		
		lb3 = new JLabel();
		lb3.setSize(270,30);
		lb3.setLocation(30,145);
		lb3.setText("Login");
		lb3.setBackground(Color.white);
		lb3.setForeground(Color.black);
		add(lb3);
	
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt2.setForeground(Color.black);
    	txt2.setBackground(Color.white);
		txt2.setSize(280,30);
		txt2.setLocation(30,170);
		//txt2.setText("    Digite o seu valor");
		//txt2.setBorder(null);
		add(txt2);
		
		lb4 = new JLabel();
		lb4.setSize(270,30);
		lb4.setLocation(30,195);
		lb4.setText("Senha");
		lb4.setBackground(Color.white);
		lb4.setForeground(Color.black);
		add(lb4);
		
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Verdana", Font.BOLD, 11));
		txt3.setForeground(Color.black);
    	txt3.setBackground(Color.white);
		txt3.setSize(280,30);
		txt3.setLocation(30,220);
		add(txt3);
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("Cadastrar");
		btn1.setLocation(80,290);
		btn1.addActionListener(this);
		btn1.setBorder(null);
		add(btn1);
		
		btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("Cancelar");
		btn2.setLocation(80,340);
		btn2.addActionListener(this);
		btn1.setBorder(null);
		add(btn2);	
		
		
		lb6 = new JLabel();
		lb6.setFont(new Font("Verdana", Font.BOLD, 11));
		lb6.setForeground(Color.black);
    	lb6.setBackground(Color.white);
		lb6.setSize(490,200);
		lb6.setLocation(350,50);
		lb6.setBorder(javax.swing.BorderFactory.createTitledBorder("usuarios"));
		add(lb6);
		
		lb5 = new JLabel();
		lb5.setFont(new Font("Verdana", Font.BOLD, 18));
    	lb5.setForeground(Color.white);
    	lb5.setBackground(Color.black);
		lb5.setSize(270,30);
		lb5.setLocation(400,20);
		lb5.setText("Listagem de Usuarios");
		lb5.setBackground(Color.white);
		lb5.setForeground(Color.black);
		add(lb5);
		
		
		btn3 = new JButton();
		btn3.setFont(new Font("Verdana", Font.BOLD, 14));
    	btn3.setForeground(Color.white);
    	btn3.setBackground(Color.black);
		btn3.setSize(150,30);
		btn3.setText("Lista Usuario");
		btn3.setLocation(460,300);
		btn3.addActionListener(this);
		btn3.setBorder(null);
		add(btn3);
		
		btn4 = new JButton();
		btn4.setFont(new Font("Verdana", Font.BOLD, 14));
    	btn4.setForeground(Color.white);
    	btn4.setBackground(Color.black);
		btn4.setSize(150,30);
		btn4.setText("Limpar");
		btn4.setLocation(460,340);
		btn4.addActionListener(this);
		btn4.setBorder(null);
		add(btn4);
		
		btn5 = new JButton();
		btn5.setFont(new Font("Verdana", Font.BOLD, 14));
    	btn5.setForeground(Color.white);
    	btn5.setBackground(Color.black);
		btn5.setSize(220,30);
		btn5.setText("Listar todos os usuarios");
		btn5.setLocation(420,380);
		btn5.addActionListener(this);
		btn5.setBorder(null);
		add(btn5);
		
		
		txt5 = new JTextField();
		txt5.setFont(new Font("Verdana", Font.BOLD, 11));
		txt5.setForeground(Color.black);
    	txt5.setBackground(Color.white);
		txt5.setSize(190,30);
		txt5.setLocation(530,260);
		add(txt5);
		
		lb7 = new JLabel();
		lb7.setFont(new Font("Verdana", Font.BOLD, 11));
		lb7.setForeground(Color.black);
    	lb7.setBackground(Color.white);
		lb7.setSize(300,200);
		lb7.setLocation(360,170);
		lb7.setText("insira o login do usuario :");
		add(lb7);
		
		
	}
		 
	@Override
    public void actionPerformed(ActionEvent arg) {
    	if(arg.getSource().equals(btn1)) {
    		try {
    			Conexao conexao = new Conexao();
    			Connection conn = conexao.getConexao();		
    			
    			//String sql = "INSERT INTO tbusuario(nome,login,senha) values ('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"')";
    			String sql = "INSERT INTO tbusuario(nome,login,senha) values (?,?,?)";
    			PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
    			pstm.setString(1, txt1.getText());
    			pstm.setString(2, txt2.getText());
    			pstm.setString(3, txt3.getText());
    			pstm.execute();
    			txt1.setText("");
    			txt2.setText("");
    			txt3.setText("");
    			
    		}
    		catch(Exception e) {
    			System.err.println(e.getMessage());
    		}
    		
		}
    	
		else if(arg.getSource().equals(btn2)) {
			txt1.setText("");
			txt2.setText("");    
			txt3.setText("");
		}
    	
		else if(arg.getSource().equals(btn3)) {
			Conexao conexao = new Conexao();
			Connection conn = conexao.getConexao();
			
			String log = txt5.getText();
					
			//String sql = "INSERT INTO tbusuario(nome,login,senha) values ('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"')";
			String sql = "SELECT * FROM tbusuario where login = '"+log+"'";
			PreparedStatement pstm = null;
			ResultSet rs = null;
			try {
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					Usuario u = new Usuario();
				    lb6.setText("nomeUsuario :"+rs.getString("nome")+"  || login Usuario :"+rs.getString("login")+"  || Senha:"+rs.getString("senha"));
					/*lb6.setText(rs.getString("login"));
					lb6.setText(rs.getString("senha"));*/
				}
				
			} catch (SQLException e) {
				System.err.println("Erro"+ e);
				e.printStackTrace();
			}
			
		}
		else if(arg.getSource().equals(btn4)) {
			lb6.setText("");
			txt5.setText("");
			
		}
		else if(arg.getSource().equals(btn5)) {
			Conexao conexao = new Conexao();
			Connection conn = conexao.getConexao();
			String log = txt5.getText();		
			//String sql = "INSERT INTO tbusuario(nome,login,senha) values ('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"')";
			String sql = "SELECT * FROM tbusuario ";
			PreparedStatement pstm = null;
			ResultSet rs = null;
			try {
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					Usuario u = new Usuario();
					ArrayList<String> lista = new ArrayList<String>();	
					lista.add("Nome Usuario :"+rs.getString("nome"));
					lista.add("Login usuario : " +rs.getString("login"));
					lista.add("Senha usuario : " +rs.getString("senha"));
					lista.remove(rs.getString("nome"));
					lista.remove(rs.getString("login"));
					lista.remove(rs.getString("senha"));
					JOptionPane.showMessageDialog(null,lista);
				}
				
			} catch (SQLException e) {
				System.err.println("Erro"+ e);
				e.printStackTrace();
			}
		}
    }
}
