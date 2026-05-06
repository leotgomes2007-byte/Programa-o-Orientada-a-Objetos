package projeto;

import java.util.Scanner;

public class Lista9Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		System.out.println("Você tem 1000 reais na conta deseja adicionar quanto:");
		valor = teclado.nextDouble();

		ContaBancaria cb = new ContaBancaria();
		
		cb.calcularSaldo(valor);
		
		System.out.println("Você tem 2000 reais na conta deseja adicionar quanto:");
		valor = teclado.nextDouble();
		
		ContaCorrenteque cc = new ContaCorrenteque();
		cc.calcularSaldo(valor);
	}

}
