package projeto;

public class Funcionario extends Pessoa {
	
	
	public Funcionario(String nome) {
		super(nome);
	}

	public void trabalhar() {
		System.out.println("Nome: "+nome);
		System.out.println("O funcionario está trabalhando");
	}
}
