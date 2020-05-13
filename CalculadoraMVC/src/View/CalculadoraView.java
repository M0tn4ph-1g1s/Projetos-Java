package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Controller.Calcular;
import Model.Numeros;

public class CalculadoraView extends  JFrame implements ActionListener  {
	
	public void Tela() {
		setSize(340,360);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);
		init();
		setVisible(true);
		
	}
	JTextField txt1;
	JButton btn;
	int linha = 100;
	int coluna = 20;
	ArrayList<String> lista = new ArrayList<String>();
	int n1=1;
	
	String opera ="";
	
	String num1 = "";
	String num2 = "";
	Double numDouble1;
	Double numDouble2;
	
	public void init(){
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add("6");
		lista.add("7");
		lista.add("8");
		lista.add("9");
		lista.add("0");
		lista.add("+");
		lista.add("-");
		lista.add("*");
		lista.add("/");
		lista.add("=");
		lista.add("C");
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Verdana", Font.BOLD, 11));
    	txt1.setForeground(Color.black);
    	txt1.setBackground(Color.white);
		txt1.setSize(280,30);
		txt1.setLocation(10,40);
		add(txt1);
		
		for(String j:lista) {
			btn = new JButton();
			btn.setFont(new Font("Verdana", Font.BOLD, 18));
	    	btn.setForeground(Color.white);
	    	btn.setBackground(Color.black);
			btn.setSize(50,50);
			btn.setText(j);
			btn.setLocation(coluna,linha);
			btn.addActionListener(this);
			btn.setBorder(null);
			
			add(btn);
			if(coluna == 220 ) {
				linha = linha+50;
				coluna = 20;
			}
			coluna=coluna+50;
		}
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String valor = ((JButton) e.getSource()).getText().toString();
		if(valor == "1") {
			if(opera == "") {
				num1 = num1+"1";
				numDouble1 = Double.parseDouble(num1);
				txt1.setText(num1);
			}
			else if(opera != "") {
				num2 = num2+"1";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "2") {
			if(opera == "") {
				num1 = num1+"2";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"2";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "3") {
			if(opera == "") {
				num1 = num1+"3";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"3";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "4") {
			if(opera == "") {
				num1 = num1+"4";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"4";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "5") {
			if(opera == "") {
				num1 = num1+"5";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"5";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "6") {
			if(opera == "") {
				num1 = num1+"6";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"6";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "7") {
			if(opera == "") {
				num1 = num1+"7";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"7";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "8") {
			if(opera == "") {
				num1 = num1+"8";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"8";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "9") {
			if(opera == "") {
				num1 = num1+"9";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"9";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "0"){
			if(opera == "") {
				num1 = num1+"0";
				txt1.setText(num1);
				numDouble1 = Double.parseDouble(num1);
			}
			else if(opera != "") {
				num2 = num2+"0";
				txt1.setText(num2);
				numDouble2 = Double.parseDouble(num2);
			}
		}
		else if(valor == "+") {			
			opera = "+";
		}
		else if(valor == "-") {
			opera = "-";
		}
		else if(valor == "*") {
			opera = "*";
		}
		else if(valor == "/") {
			opera = "/";
		}
		else if(valor == "=") {
			Numeros n  = new Numeros();
			n.setnum1(numDouble1);
			n.setnum2(numDouble2);
			n.setopera(opera);
			Calcular c = new Calcular();
			txt1.setText(""+c.calculo(n));
			opera ="";
			num1 = "";
			num2 = "";
			numDouble1 =c.calculo(n);
			numDouble2 =0.0;
			
		}
		else if(valor == "C"){
			opera ="";
			
			num1 = "";
			num2 = "";
			numDouble1 =0.0;
			numDouble2 =0.0;
			txt1.setText("");
			
		}		
	}
}
