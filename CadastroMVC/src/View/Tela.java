package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Tela{
	private JFrame frame;
	private JLabel lb1;
	private JMenuBar menubar;
	private JMenuItem i1,i2,i3;
	private JMenu menu;
	public Tela() {
		frame = new JFrame("Tela");
		
        menu = new JMenu("menu tutorial");
		i1 = new JMenuItem("Remover");
		i2 = new JMenuItem("Alterar");
		i3 = new JMenuItem("Listar");
		menubar = new JMenuBar();
	}
	public void show(String nome) {
		frame.setLayout(null);
		frame.setBounds(45,45,650,400);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Color purple = new Color(0,0,182,155);
		menubar.setBackground(purple);
		menubar.setForeground(Color.blue);
		menu.add(i1);menu.add(i2);menu.add(i3);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
		
		lb1 =  new JLabel();
		lb1.setSize(270,30);
		lb1.setLocation(140,20);
		lb1.setFont(new Font("Arial", Font.BOLD, 25));
    	lb1.setForeground(Color.black);
    	lb1.setBackground(Color.black);
    	lb1.setText("bem vindo "+nome);
		frame.add(lb1);
		i1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Remove r = new Remove();
				r.Tela();
			}
			
		});
		
		i2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Update r = new Update();
				r.Tela();
			}
			
		});
		
		i3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Listar r = new Listar();
				r.Tela();
			}
			
		});
		
		frame.setVisible(true);
	}
	
}
