package projeto;

import java.util.Scanner;

public class Lista8Exercicio3 {
	public static void main(String[]args) {

	Scanner teclado = new Scanner(System.in);
	String tipo,nome;
	int idade;
	
	System.out.println("--Informe os dados pedidos--");
	System.out.println("Tipo: ");
	tipo = teclado.nextLine();
	System.out.println("Nome: ");
	nome = teclado.nextLine();
	System.out.println("Idade: ");
	idade = teclado.nextInt();
	
	Pessoa p = new Pessoa(tipo,nome,idade);
	
	p.andar();
	p.falar();
	p.exibir();
	
	}
}
