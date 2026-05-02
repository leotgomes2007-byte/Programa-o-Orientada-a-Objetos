package project;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produtos(String nome,double preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("--Informações do Produto--");
		System.out.println("Nome:"+nome);
		System.out.println("Preco:"+preco);
		System.out.println("Quantidade:"+quantidade);
	}
	
	public double calcularValorTotal() {
		return preco*quantidade;
	}
	
}
