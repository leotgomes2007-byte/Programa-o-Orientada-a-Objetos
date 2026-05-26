package projeto;

public class Produto {
public double preco;

	public Produto(double preco) {
	super();
	this.preco = preco;
}

	public void calcularPrecoFinal() {
		System.out.println("O produto custa: "+preco);
	}
}
