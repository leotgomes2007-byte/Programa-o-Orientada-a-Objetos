package project;

public class Boletim {
	public void imprimirStatus(Aluno a) {
		System.out.println("ALUNO: "+a.getNome());
		if(a.getNotaFinal() >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
