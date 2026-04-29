package project;

public class Quadrado extends Desenho2D{
	protected String desc;

	public Quadrado(int largura,int altura,String nomeAutor,String desc) {
		super(largura,altura,nomeAutor);
		this.desc = desc;
	}

	public void exibeDados() {
		System.out.println("Largura: "+this.largura);
		System.out.println("Altura: "+this.altura);		
		System.out.println("descricao: "+this.desc);
		System.out.println("Autor: "+this.nomeAutor);
	}
}
