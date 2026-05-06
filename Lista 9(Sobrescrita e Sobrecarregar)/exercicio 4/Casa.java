package projeto;

public class Casa {
	
	public double calcularPreco(double tamanho,double valor) {
		return tamanho*valor;
	}
	
	public double calcularPreco(double tamanho,double valor,int quarto) {
		return tamanho*valor*quarto;
	}
}
