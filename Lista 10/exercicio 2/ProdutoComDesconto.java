package project;

public class ProdutoComDesconto extends Produto {
	
	public ProdutoComDesconto(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	public void desconto() {
		System.out.println("Estou na classe ProdutoComDesconto");
		System.out.println("Desconto predefinido de 20 R$ ");
		System.out.println("Produto: "+nome+"--Preço: "+preco+"--Preço com desconto"+(preco -= 20));
	}
	
}
