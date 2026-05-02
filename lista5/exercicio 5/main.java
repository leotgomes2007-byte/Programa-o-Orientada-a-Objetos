package projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		int idade;
		int controleConstrutor;
		
		System.out.println("Informe qual construtor vc quer ver(1 ou 2):");
		controleConstrutor = teclado.nextInt();
		
		if (!(controleConstrutor == 1 || controleConstrutor == 2)) {
		    System.out.println("erro: opção inválida");
		    return;
		}
		
		teclado.nextLine();
		
		System.out.println("Informe o nome da pessoa:");
		nome = teclado.nextLine();
		System.out.println("Informe a idade da pessoa:");
		idade = teclado.nextInt();
		
		if(controleConstrutor == 1) {
		Pessoa p1 = new Pessoa(nome,idade);
		}else {
		Pessoa p2 = new Pessoa(idade);
		}
		
		
	}

}
