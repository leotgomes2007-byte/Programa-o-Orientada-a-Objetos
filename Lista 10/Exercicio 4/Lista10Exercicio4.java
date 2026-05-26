package projeto;

import java.util.Scanner;

public class Lista10Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o saldo em conta: ");
		double saldo = teclado.nextDouble();
		
		System.out.println("Informe o valor que deseja depoisitar:");
		double valor = teclado.nextDouble();

		ContaBancaria cb = new ContaBancaria(saldo);
		cb.depositar(valor);
		
		System.out.println("Informe o valor do cheque");
		double cheque = teclado.nextDouble();
		
		Cheque c = new Cheque(cheque, saldo);
		c.depositar(cheque);

	}
}
