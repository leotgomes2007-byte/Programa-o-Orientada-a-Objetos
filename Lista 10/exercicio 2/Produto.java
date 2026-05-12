package project;

public class Produto {
	protected String nome;
	protected double preco;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void desconto(double desconto) {
		System.out.println("Estou na classe Produto");
		preco -= desconto;
		System.out.println("Produto: "+nome+"--Preço: "+preco+"--Preço com desconto"+(preco -= desconto));

	}
	
	
}
