package project;

public class Pessoa {
	public String nome;
	public int idade;
	public String sexo;
	
	public Pessoa(String nome,int idade,String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public int ehMulher() {
		if(sexo.toUpperCase().equals("F")) {
			return 1;
		}else {
			return 0;
		}
	}
}
