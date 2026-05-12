package project;

public class lista10Exercicio2 {
	public static void main(String[] args) {
			Produto p = new Produto("Torradeira",120);
			
			p.desconto(10);
			
			ProdutoComDesconto pd = new ProdutoComDesconto("cadeira",100);
			
			pd.desconto();
	}
}
