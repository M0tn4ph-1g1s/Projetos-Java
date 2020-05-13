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
public class JogoDaForca extends JFrame implements ActionListener {
	ArrayList<String> lista = new ArrayList<String>();
	ArrayList<String> lista2 = new ArrayList<String>();
	ArrayList<String> lista3 = new ArrayList<String>();
	ArrayList<String> lista4 = new ArrayList<String>();
	ArrayList<String> lista5 = new ArrayList<String>();
	ArrayList<String> listaprimal = new ArrayList<String>();
	
	//ImageIcon fundoTela = new ImageIcon(Menu.class.getResource("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca1.png"));
	//Image img = fundoTela.getImage().getScaledInstance(720, 500, Image.SCALE_DEFAULT);
	
    public void Tela() {
    	 
		setSize(720, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		
		init();
		
		
		setVisible(true);
		
	}
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26;
    JTextField txt1,txt2;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label10;
    
    public void init() {
    	lista.add("j");
    	lista.add("a");
    	lista.add("v");
    	lista.add("a");
    	
    	lista2.add("p");
    	lista2.add("h");
    	lista2.add("p");
    	
    	lista3.add("c");
    	lista3.add("s");
    	lista3.add("s");
    	
    	lista4.add("h");
    	lista4.add("t");
    	lista4.add("m");
    	lista4.add("l");
    	
    	lista5.add("p");
    	lista5.add("y");
    	lista5.add("t");
    	lista5.add("h");
    	lista5.add("o");
    	lista5.add("n");
    	
    	Random gerador = new Random();
    	int n= gerador.nextInt(4);
    	//int n =1;
    	if(n == 0) {
    		listaprimal.add("j");
    		listaprimal.add("a");
    		listaprimal.add("v");
    		listaprimal.add("a");
    		
    		label1 = new JLabel();
        	label1.setSize(60,60);
        	label1.setLocation(300,300);
        	label1.setOpaque(true);
        	label1.setBackground(Color.white);
        	add(label1);
        	
        	label2 = new JLabel();
        	label2.setSize(60,60);
        	label2.setLocation(370,300);
        	label2.setOpaque(true);
        	label2.setBackground(Color.white);
        	add(label2);
        	
        	label3 = new JLabel();
        	label3.setSize(60,60);
        	label3.setLocation(440,300);
        	label3.setOpaque(true);
        	label3.setBackground(Color.white);
        	add(label3);
        	
        	label4 = new JLabel();
        	label4.setSize(60,60);
        	label4.setLocation(510,300);
        	label4.setOpaque(true);
        	label4.setBackground(Color.white);
        	add(label4);
        	
    		label10 = new JLabel();
    		label10.setSize(380,60);
        	label10.setLocation(270,380);
        	label10.setOpaque(true);
        	label10.setBackground(Color.white);
        	label10.setText("       linguagem de programção pode ser usada no eclipse.");
        	add(label10);
    	}
    	else if(n == 1){
    		listaprimal.add("p");
    		listaprimal.add("h");
    		listaprimal.add("p");
    		
    		label1 = new JLabel();
        	label1.setSize(60,60);
        	label1.setLocation(300,300);
        	label1.setOpaque(true);
        	label1.setBackground(Color.white);
        	add(label1);
        	
        	label2 = new JLabel();
        	label2.setSize(60,60);
        	label2.setLocation(380,300);
        	label2.setOpaque(true);
        	label2.setBackground(Color.white);
        	add(label2);
        	
        	label3 = new JLabel();
        	label3.setSize(60,60);
        	label3.setLocation(460,300);
        	label3.setOpaque(true);
        	label3.setBackground(Color.white);
        	add(label3);
        	
        	label10 = new JLabel();
        	label10.setSize(380,60);
        	label10.setLocation(270,380);
        	label10.setOpaque(true);
        	label10.setBackground(Color.white);
        	label10.setText("    linguagem de programação usada em progração web");
        	add(label10);
    		
    	}
    	else if(n == 2) {
    		listaprimal.add("c");
    		listaprimal.add("s");
    		listaprimal.add("s");
    		
    		label1 = new JLabel();
        	label1.setSize(60,60);
        	label1.setLocation(300,300);
        	label1.setOpaque(true);
        	label1.setBackground(Color.white);
        	add(label1);
        	
        	label2 = new JLabel();
        	label2.setSize(60,60);
        	label2.setLocation(400,300);
        	label2.setOpaque(true);
        	label2.setBackground(Color.white);
        	add(label2);
        	
        	label3 = new JLabel();
        	label3.setSize(60,60);
        	label3.setLocation(500,300);
        	label3.setOpaque(true);
        	label3.setBackground(Color.white);
        	add(label3);
        	
        	label10 = new JLabel();
        	label10.setSize(380,60);
        	label10.setLocation(270,380);
        	label10.setOpaque(true);
        	label10.setBackground(Color.white);
        	label10.setText("     linguagem de programção usada para estilisar paginas web");
        	add(label10);
        	
    		
    	}
    	else if(n == 3) {
    		listaprimal.add("h");
    		listaprimal.add("t");
    		listaprimal.add("m");
    		listaprimal.add("l");
    		
    		label1 = new JLabel();
        	label1.setSize(60,60);
        	label1.setLocation(300,300);
        	label1.setOpaque(true);
        	label1.setBackground(Color.white);
        	add(label1);
        	
        	label2 = new JLabel();
        	label2.setSize(60,60);
        	label2.setLocation(370,300);
        	label2.setOpaque(true);
        	label2.setBackground(Color.white);
        	add(label2);
        	
        	label3 = new JLabel();
        	label3.setSize(60,60);
        	label3.setLocation(450,300);
        	label3.setOpaque(true);
        	label3.setBackground(Color.white);
        	add(label3);
        	
        	label6 = new JLabel();
        	label6.setSize(60,60);
        	label6.setLocation(530,300);
        	label6.setOpaque(true);
        	label6.setBackground(Color.white);
        	add(label6);
        	
        	label10 = new JLabel();
        	label10.setSize(400,60);
        	label10.setLocation(270,380);
        	label10.setOpaque(true);
        	label10.setBackground(Color.white);
        	label10.setText("     linguagem de programção usada pra construção de paginas web ");
        	add(label10);
        	
    		
    	}
    	else if (n == 4) {
    		listaprimal.add("w");
    		listaprimal.add("o");
    		listaprimal.add("r");
    		listaprimal.add("d");
    	

    		
    		label1 = new JLabel();
        	label1.setSize(60,60);
        	label1.setLocation(300,300);
        	label1.setOpaque(true);
        	label1.setBackground(Color.white);
        	add(label1);
        	
        	label2 = new JLabel();
        	label2.setSize(60,60);
        	label2.setLocation(370,300);
        	label2.setOpaque(true);
        	label2.setBackground(Color.white);
        	add(label2);
        	
        	label3 = new JLabel();
        	label3.setSize(60,60);
        	label3.setLocation(435,300);
        	label3.setOpaque(true);
        	label3.setBackground(Color.white);
        	add(label3);
        	
        	label6 = new JLabel();
        	label6.setSize(60,60);
        	label6.setLocation(500,300);
        	label6.setOpaque(true);
        	label6.setBackground(Color.white);
        	add(label6);
        	
        	label10 = new JLabel();
        	label10.setSize(380,60);
        	label10.setLocation(270,380);
        	label10.setOpaque(true);
        	label10.setBackground(Color.white);
        	label10.setText("     programa do pacote office");
        	add(label10);
    		
    	}
    	
    	
    	label5 = new JLabel();
    	label5.setSize(400,200);
    	label5.setLocation(240,20);
    	label5.setOpaque(true);
    	label5.setBackground(Color.gray);
    	add(label5);
    	label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca1.png"));
    
    	
    	btn1 = new JButton();
    	btn1.setFont(new Font("Arial", Font.BOLD, 18));
    	btn1.setForeground(Color.white);
    	btn1.setBackground(Color.black);
		btn1.setText("A");
		btn1.setSize(50,50);
		btn1.setLocation(5,5);
		btn1.addActionListener(this);
		add(btn1);
		
		btn2 = new JButton();
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
    	btn2.setForeground(Color.white);
    	btn2.setBackground(Color.black);
		btn2.setText("B");	
		btn2.setSize(50,50);
		btn2.setLocation(58,5);
		btn2.addActionListener(this);
		add(btn2);
		
		btn3 = new JButton();
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
    	btn3.setForeground(Color.white);
    	btn3.setBackground(Color.black);
		btn3.setText("C");
		
		btn3.setSize(50,50);
		btn3.setLocation(110,5);
		btn3.addActionListener(this);
		add(btn3);
		
		btn4 = new JButton();
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
    	btn4.setForeground(Color.white);
    	btn4.setBackground(Color.black);
		btn4.setText("D");
		btn4.setSize(50,50);
		btn4.setLocation(163,5);
		btn4.addActionListener(this);
		add(btn4);
		
		btn5 = new JButton();
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
    	btn5.setForeground(Color.white);
    	btn5.setBackground(Color.black);
		btn5.setText("E");
		btn5.setSize(50,50);
		btn5.setLocation(5,60);
		btn5.addActionListener(this);
		add(btn5);
		
		btn6 = new JButton();
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
    	btn6.setForeground(Color.white);
    	btn6.setBackground(Color.black);
		btn6.setText("F");
		btn6.setSize(50,50);
		btn6.setLocation(58,60);
		btn6.addActionListener(this);
		add(btn6);
		
		btn7 = new JButton();
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
    	btn7.setForeground(Color.white);
    	btn7.setBackground(Color.black);
		btn7.setText("G");
		btn7.setSize(50,50);
		btn7.setLocation(110,60);
		btn7.addActionListener(this);
		add(btn7);
		
		btn8 = new JButton();
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
    	btn8.setForeground(Color.white);
    	btn8.setBackground(Color.black);
		btn8.setText("H");	
		btn8.setSize(50,50);
		btn8.setLocation(163,60);
		btn8.addActionListener(this);
		add(btn8);
		
		btn9 = new JButton();
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
    	btn9.setForeground(Color.white);
    	btn9.setBackground(Color.black);
		btn9.setText("I");
		btn9.setSize(50,50);
		btn9.setLocation(5,115);
		btn9.addActionListener(this);
		add(btn9);
		
		btn10 = new JButton();
		btn10.setFont(new Font("Arial", Font.BOLD, 18));
    	btn10.setForeground(Color.white);
    	btn10.setBackground(Color.black);
		btn10.setText("J");
		btn10.setSize(50,50);
		btn10.setLocation(58,115);
		btn10.addActionListener(this);
		add(btn10);
		
		btn11 = new JButton();
		btn11.setFont(new Font("Arial", Font.BOLD, 18));
    	btn11.setForeground(Color.white);
    	btn11.setBackground(Color.black);
		btn11.setText("K");
		btn11.setSize(50,50);
		btn11.setLocation(110,115);
		btn11.addActionListener(this);
		add(btn11);
		
		btn12 = new JButton();	
		btn12.setFont(new Font("Arial", Font.BOLD, 18));
    	btn12.setForeground(Color.white);
    	btn12.setBackground(Color.black);
		btn12.setText("L");
		btn12.setSize(50,50);
		btn12.setLocation(163,115);
		btn12.addActionListener(this);
		add(btn12);
		
		btn13 = new JButton();
		btn13.setFont(new Font("Arial", Font.BOLD, 18));
    	btn13.setForeground(Color.white);
    	btn13.setBackground(Color.black);
		btn13.setText("M");
		btn13.setSize(50,50);
		btn13.setLocation(5,170);
		btn13.addActionListener(this);
		add(btn13);
		
		btn14 = new JButton();
		btn14.setFont(new Font("Arial", Font.BOLD, 18));
    	btn14.setForeground(Color.white);
    	btn14.setBackground(Color.black);
		btn14.setText("N");
		btn14.setSize(50,50);
		btn14.setLocation(58,170);
		btn14.addActionListener(this);
		add(btn14);
		
		btn15 = new JButton();
		btn15.setFont(new Font("Arial", Font.BOLD, 18));
    	btn15.setForeground(Color.white);
    	btn15.setBackground(Color.black);
		btn15.setText("O");
		btn15.setSize(50,50);
		btn15.setLocation(110,170);
		btn15.addActionListener(this);
		add(btn15);
		
		btn16 = new JButton();
		btn16.setFont(new Font("Arial", Font.BOLD, 18));
    	btn16.setForeground(Color.white);
    	btn16.setBackground(Color.black);
		btn16.setText("P");
		btn16.setSize(50,50);
		btn16.setLocation(163,170);
		btn16.addActionListener(this);
		add(btn16);
		
		btn17 = new JButton();
		btn17.setFont(new Font("Arial", Font.BOLD, 18));
    	btn17.setForeground(Color.white);
    	btn17.setBackground(Color.black);
		btn17.setText("Q");
		btn17.setSize(50,50);
		btn17.setLocation(5,224);
		btn17.addActionListener(this);
		add(btn17);
		
		btn18 = new JButton();
		btn18.setFont(new Font("Arial", Font.BOLD, 18));
    	btn18.setForeground(Color.white);
    	btn18.setBackground(Color.black);
		btn18.setText("R");
		btn18.setSize(50,50);
		btn18.setLocation(58,224);
		btn18.addActionListener(this);
		add(btn18);
		
		btn19 = new JButton();
		btn19.setFont(new Font("Arial", Font.BOLD, 18));
    	btn19.setForeground(Color.white);
    	btn19.setBackground(Color.black);
		btn19.setText("S");
		btn19.setSize(50,50);
		btn19.setLocation(110,224);
		btn19.addActionListener(this);
		add(btn19);
		
		btn20 = new JButton();
		btn20.setFont(new Font("Arial", Font.BOLD, 18));
    	btn20.setForeground(Color.white);
    	btn20.setBackground(Color.black);
		btn20.setText("T");
		btn20.setSize(50,50);
		btn20.setLocation(163,224);
		btn20.addActionListener(this);
		add(btn20);
		
		btn21 = new JButton();
		btn21.setFont(new Font("Arial", Font.BOLD, 18));
    	btn21.setForeground(Color.white);
    	btn21.setBackground(Color.black);
		btn21.setText("U");
		btn21.setSize(50,50);
		btn21.setLocation(5,278);
		btn21.addActionListener(this);
		add(btn21);
		
		btn22 = new JButton();
		btn22.setFont(new Font("Arial", Font.BOLD, 18));
    	btn22.setForeground(Color.white);
    	btn22.setBackground(Color.black);
		btn22.setText("V");
		btn22.setSize(50,50);
		btn22.setLocation(58,278);
		btn22.addActionListener(this);
		add(btn22);
		
		btn23 = new JButton();
		btn23.setFont(new Font("Arial", Font.BOLD, 16));
    	btn23.setForeground(Color.white);
    	btn23.setBackground(Color.black);
		btn23.setText("W");
		btn23.setSize(50,50);
		btn23.setLocation(110,278);
		btn23.addActionListener(this);
		add(btn23);
		
		btn24 = new JButton();
		btn24.setFont(new Font("Arial", Font.BOLD, 18));
    	btn24.setForeground(Color.white);
    	btn24.setBackground(Color.black);
		btn24.setText("X");
		btn24.setSize(50,50);
		btn24.setLocation(163,278);
		btn24.addActionListener(this);
		add(btn24);
		
		btn25 = new JButton();
		btn25.setFont(new Font("Arial", Font.BOLD, 18));
    	btn25.setForeground(Color.white);
    	btn25.setBackground(Color.black);
		btn25.setText("Y");
		btn25.setSize(50,50);
		btn25.setLocation(30,333);
		btn25.addActionListener(this);
		add(btn25);
		
		btn26 = new JButton();
		btn26.setFont(new Font("Arial", Font.BOLD, 18));
    	btn26.setForeground(Color.white);
    	btn26.setBackground(Color.black);
		btn26.setText("Z");
		btn26.setSize(50,50);
		btn26.setLocation(85,333);
		btn26.addActionListener(this);
		add(btn26);
		
		setVisible(true);
    	
    }
    
    int pp = 0;
    int pn = 6; 
    boolean val ;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(btn1)){
			for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "a") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn1.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "a") {
		        		if(i == 0) {
		        			label1.setText("       a");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       a");
		        		}
		        		else if(i == 2) {
		        			label3.setText("       a");
		        		}
		        		else if(i == 3) {
		        			label4.setText("       a");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("       a");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		///////////// B
		else if(arg0.getSource().equals(btn2)) {
			for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "b") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn2.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "b") {
		        		if(i == 0) {
		        			label1.setText("       b");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       b");
		        		}
		        		else if(i == 2) {
		        			label3.setText("       b");
		        		}
		        		else if(i == 3) {
		        			label4.setText("       b");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("      b");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		//////////// C
        else if(arg0.getSource().equals(btn3)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "c") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn3.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "c") {
		        		if(i == 0) {
		        			label1.setText("      c");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      c");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      c");
		        		}
		        		else if(i == 3) {
		        			label4.setText("     c");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("     c");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		/////////// D
        else if(arg0.getSource().equals(btn4)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "d") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn4.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "d") {
		        		if(i == 0) {
		        			label1.setText("     d");
		        		}
		        		else if(i == 1) {
		        			label2.setText("     d");
		        		}
		        		else if(i == 2) {
		        			label3.setText("     d");
		        		}
		        		else if(i == 3) {
		        			label6.setText("    d");
		        			
		        		}
		        		else if(i == 4) {
		        			label7.setText("    d");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		/////////// E
        else if(arg0.getSource().equals(btn5)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "e") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn5.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "e") {
		        		if(i == 0) {
		        			label1.setText("       e");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       e");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      e");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      e");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("      e");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		 /////////// F
        else if(arg0.getSource().equals(btn6)) {for (int i=0;i<listaprimal.size();i++) {
			if (listaprimal.get(i) == "f") {
				val = true;
			    pp++;	
			}
		}
		if(val == true) {
			JOptionPane.showMessageDialog(null,"ACERTOU ");
			btn6.setText("");
	        for (int i=0;i<listaprimal.size();i++) {
	        	if(listaprimal.get(i) == "f") {
	        		if(i == 0) {
	        			label1.setText("      f");
	        		}
	        		else if(i == 1) {
	        			label2.setText("      f");
	        		}
	        		else if(i == 2) {
	        			label3.setText("      f");
	        		}
	        		else if(i == 3) {
	        			label4.setText("      f");
	        			
	        		}
	        		else if(i == 4) {
	        			label5.setText("      f");
	        		}	
	        		
	        		if(pp == listaprimal.size()) {
	        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
	        			init();
	        		}
	        		val=false;
	        	}
	        	
	        }			
			
		}
		else {
			JOptionPane.showMessageDialog(null,"ERROU");
			pn --;
			if(pn == 5) {
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
				
			}
			else if(pn == 4) {
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
				
			}
			else if(pn == 3) {
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
				
			}
			else if(pn == 2) {
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
			}
			else if(pn == 1) {
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
				
			}
			else if(pn == 0) {
				JOptionPane.showMessageDialog(null,"Voce perdeu  ");
				label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
				
			}
		}
        	
        	
			
		}
		/////////// g
        else if(arg0.getSource().equals(btn7)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "g") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn7.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "g") {
		        		if(i == 0) {
		        			label1.setText("      g");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      g");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      g");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      g");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("      g");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		/////////// H
        else if(arg0.getSource().equals(btn8)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "h") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn10.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "h") {
		        		if(i == 0) {
		        			label1.setText("      h");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      h");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      h");
		        		}
		        		else if(i == 3) {
		        			label6.setText("      h");
		        			
		        		}
		        		else if(i == 4) {
		        			label7.setText("      h");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		
		////////// I
        else if(arg0.getSource().equals(btn9)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "i") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn9.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "i") {
		        		if(i == 0) {
		        			label1.setText("     i");
		        		}
		        		else if(i == 1) {
		        			label2.setText("     i");
		        		}
		        		else if(i == 2) {
		        			label3.setText("     i");
		        		}
		        		else if(i == 3) {
		        			label4.setText("     i");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("     i");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		
	    }
		
		///////// J
        else if(arg0.getSource().equals(btn10)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "j") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn10.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "j") {
		        		if(i == 0) {
		        			label1.setText("      j");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      j");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      j");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      j");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("      j");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		////////// K
        else if(arg0.getSource().equals(btn11)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "k") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn11.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "k") {
		        		if(i == 0) {
		        			label1.setText("       k");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       k");
		        		}
		        		else if(i == 2) {
		        			label3.setText("       k");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      k");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("     k");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		////////// L
        else if(arg0.getSource().equals(btn12)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "l") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn12.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "l") {
		        		if(i == 0) {
		        			label1.setText("     l");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      l");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      l");
		        		}
		        		else if(i == 3) {
		        			label6.setText("      l");
		        			
		        		}
		        		else if(i == 4) {
		        			label7.setText("      l");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn12.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		////////// M
        else if(arg0.getSource().equals(btn13)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "m") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn13.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "m") {
		        		if(i == 0) {
		        			label1.setText("     m");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    m");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    m");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    m");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("    m");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn13.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		///////// N
        else if(arg0.getSource().equals(btn14)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "n") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn14.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "n") {
		        		if(i == 0) {
		        			label1.setText("       n");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       n");
		        		}
		        		else if(i == 2) {
		        			label3.setText("       n");
		        		}
		        		else if(i == 3) {
		        			label4.setText("       n");
		        			
		        		}
		        		else if(i == 4) {
		        			label6.setText("       n");
		        		}	
		        		else if(i == 5) {
		        			label7.setText("       n");
		        		}
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn14.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		/////// O
        else if(arg0.getSource().equals(btn15)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "o") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn15.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "o") {
		        		if(i == 0) {
		        			label1.setText("    o");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    o");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    o");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    o");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("o");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn15.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		////////// P
        else if(arg0.getSource().equals(btn16)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "p") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn16.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "p") {
		        		if(i == 0) {
		        			label1.setText("    p");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    p");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    p");
		        		}
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn16.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		}
		////////// Q
         else if(arg0.getSource().equals(btn17)) {
        	 for (int i=0;i<listaprimal.size();i++) {
 				if (listaprimal.get(i) == "q") {
 					val = true;
 				    pp++;	
 				}
 			}
 			if(val == true) {
 				JOptionPane.showMessageDialog(null,"ACERTOU ");
 				btn17.setText("");
 		        for (int i=0;i<listaprimal.size();i++) {
 		        	if(listaprimal.get(i) == "q") {
 		        		if(i == 0) {
 		        			label1.setText("    q");
 		        		}
 		        		else if(i == 1) {
 		        			label2.setText("    q");
 		        		}
 		        		else if(i == 2) {
 		        			label3.setText("    q");
 		        		}
 		        		else if(i == 3) {
 		        			label4.setText("    q");
 		        			
 		        		}
 		        		else if(i == 4) {
 		        			label5.setText("    q");
 		        		}	
 		        		
 		        		if(pp == listaprimal.size()) {
 		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
 		        			init();
 		        		}
 		        		val=false;
 		        	}
 		        	
 		        }			
 				
 			}
 			else {
 				JOptionPane.showMessageDialog(null,"ERROU");
 				btn17.setText("");
 				pn --;
 				if(pn == 5) {
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
 					
 				}
 				else if(pn == 4) {
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
 					
 				}
 				else if(pn == 3) {
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
 					
 				}
 				else if(pn == 2) {
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
 				}
 				else if(pn == 1) {
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
 					
 				}
 				else if(pn == 0) {
 					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
 					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
 					
 				}
 			}
			
		}
		///////// R
        else if(arg0.getSource().equals(btn18)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "r") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn18.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "r") {
		        		if(i == 0) {
		        			label1.setText("    r");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    r");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    r");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    r");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("    r");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn18.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
 		}
		///////// S
        else if(arg0.getSource().equals(btn19)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "s") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn19.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "s") {
		        		if(i == 0) {
		        			label1.setText("    s");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    s");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    s");
		        		}
		        		else if(i == 3) {
		        			label6.setText("    s");
		        			
		        		}
		        		else if(i == 4) {
		        			label7.setText("    s");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn19.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		//////// T
        else if(arg0.getSource().equals(btn20)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "t") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn20.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "t") {
		        		if(i == 0) {
		        			label1.setText("    t");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    t");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    t");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    t");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("    t");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn20.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		//////// U
        else if(arg0.getSource().equals(btn21)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "u") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn21.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "u") {
		        		if(i == 0) {
		        			label1.setText("     u");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    u");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    u");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    u");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("    u");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn21.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
			
		}
		//////// V
        else if(arg0.getSource().equals(btn22)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "v") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn22.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "v") {
		        		if(i == 0) {
		        			label1.setText("      v");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      v");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      v");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      v");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("     v");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn22.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		}
		
		///////// W
        else if(arg0.getSource().equals(btn23)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "w") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn23.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "w") {
		        		if(i == 0) {
		        			label1.setText("    w");
		        		}
		        		else if(i == 1) {
		        			label2.setText("    w");
		        		}
		        		else if(i == 2) {
		        			label3.setText("    w");
		        		}
		        		else if(i == 3) {
		        			label6.setText("    w");
		        			
		        		}
		        		else if(i == 4) {
		        			label7.setText("4");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn23.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
        	
		}
        	
			
        
		//////// X
        else if(arg0.getSource().equals(btn24)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "x") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn24.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "x") {
		        		if(i == 0) {
		        			label1.setText("     x");
		        		}
		        		else if(i == 1) {
		        			label2.setText("     x");
		        		}
		        		else if(i == 2) {
		        			label3.setText("     x");
		        		}
		        		else if(i == 3) {
		        			label4.setText("    x");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("   x");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn24.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		}
		/////// Y
        else if(arg0.getSource().equals(btn25)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "y") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn25.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "y") {
		        		if(i == 0) {
		        			label1.setText("      y");
		        		}
		        		else if(i == 1) {
		        			label2.setText("      y");
		        		}
		        		else if(i == 2) {
		        			label3.setText("      y");
		        		}
		        		else if(i == 3) {
		        			label4.setText("      y");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("     y");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn25.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		}
		//////// Z
        else if(arg0.getSource().equals(btn26)) {
        	for (int i=0;i<listaprimal.size();i++) {
				if (listaprimal.get(i) == "z") {
					val = true;
				    pp++;	
				}
			}
			if(val == true) {
				JOptionPane.showMessageDialog(null,"ACERTOU ");
				btn26.setText("");
		        for (int i=0;i<listaprimal.size();i++) {
		        	if(listaprimal.get(i) == "z") {
		        		if(i == 0) {
		        			label1.setText("       z");
		        		}
		        		else if(i == 1) {
		        			label2.setText("       z");
		        		}
		        		else if(i == 2) {
		        			label3.setText("       z");
		        		}
		        		else if(i == 3) {
		        			label4.setText("       z");
		        			
		        		}
		        		else if(i == 4) {
		        			label5.setText("       z");
		        		}	
		        		
		        		if(pp == listaprimal.size()) {
		        			JOptionPane.showMessageDialog(null,"WE ARE CHAMPIONS MY FRIEENDS");	
		        			init();
		        		}
		        		val=false;
		        	}
		        	
		        }			
				
			}
			else {
				JOptionPane.showMessageDialog(null,"ERROU");
				btn26.setText("");
				pn --;
				if(pn == 5) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca2.png"));
					
				}
				else if(pn == 4) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca3.png"));
					
				}
				else if(pn == 3) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca4.png"));
					
				}
				else if(pn == 2) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca5.png"));
				}
				else if(pn == 1) {
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca6.png"));
					
				}
				else if(pn == 0) {
					JOptionPane.showMessageDialog(null,"Voce perdeu  ");
					label5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hsales\\eclipse-workspace\\JogoDaForca\\src\\forca7.png"));
					
				}
			}
		}
	}

}
