package projeto;

public class Retangulo  extends Figura {
	protected int largura;
	protected int altura;
	
	public Retangulo(String cor, String preenchido,int largura, int altura) {
		super(cor,preenchido);
		this.largura = largura;
		this.altura = altura;
	}
	
	public int calcularArea() {
		return largura * altura;
	}
	
	public void exibir() {
		System.out.println("Cor: "+cor);
		System.out.println("Preenchido: "+preenchido);
		System.out.println("largura: "+largura);
		System.out.println("altura:"+altura);
	}
}
