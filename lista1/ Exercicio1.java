package pkg;

import java.util.Scanner;

public class lista1_Exercicio1 {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe um numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("informe outro numero:");
		numero2 = teclado.nextInt();		
		
		System.out.println("Adição = "+ (numero1+numero2));
		System.out.println("subtração = "+ (numero1-numero2));
		System.out.println("multiplicação = "+ (numero1*numero2));
		System.out.println("divisão = "+ (numero1/numero2));
	}

}
