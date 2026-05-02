package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista6Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String numero;
		
		try {
		System.out.println("escreva um numero:");
		numero = teclado.nextLine();
		
		double numeroD = Double.parseDouble(numero); 

		
		System.out.println("Numero em String:"+ numero);
		System.out.println("Numero em Double:"+ numeroD);		
		}catch (NumberFormatException e) {
		System.out.println("erro na hora de converter o String para Double");
		}
		
	}

}
