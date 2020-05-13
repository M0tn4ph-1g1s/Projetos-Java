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

import java.awt.*;
import java.util.*;
public class Tela{
	private JFrame frame;
	private JLabel lb1;
	private JMenuBar menubar;
	private JMenuItem i1,i2,i3,i4,i5,i6,i7;
	private JMenu menu,menu2,menu3;
	private JButton btn1,btn2,btn3;
	private JTable tbl1,tbl2,tbl3;	
	JScrollPane pane,pane2,pane3;

	public Tela() throws SQLException {
		frame = new JFrame("Tela");
		
		menu3 = new JMenu("Opções");
		i7 = new JMenuItem("Sair");
		
        menu = new JMenu("Usuario");
		i1 = new JMenuItem("Remover Usuario");
		i2 = new JMenuItem("Alterar Usuario");
		i3 = new JMenuItem("Cadastro Usuario");
		
		menu2 = new JMenu("produto");
		i4 = new JMenuItem("Remover produto");
		i5 = new JMenuItem("Alterar produto");
		i6 = new JMenuItem("Cadastrar produto ");
		menubar = new JMenuBar();
		
		tbl1 = new JTable();
		DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
		modelo.addColumn("nome");
		modelo.addColumn("preço");
		modelo.addColumn("Qtd");
		modelo.addColumn("codigo");
		modelo.addColumn("ID");
		
		pane=new JScrollPane(tbl1);
		
		tbl2 = new JTable();
		DefaultTableModel modelo2 = (DefaultTableModel) tbl2.getModel();
		modelo2.addColumn("ID");
		modelo2.addColumn("login");
		modelo2.addColumn("senha");	
		pane2=new JScrollPane(tbl2);
		
        pane2=new JScrollPane(tbl2);
	
		tbl3 = new JTable();
		DefaultTableModel modelo3 = (DefaultTableModel) tbl3.getModel();
		modelo3.addColumn("ID caixa");
		modelo3.addColumn("dinheiro caixa");
		modelo3.addColumn("codigo usuario");	
		pane3=new JScrollPane(tbl3);
	}
	public void show(String nome) {
		frame.setLayout(null);
		frame.setBounds(45,45,660,720);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Color purple = new Color(0,0,182,155);
		menubar.setBackground(purple);
		menubar.setForeground(Color.blue);
		menu3.add(i7);
		menubar.add(menu3);
		
		menu.add(i1);menu.add(i2);menu.add(i3);
		menubar.add(menu);
		
		menu2.add(i4);menu2.add(i5);menu2.add(i6);
		menubar.add(menu2);
		frame.setJMenuBar(menubar);
		
		
		lb1 =  new JLabel();
		lb1.setSize(400,30);
		lb1.setLocation(140,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("bem vindo Administrador "+nome);
		frame.add(lb1);
		
		pane.setBounds(0,140,650,200);		
		frame.add(pane);
		
		btn1 = new JButton();
		btn1.setFont(new Font("Verdana", Font.BOLD, 10));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setSize(150,30);
		btn1.setText("Listar Produtos");
		btn1.setLocation(220,90);
		btn1.setBorder(null);
		frame.add(btn1);
		
		btn1.addActionListener(new ActionListener() {						
    		@Override
			public void actionPerformed(ActionEvent arg0) {
    			Conexao conexao = new Conexao();
    			Connection conn = conexao.getConexao();
    			
    			DefaultTableModel modelo = (DefaultTableModel) tbl1.getModel();
    			
    			modelo.setNumRows(0);
    			if (modelo.getRowCount() > 0){
    	            for (int i=1;i<=modelo.getRowCount();i++){
    	                modelo.removeRow(i);
    	            }            
    	        }
    			
    			String sql="SELECT * FROM tbproduto";
    			PreparedStatement pstm = null;
    			ResultSet rs = null;
					
    			try {
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					
					while (rs.next()) {		
	    				modelo.addRow(new String[] { rs.getString("nome"), rs.getString("preco"), rs.getString("qtd") ,rs.getString("codigo"),rs.getString("idProduto")});
	    				//int quantidadebanco = Integer.parseInt("qtd");
	    			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		});
		
		pane2.setBounds(375,400,270,250);	
		frame.add(pane2);
		
		btn2 = new JButton();
		btn2.setFont(new Font("Verdana", Font.BOLD, 10));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setSize(150,30);
		btn2.setText("Listar Usuarios");
		btn2.setLocation(430,360);
		btn2.setBorder(null);
		frame.add(btn2);
		btn2.addActionListener(new ActionListener() {						
    		@Override
			public void actionPerformed(ActionEvent arg0) {
    			Conexao conexao = new Conexao();
    			Connection conn = conexao.getConexao();
    			
    			DefaultTableModel modelo = (DefaultTableModel) tbl2.getModel();
    			
    			modelo.setNumRows(0);
    			if (modelo.getRowCount() > 0){
    	            for (int i=1;i<=modelo.getRowCount();i++){
    	                modelo.removeRow(i);
    	            }            
    	        }
    			
    			String sql="SELECT * FROM tbusuario";
    			PreparedStatement pstm = null;
    			ResultSet rs = null;
					
    			try {
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					
					while (rs.next()) {		
	    				modelo.addRow(new String[] { rs.getString("idUser"), rs.getString("login"), rs.getString("senha") });
	    			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		});
		
		pane3.setBounds(0,400,270,250);	
		frame.add(pane3);
		
		btn3 = new JButton();
		btn3.setFont(new Font("Verdana", Font.BOLD, 10));
    	btn3.setForeground(Color.white);
    	btn3.setBackground(Color.black);
		btn3.setSize(150,30);
		btn3.setText("Listar Caixas");
		btn3.setLocation(10,360);
		btn3.setBorder(null);
		frame.add(btn3);
		btn3.addActionListener(new ActionListener() {						
    		@Override
			public void actionPerformed(ActionEvent arg0) {
    			Conexao conexao = new Conexao();
    			Connection conn = conexao.getConexao();
    			
    			DefaultTableModel modelo = (DefaultTableModel) tbl3.getModel();
    			
    			modelo.setNumRows(0);
    			if (modelo.getRowCount() > 0){
    	            for (int i=1;i<=modelo.getRowCount();i++){
    	                modelo.removeRow(i);
    	            }            
    	        }
    			
    			String sql="SELECT * FROM tbcaixa";
    			PreparedStatement pstm = null;
    			ResultSet rs = null;
					
    			try {
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					
					while (rs.next()) {		
	    				modelo.addRow(new String[] { rs.getString("idCaixa"), rs.getString("dinheiroCaixa"), rs.getString("idUser") });
	    			}
					System.out.println(rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		});
	
		
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Remove rem = new Remove();
				rem.Tela();
				
			}
			
		});
		
		i2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Update up = new Update();
				up.Tela();
				
			}
			
		});
		
		i3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Cadastro cada = new Cadastro();
				cada.Tela();
			}
			
		});
		i4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				RemoverProduto rem = new RemoverProduto();
				rem.Tela();
				
			}
			
		});
		
		i5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				UpdateProduto up = new UpdateProduto();
				up.Tela();
				
			}
			
		});
		
		i6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				CadastroProduto cada = new CadastroProduto();
				cada.Tela();
			}
			
		});
		i7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TelaLogin tela = new TelaLogin();
				tela.Tela();
				frame.dispose();
				
			}		
		});
		frame.setVisible(true);
	}
	
}
