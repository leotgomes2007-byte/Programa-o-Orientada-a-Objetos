package projeto;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
//		this.idade = idade;
		this.setIdade(idade); // chamando o set pois tenho validadeção 
	}
	
	public String  getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank() || nome.isEmpty()) {
			System.out.println("Nome invalido!");
		}
		this.nome = nome;
	}	
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Impossivel atribuir idade");
			System.out.println("Idade Invalida");
		}
		
		this.idade = idade;
	}	
	
}
