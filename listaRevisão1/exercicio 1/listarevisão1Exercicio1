package project;

import java.util.Scanner;

public class listarevisão1Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int quantidade,add,venda;
		float preco;
		
		System.out.println("Digite o nome do produto: ");
		nome = teclado.nextLine();
		
		System.out.println("Digite a quantidad em estoque: ");
		quantidade = teclado.nextInt();
		
		System.out.println("Digite adigite o preço do produto: ");
		preco = teclado.nextFloat();
		
		Produto p = new Produto(nome,quantidade,preco);
		
		System.out.println("A empresa tem"+  p.ValorTotalEstoque() +" de valor de estoque"); 
		
		System.out.println("Informe a quantidade de produtos adicionados ao estoque:");
		add = teclado.nextInt();
		System.out.println("O seu estoque tem agora "+p.adicionarEstoque(add)+ "produtos");
		
		System.out.println("Informe a quantidade de vendas:");
		venda = teclado.nextInt();
		System.out.println("O seu estoque tem agora "+p.vender(venda)+ "produtos");
	}

	}


