package project;

public class Animal {
	protected String nome;
	protected int idade;
	protected String som;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	public void exibir() {
		System.out.println("estou no animal");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("som: " + som);
	}
	
}
