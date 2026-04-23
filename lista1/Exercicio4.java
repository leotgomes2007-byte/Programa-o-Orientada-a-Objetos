package pkg;

import java.util.Scanner;

public class lista1_Exercicio4 {

	public static void main(String[] args) {
		int x;
		int y;
		
		System.out.println("Informe o valor do X:");
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();

		System.out.println("Informe o valor do y:");
		y = teclado.nextInt();

	
	if(x > 0 && y > 0) {
		System.out.println("o ponto pertence ao primeiro quadrante");
	}else if(x < 0 && y > 0) {
		System.out.println("o ponto pertence ao segundo quadrante");
	}else if(x < 0 && y < 0) {
		System.out.println("o ponto pertence ao terceiro quadrante");
	}else {
		System.out.println("o ponto pertence ao quarto quadrante");

	}	
	
	}

}
