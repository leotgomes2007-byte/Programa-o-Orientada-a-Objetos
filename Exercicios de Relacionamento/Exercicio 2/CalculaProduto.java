package project;

public class CalculaProduto {
	
	public Produto criarProdutoDesconto(String nome, double preco){
		double precoDesconto = preco * 1.10;
		
		return new Produto(nome,precoDesconto);
	}
}
