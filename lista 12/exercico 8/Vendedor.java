package project;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, float salario) {
		super(nome, salario);
	}
	public void CalcularSalario(float comissao) {
		System.out.println("Vendedor:");
		System.out.println("Nome: "+getNome()+" salario: "+getSalario()+" Salario com aumento: "+(getSalario() + comissao));
	}
}
