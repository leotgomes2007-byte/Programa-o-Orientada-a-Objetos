package projeto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		calculadora  c = new calculadora();

		double resultado;
		resultado = c.somar(4.89,5.33);
		System.out.println("resultado da soma ="+resultado);
		
	}

}
