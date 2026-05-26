package project;

public class Exercicio2 {
	public static void main(String[] args) {
	
		CalculaProduto cp = new CalculaProduto();
		Produto notebook = cp.criarProdutoDesconto("notebook gamer", 5000);
		Produto livro = cp.criarProdutoDesconto("Livro Java", 100);
		
		System.out.println("--Produtos Criados--");
		System.out.println("nome: "+notebook.getNome()+"- preco: "+notebook.getPreco());
		System.out.println("nome: "+livro.getNome()+"- preco: "+livro.getPreco());

	}
}
