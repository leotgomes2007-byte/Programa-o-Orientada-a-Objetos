package projeto;

public class Cliente extends Produto {
	
	
	public Cliente(double preco) {
		super(preco);
	}

	public void calcularPrecoFinal(double desconto) {
		System.out.println("O produto custa(desconto): "+(preco -desconto));
	}
}
