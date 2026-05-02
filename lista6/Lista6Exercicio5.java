package project;

import java.util.Scanner;

public class Lista6Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String temperatura;
		double fahrenheit;	
		
		System.out.println("Informe uma temperatura");
		temperatura = teclado.nextLine();
		
		try {
		double celsios = Double.parseDouble(temperatura); 
		
		fahrenheit = (celsios * 1.8) + 32;
		System.out.println("temperatura em fahrenheit "+ fahrenheit );
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido!");
            System.out.println("Digite um número válido usando ponto (ex: 25.5)");
        }
	
}
}
