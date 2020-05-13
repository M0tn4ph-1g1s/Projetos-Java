package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.DAOproduto;
import DAO.DAOusuario;

import Model.ProdutoUpdate;
import Model.UsuarioUpdate;

public class UpdateProduto extends JFrame implements ActionListener {
	public void Tela() {
		//Connection connection = new ConnectionFactory().getConnection();
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		init();
		
		
		setVisible(true);
		
	} 
	private JTextField txt1,txt2,txt3,txt4;
    private JLabel lb1,lb2,lb3,lb4,lb5;
    private JButton btn1,btn2,btn3;
    private JPasswordField pass;
	public void init(){
		lb1 =  new JLabel();
		lb1.setSize(500,30);
		lb1.setLocation(120,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
		lb1.setForeground(Color.black);
		lb1.setBackground(Color.black);
		lb1.setText("Update de produtos");
	    add(lb1);
				
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("ID do produto a ser alterado");
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
		lb3.setLocation(30,150);
		lb3.setText("novo nome");
		lb3.setBackground(Color.white);
		lb3.setForeground(Color.black);
		add(lb3);
		
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Verdana", Font.BOLD, 11));
		txt2.setForeground(Color.black);
		txt2.setBackground(Color.white);
	    txt2.setSize(280,30);
		txt2.setLocation(30,180);
	    txt2.setVisible(true);
		add(txt2); 
		
		lb4 = new JLabel();
		lb4.setSize(270,30);
		lb4.setLocation(30,210);
		lb4.setText("nova preco");
		lb4.setBackground(Color.white);
		lb4.setForeground(Color.black);
		add(lb4);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Verdana", Font.BOLD, 11));
		txt3.setForeground(Color.black);
		txt3.setBackground(Color.white);
	    txt3.setSize(280,30);
		txt3.setLocation(30,240);
	    txt3.setVisible(true);
		add(txt3); 
		
		lb5 = new JLabel();
		lb5.setSize(270,30);
		lb5.setLocation(30,270);
		lb5.setText("nova quantidade");
		lb5.setBackground(Color.white);
		lb5.setForeground(Color.black);
		add(lb5);
		
		txt4 = new JTextField();
		txt4.setFont(new Font("Verdana", Font.BOLD, 11));
		txt4.setForeground(Color.black);
		txt4.setBackground(Color.white);
	    txt4.setSize(280,30);
		txt4.setLocation(30,295);
	    txt4.setVisible(true);
		add(txt4);
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
		btn1.setForeground(Color.white);
		btn1.setBackground(Color.black);
	    btn1.setSize(150,30);
		btn1.setText("Alterar");
		btn1.setLocation(20,350);
	    btn1.addActionListener(this);
		btn1.setBorder(null);
	    add(btn1);
	    
	    btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("voltar");
		btn2.setLocation(20,400);
		btn2.addActionListener(this);
		btn2.setBorder(null);
		add(btn2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btn1)) {
			int id = Integer.parseInt(txt1.getText());
			ProdutoUpdate up = new ProdutoUpdate();
			up.setID(id);
			
			up.setnovoNome(txt2.getText());
			
			Double preco = Double.parseDouble(txt3.getText());
			up.setnovopreco(preco);
			
			int qtd = Integer.parseInt(txt4.getText());
			up.setnovoQtd(qtd);
			
			DAOproduto update = new DAOproduto();
			try {
				update.Update(up);
				JOptionPane.showMessageDialog(null,"alterado com sucesso");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource().equals(btn2)) {
			dispose();
				
		}
		
	}

}
