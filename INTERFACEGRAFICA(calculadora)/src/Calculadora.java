import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.Color;
import javax.swing.text.*;
import javax.swing.text.*;
public class Calculadora extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3,btn4,btn5;
    JTextField txt1,txt2;
    JLabel label1,label2,label3;
    String nome = "Calculadora";
    
    public void init(){
		
		
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getContentPane().setBackground(Color.blue);
		
		

		label1 = new JLabel();
		label1.setText("Calculadora");
		label1.setSize(300,100);
		label1.setLocation(140,-40);
		label1.setVisible(true);
		label1.setForeground(Color.white);
		add(label1);
		
		label2 = new JLabel();
		label2.setText("valor 1");
		label2.setSize(300,100);
		label2.setLocation(20,-10);
		label2.setVisible(true);
		label2.setForeground(Color.white);
		add(label2);
		
		label3 = new JLabel();
		label3.setText("valor 2");
		label3.setSize(300,100);
		label3.setLocation(20,60);
		label3.setVisible(true);
		label3.setForeground(Color.white);
		add(label3);
		
		txt1 = new JTextField();
		txt1.setSize(280,30);
		txt1.setLocation(20,60);
		txt1.setText("Primeiro Numero");
		txt1.setVisible(true);
		add(txt1);
		
		
		txt2 = new JTextField();
		txt2.setSize(280,30);
		txt2.setLocation(20,130);
		txt2.setText("Segundo Numero");
		add(txt2);
		
		
		
		btn1 = new JButton();
		btn1.setText("+");
		btn1.setSize(50,50);
		btn1.setLocation(20,200);
		btn1.addActionListener(this);
		add(btn1);
		

		btn2 = new JButton();
		btn2.setText("-");
		btn2.setSize(50,50);
		btn2.setLocation(90,200);
		btn2.addActionListener(this);
		add(btn2);
		
		btn3 = new JButton();
		btn3.setText("*");
		btn3.setSize(50,50);
		btn3.setLocation(160,200);
		btn3.addActionListener(this);
		
		add(btn3);
		
		btn4 = new JButton();
		btn4.setText("/");
		btn4.setSize(50,50);
		btn4.setLocation(230,200);
		btn4.addActionListener(this);
		add(btn4);
		
		
		setVisible(true);
	
		
	}
    @Override
    public void actionPerformed(ActionEvent arg) {
    	if(arg.getSource().equals(btn1)) {
            try{
			   double cal;
               double numero = Double.parseDouble(txt1.getText());
               double numero2 = Double.parseDouble(txt2.getText());
               cal = numero+numero2;
               JOptionPane.showMessageDialog(null,cal);	
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"formato invalido");
            }
		}
		
		else if(arg.getSource().equals(btn2)) {
            try{
			   double cal;
               double numero = Double.parseDouble(txt1.getText());
               double numero2 = Double.parseDouble(txt2.getText());

               cal = numero-numero2;

               JOptionPane.showMessageDialog(null,cal);	
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"formato invalido");
            }
		}
		
		else if(arg.getSource().equals(btn3)) {
            try{
			   double cal;
               double numero = Double.parseDouble(txt1.getText());
               double numero2 = Double.parseDouble(txt2.getText());

               cal = numero*numero2;

               JOptionPane.showMessageDialog(null,cal);
            }
            catch(Exception e) {
            	JOptionPane.showMessageDialog(null,"formato invalido");
            	
            }
		}

    }

}
