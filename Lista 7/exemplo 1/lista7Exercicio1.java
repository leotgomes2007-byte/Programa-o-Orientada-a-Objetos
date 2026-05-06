package projeto;

import java.util.Scanner;

public class lista7Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float saque;
		ContaBancaria c = new ContaBancaria(0,0);
		
		System.out.println("Informe o saldo:");
		float saldo = teclado.nextFloat();
		c.setSaldo(saldo);
		
		System.out.println("Informe o limite do seu cartão:");
		float limite = teclado.nextFloat();
		c.setLimite(limite);
		
		System.out.println("Saldo DIsponivel: "+ c.getSaldo());
		System.out.println("Limite DIsponivel: "+ c.getLimite());

		
		System.out.println("informe o valor que deseja sacar:");
		saque = teclado.nextFloat();
		c.saque(saque);
		
		System.out.println("Saldo DIsponivel: "+ c.getSaldo());

	}

}
