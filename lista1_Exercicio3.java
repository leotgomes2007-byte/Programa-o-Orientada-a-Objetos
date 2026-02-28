package pkg;

import java.util.Scanner;

public class lista1_Exercicio3 {

	public static void main(String[] args) {
		float[] numeros = new float[4];
		int i;
		float soma = 0;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Informe o valor do numero" +i+":");
			Scanner teclado = new Scanner(System.in);
			numeros[i] = teclado.nextFloat();
			soma+=numeros[i];	
		}
		System.out.println("A media:"+(soma/4));
		System.out.println("os numeros maiores que media são:");
		for(i = 0; i < 4; i++) {
			
		if(numeros[i] > (soma/4)) {
			System.out.println(+numeros[i]);
		}
		
		
		}
	}

}
