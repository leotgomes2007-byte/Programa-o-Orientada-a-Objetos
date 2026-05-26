package project;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Boletim b = new Boletim();
		
		Aluno a1 = new Aluno("Leo",7);
		Aluno a2 = new Aluno("kaua",4);
	
		b.imprimirStatus(a1);
		b.imprimirStatus(a2);
	}

}
