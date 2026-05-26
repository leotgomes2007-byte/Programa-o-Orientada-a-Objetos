package project;

public class Aluno {
	private String nome;
	private float notaFinal;
	
	public Aluno(String nome, float notaFinal) {
		this.nome = nome;
		this.notaFinal = notaFinal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
