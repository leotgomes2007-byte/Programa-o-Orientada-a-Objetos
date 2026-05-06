package project;

import java.util.Scanner;

public class Lista7Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Circulo c = new Circulo(0);
		
		System.out.println("Informe o raio do circulo:");
		float raio =  teclado.nextFloat();
		c.setRaio(raio);
		
		System.out.println("O raio do circulo é:"+c.getRaio());
		System.out.println("O valor da area do circulo é:"+c.calculaArea());
	}

}
