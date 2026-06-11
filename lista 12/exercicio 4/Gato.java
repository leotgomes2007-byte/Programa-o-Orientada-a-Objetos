package project;

public class Gato extends Animal {

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	public void EmitirSom() {
		System.out.println("Classe Gato");
		System.out.println("miau miau");
		System.out.println("Nome: "+getNome()+" Idade: "+getIdade());
	}

}
