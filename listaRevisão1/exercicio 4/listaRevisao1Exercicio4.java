package project;

import java.util.Scanner;

public class listaRevisao1Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float largura,altura;
		
		System.out.println("Digite a largura do retangulo: ");
		largura = teclado.nextFloat();
		System.out.println("Digite a altura do retangulo:");
		 altura = teclado.nextFloat();

		
		Retangulo r = new Retangulo(largura,altura);
		
		r.calcularArea();
		r.calcularPerimetro();
		r.calcularDiagonal();

		
		if(r.ehQuadrado() == false) {
			System.out.println("não é quadrado");
		}else {
			System.out.println("é quadrado");
		}

	}

}
