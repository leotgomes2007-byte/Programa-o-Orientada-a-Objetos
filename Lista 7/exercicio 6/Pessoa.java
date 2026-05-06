package projeto;

public class Pessoa {
	private String nome;
	private int  idade;
	private String  CPF;
	
	public Pessoa(String nome, int idade,String CPF){
		this. nome =  nome;
		this.idade = idade;
		this.CPF = CPF;
	}
	

	public String  getNome() {
		return nome;
	}	
	public int  getIdade() {
		return idade;
	}

	public String  getCPF() {
		return CPF;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}	
	
	public void  verificaMaiorDeIdade() {
		if(idade > 18) {
			System.out.println("A pessoa informada é maior de idade");
		}else {
			System.out.println("A pessoa informada não  é maior de idade");
		}
	}
	
}
