package poeject;

public class Gato implements Animal {

	public void emitirSom() {
		System.out.println("miau miau miau");
	}
	@Override
	public void exibeInfo() {
		System.out.println("Classe Gato");
	}
	@Override
	public boolean Verificavacinação() {
		System.out.println("Verificando vacinação do Gato");
		return true;
	}
	
}
