package project;

import java.util.Scanner;

public class Lista9exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double base, altura;
		
		System.out.println("Informe o valor da base:");
		base = teclado.nextDouble();
		
		System.out.println("Informe o valor da altura:");
		altura = teclado.nextDouble();
		
		System.out.println("Forma Geometrica(Quadrado):");
		FormaGeometrica f = new FormaGeometrica();
		System.out.println("Area: "+f.calcularArea(base, altura));
		
		System.out.println("Triangulo:");
		Triangulo t = new Triangulo();
		System.out.println("Area: "+t.calcularArea(base, altura));
	}
}
