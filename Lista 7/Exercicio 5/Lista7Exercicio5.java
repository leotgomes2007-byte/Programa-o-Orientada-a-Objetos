package projeto;

import java.util.Scanner;

public class Lista7Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Triangulo t = new Triangulo(0,0,0);
				
		System.out.println("Informe o Valor do lado A:");
		int ladoA = teclado.nextInt();
		t.setLadoA(ladoA);
		
		System.out.println("Informe o Valor do lado B:");
		int ladoB = teclado.nextInt();
		t.setLadoB(ladoB);
		
		System.out.println("Informe o Valor do lado C:");
		int ladoC = teclado.nextInt();
		t.setLadoC(ladoC);

		t.verificaEquilatero();
		
	
	}

}
