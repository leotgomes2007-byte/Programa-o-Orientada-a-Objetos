package poeject;

public abstract class Animal {
	public String especie;
	public int idade;
	public String raca;
	public abstract void emiteSom();
	
	public void exibeInfo() {
		System.out.println("Especie:"+especie);
		System.out.println("Idade: "+idade);
		System.out.println("Raça: "+raca);
	}
}
