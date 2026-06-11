package project;

public class Gerente extends Funcionario{

	public Gerente(String nome, float salario) {
		super(nome, salario);
	}
	
	public void CalcularSalario() {
		System.out.println("Gerente:");
		System.out.println("Nome: "+getNome()+" salario: "+getSalario()+" Salario com aumento: "+(getSalario() + (getSalario() * 0.20)));
	}
}
