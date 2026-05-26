package project;

public class Aluno {
	public String nome;
	public float nota1;
	public float nota2;
	public float media;
	
	public Aluno(String nome,float nota1,float nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public void calculaMedia() {
		media = (nota1 + nota2)/2;
	}
	
	public void resultado() {
		System.out.println("Aluno: "+nome);
		if(media >=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
