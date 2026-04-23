package pkg;

import java.util.Scanner;

public class lista1_exercicio7 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe um numero:");
		numero1 = teclado.nextInt();
		System.out.println("informe outro numero:");
		numero2 = teclado.nextInt();
	
		if(numero1 % numero2 == 0 ||numero2 % numero1 == 0) {
			System.out.println("Os numeros são multiplos");
		}else {
			System.out.println("Os numeros não são multiplos");
		}
	}

}
