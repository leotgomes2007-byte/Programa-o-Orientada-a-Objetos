package pkg;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		//leitura dos dados
		System.out.println("--Informe os dados do Produto--");
		
		System.out.println("Nome:");
		p1.Nome = teclado.nextLine();
		System.out.println("Preço:");
		p1.Preco = teclado.nextFloat();
		System.out.println("quantidade Em Estoque:");
		p1.quantidadeEmEstoque = teclado.nextFloat();
	
		//exibir produto
		System.out.println("--produto 1 instanciado--");
		System.out.println("nome:"+p1.Nome);
		System.out.println("preço:"+p1.Preco);
		System.out.println("quantidade em estoque:"+p1.quantidadeEmEstoque);
		System.out.println("valor total em estoque: "+ p1.Preco * p1.quantidadeEmEstoque);
	}

}
