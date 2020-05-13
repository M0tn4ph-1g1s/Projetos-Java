package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controller.Conexao;
import DAO.DAOproduto;
import DAO.DAOusuario;
import Model.Produto;
import Model.ProdutoUpdate;

import java.awt.*;
import java.util.*;
public class TelaUser{
	private JFrame frame;
	private JLabel lb1,lb2,lb3,lb4,lb5;
	private JMenuBar menubar;
	private JMenuItem i1,i2,i3;
	private JMenu menu;
	private JButton btn1,btn2;
	private JTextField txt1,txt2,txt3;
	private JTable tbl1;
	JScrollPane pane;
	double preco;
	double pagamento =0.0;
	double troco = 0.0;
	int qtd =0;
	int QtdEstoque;
	int quantidadebanco;
	
	int IDpro;
	String nomePro;
	Double precoPro;
	
	
	public TelaUser() {
		frame = new JFrame("Tela de usuario");
        menu = new JMenu("Opções");
		i1 = new JMenuItem("Sair");	
		menubar = new JMenuBar();
		
		tbl1 = new JTable();
		DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
		modelo.addColumn("nome");
		modelo.addColumn("preço");
		modelo.addColumn("codigo");
		modelo.addColumn("Qtd");
		modelo.addColumn("Qtd em estoque");		
		pane=new JScrollPane(tbl1);
	}
	public void show(String nome,String caixa) {
		frame.setLayout(null);
		frame.setBounds(45,45,700,600);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Color purple = new Color(0,0,182,155);
		menubar.setBackground(purple);
		menubar.setForeground(Color.blue);
		menu.add(i1);
		menubar.add(menu);
		
		frame.setJMenuBar(menubar);
		
		lb1 =  new JLabel();
		lb1.setSize(340,30);
		lb1.setLocation(100,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("bem vindo "+nome +" caixa "+caixa);
		frame.add(lb1);
		
		lb2 =  new JLabel();
		lb2.setSize(270,30);
		lb2.setLocation(430,90);
		lb2.setFont(new Font("Arial", Font.BOLD, 12));
    	lb2.setForeground(Color.black);
    	lb2.setBackground(Color.black);
    	lb2.setText("insira o codigo do produto");
		frame.add(lb2);
		
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 10));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("adicionar ás compras");
		btn1.setLocation(430,60);
		btn1.setBorder(null);
		frame.add(btn1);
		btn1.addActionListener(new ActionListener() {						
    		@Override
			public void actionPerformed(ActionEvent arg0) {
    		
    			Conexao conexao = new Conexao();
    			Connection conn = conexao.getConexao();
    			
    			DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
    			
				String codigo =txt1.getText();
				qtd = Integer.parseInt(txt2.getText());
				
    			String sql2 ="SELECT qtd FROM tbproduto where codigo = "+codigo;
    			PreparedStatement pstm = null;
    			ResultSet rs = null;
    			
    			try {
    				pstm = conn.prepareStatement(sql2);
					rs = pstm.executeQuery();
					while(rs.next()) {
						quantidadebanco = Integer.parseInt(rs.getString("qtd"));
					}
    			}
    			catch(SQLException e) {
    				JOptionPane.showMessageDialog(null,"produto não encontrado");
    			}
    			
    			if(quantidadebanco<qtd) {
    				JOptionPane.showMessageDialog(null,"quantidade requerida menor a que esta no banco ");
    			}
    			else {
    				String sql="SELECT * FROM tbproduto where codigo = "+codigo;
    				try {
    					pstm = conn.prepareStatement(sql);
    					rs = pstm.executeQuery();
    					while (rs.next()) {
    	    				//pega os valores do bd para popular tabela
    	    				modelo.addRow(new String[] { rs.getString("nome"), rs.getString("preco"),rs.getString("codigo"),txt2.getText(),rs.getString("Qtd")});
    	    				qtd = Integer.parseInt(txt2.getText());
    	    				preco = rs.getDouble("preco") * qtd;
    	    				pagamento = pagamento+preco;
    	    				lb4.setText("Total "+pagamento);
    	    				
    	    				QtdEstoque = rs.getInt("Qtd");
    						
    	    				txt2.setText("");
    	    				txt1.setText("");	
    	    				
    	    				int id = Integer.parseInt(rs.getString("idProduto"));
    	    				IDpro = id;
    	    				nomePro = rs.getString("nome");
    	    				Double pre = Double.parseDouble(rs.getString("preco"));
    	    				precoPro=pre;
    	    				
    	    			}
    			
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					JOptionPane.showMessageDialog(null,"produto não encontrado");
    				}
    				int novaqtd = QtdEstoque-qtd;
        			ProdutoUpdate pro = new ProdutoUpdate();
        			pro.setID(IDpro);
        			pro.setnovoNome(nomePro);
        			pro.setnovopreco(precoPro);
        			pro.setnovoQtd(novaqtd);
        		
        			DAOproduto update = new DAOproduto();
        			try {
    					update.Update(pro);
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			}	
			}
		});
		
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt1.setForeground(Color.black);
    	txt1.setBackground(Color.white);
		txt1.setSize(230,30);
		txt1.setLocation(390,120);
		txt1.setVisible(true);
		frame.add(txt1); 
		
		lb3 =  new JLabel();
		lb3.setSize(270,30);
		lb3.setLocation(410,170);
		lb3.setFont(new Font("Arial", Font.BOLD, 12));
    	lb3.setForeground(Color.black);
    	lb3.setBackground(Color.black);
    	lb3.setText("insira a quantidade de produtos");
		frame.add(lb3);
			
		txt2 = new JTextField();
		txt2.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt2.setForeground(Color.black);
    	txt2.setBackground(Color.white);
		txt2.setSize(230,30);
		txt2.setLocation(390,195);
		txt2.setVisible(true);
		frame.add(txt2); 
		
		lb4 =  new JLabel();
		lb4.setSize(270,30);
		lb4.setLocation(420,430);
		lb4.setFont(new Font("Arial", Font.BOLD, 12));
    	lb4.setForeground(Color.black);
    	lb4.setBackground(Color.black);
		frame.add(lb4);
		
		lb5 =  new JLabel();
		lb5.setSize(270,30);
		lb5.setLocation(400,245);
		lb5.setFont(new Font("Arial", Font.BOLD, 12));
    	lb5.setForeground(Color.black);
    	lb5.setBackground(Color.black);
    	lb5.setText("valor pago :");
		frame.add(lb5);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt3.setForeground(Color.black);
    	txt3.setBackground(Color.white);
		txt3.setSize(50,30);
		txt3.setLocation(480,245);
		txt3.setVisible(true);
		frame.add(txt3); 
		
		btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 10));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("encerrar compra");
		btn2.setLocation(430,480);
		btn2.setBorder(null);
		frame.add(btn2);
		
		btn2.addActionListener(new ActionListener() {						
    		@Override
			public void actionPerformed(ActionEvent arg0) {
    			
    			try {
    			    Double pago = Double.parseDouble(txt3.getText());
    			    if(pago < pagamento) {
    			    	JOptionPane.showMessageDialog(null,"o valor pago foi menor");
    			    }
    			    
    			    troco = pago - pagamento; 
    			    System.out.println(troco);
    			    if(troco > 0) {
    				    JOptionPane.showMessageDialog(null,"Troco"+troco);
    				    DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
    	    			modelo.setNumRows(0);
    	    			lb4.setText("");
    			    }
    			    
    			}catch(Exception e) {
    				JOptionPane.showMessageDialog(null,"insira o valor pago");
    			}
    			txt3.setText("");
    			preco = 0.0;
    			pagamento =0.0;
    			JOptionPane.showMessageDialog(null,"Compra Encerrada");
			}
		});
		pane.setBounds(0,100,350,400);		
		frame.add(pane);	
		frame.setVisible(true);
		
		
		i1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TelaLogin tela = new TelaLogin();
				tela.Tela();
				frame.dispose();	
			}
		});
	}
	
}
