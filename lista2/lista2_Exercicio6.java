package jkg;

import java.util.Scanner;

public class lista2_Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
	
		System.out.println("Informe numeros inteiros(digite 0 para sair):");
		
		int i = 0;
		do {
			System.out.println("informe u numero inteiro: "+i);
			numero = teclado.nextInt();
			System.out.println("O numero informado foi: " + numero);
			
			i++;
		}
		while(numero != 0);
	}

}
