package project;

import java.util.Scanner;

public class listaRecisão2Exercicio7 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--Informe os dados do Produto 1--");
		System.out.println("Nome:");
		String nome = teclado.nextLine();
		
		System.out.println("Preco:");
		double preco =  teclado.nextDouble();

		System.out.println("Quantidade:");		
		int quantidade = teclado.nextInt();
		
		Produtos p1 = new Produtos(nome,preco,quantidade);
		
		p1.exibirInformacoes();
		System.out.println("Valor Total:"+p1.calcularValorTotal());
		
		teclado.nextLine();
		
		System.out.println("--Informe os dados do Produto 2--");
		System.out.println("Nome:");
		 nome = teclado.nextLine();
		
		System.out.println("Preco:");
		 preco =  teclado.nextDouble();

		System.out.println("Quantidade:");		
		 quantidade = teclado.nextInt();
		
		Produtos p2 = new Produtos(nome,preco,quantidade);
		
		p2.exibirInformacoes();
		System.out.println("Valor Total:"+p2.calcularValorTotal());
		}
}
