package poeject;

public class Main {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		c.nome = "Caramelo";
		c.raca = "sinpson";
		c.idade = 67;
		
		c.emitirSom();
		c.exibeInfo();
		System.out.println("chamando verificação de cachorro: "+c.Verificavacinação());
		
		System.out.println("-------------------------------------------------------");
		Gato g = new Gato();
		g.emitirSom();
		g.exibeInfo();
		System.out.println("chamando verificação de Gato: "+c.Verificavacinação());
	}
}
