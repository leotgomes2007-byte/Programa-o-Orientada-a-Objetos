package project;

import java.util.Scanner;

public class Lista7Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Retangulo r = new Retangulo(0,0);
		
		System.out.println("Informe a base do retangulo:");
		int base =  teclado.nextInt();
		r.setBase(base);
		
		System.out.println("Informe a altura do retangulo:");
		int altura =  teclado.nextInt();
		r.setAltura(altura);
		
		System.out.println("A base do retangulo é:"+r.getBase());
		System.out.println("A altura do retangulo é:"+r.getAltura());
		System.out.println("O valor da area do retangulo é:"+r.calculaArea());
	
	}

}
