package projeto;

import java.util.Scanner;

public class Lista7Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Pessoa p = new Pessoa(null,0,null);
				
		System.out.println("Informe o nome da pessoa:");
		String nome = teclado.nextLine();
		p.setNome(nome);
		
		System.out.println("Informe a idade da pessoa:");
		int idade = teclado.nextInt();
		p.setIdade(idade);
		
		teclado.nextLine();
		
		System.out.println("Informe o CPF da pessoa:");
		String CPF = teclado.nextLine();
		p.setCPF(CPF);
		
		p.verificaMaiorDeIdade();
	}

}
