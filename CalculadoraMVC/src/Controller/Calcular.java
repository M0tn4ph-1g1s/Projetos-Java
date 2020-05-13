package Controller;

import Model.Numeros;

public class Calcular {
	Double num1;
	Double num2;
	String opera;
	Double cal;
	public Double calculo(Numeros num) {
		num1 = num.getnum1();
		num2 = num.getnum2();
		opera = num.getopera();
		System.out.println(num1);
		if(opera == "+") {
			cal = num1+num2;
		}
		else if(opera == "*"){
			cal=num1*num2;
		}
		else if(opera == "-"){
			cal=num1-num2;
		}
		else if(opera == "/"){
			cal=num1/num2;
		}
		return cal;
		
	}

}
