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

import Model.Produto;

public class RemoverProduto extends JFrame implements ActionListener{
	
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
		lb1.setText("Remover produto");
	    add(lb1);
				
		lb2 = new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(30,90);
		lb2.setText("id do produto a ser removido");
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
		// TODO Auto-generated method stub
		if(e.getSource().equals(btn1)) {
			int id = Integer.parseInt(txt1.getText());
			Produto pro = new Produto(); 			
			pro.setID(id);
			DAOproduto  removeconfig= new DAOproduto();
			try {
				removeconfig.Remove(pro);
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
