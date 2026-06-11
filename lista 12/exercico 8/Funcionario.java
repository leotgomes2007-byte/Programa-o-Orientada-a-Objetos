package project;

public abstract class Funcionario {
	private String nome;
	private float salario;
	
	public Funcionario(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void CalcularSalario(float aumento) {
		System.out.println("Funcionario:");
		System.out.println("Nome: "+nome+" salario: "+salario+" Salario com aumento: "+(salario+aumento));
	}
}
