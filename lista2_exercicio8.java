package jkg;

import java.util.Scanner;

public class lista2_exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cidade;	
		System.out.println("Informe o nome das cidade do usuario");
		
		int i = 0;
		do {
			System.out.println("Informe a cidade do usuario: "+i);
			cidade = teclado.nextLine();
			System.out.println("A cidade informada foi " + cidade);
			
			i++;
		}
		while(!cidade.equals("Sao Paulo"));
	}

}
