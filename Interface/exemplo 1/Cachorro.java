package poeject;

public class Cachorro implements Animal {
	public String nome;
	public String raca;
	public int idade;
	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}
	@Override
	public void exibeInfo() {
		System.out.println("Cachorro:");
		System.out.println("Raça:"+raca);
		System.out.println("Idade: "+idade);
		System.out.println("Nome: "+nome);
	}
	@Override
	public boolean Verificavacinação() {
		System.out.println("Verificando vacinação do cachorro");
		return false;
	}
	
}
