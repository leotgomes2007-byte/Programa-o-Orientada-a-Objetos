package project;

import java.util.ArrayList;
import java.util.List;

public class Lista10Exercicio9 {
	public static void main(String[] args) {
	List<Produto> listaDeProdutos = new ArrayList<>();
	
	listaDeProdutos.add(new Produto("notebook",3000,50));
	listaDeProdutos.add(new Produto("TV",1000,200));
	listaDeProdutos.add(new Produto("forno",800,100));
	listaDeProdutos.add(new Produto("fone",150,100));
	
	System.out.println("--- Lista de produtos ---");
	for(Produto produto : listaDeProdutos) {
		produto.mostrar();
	}
	}
}
