package project;

import java.util.ArrayList;
import java.util.List;

public class Lista10Exercicio10 {
	public static void main(String[] args) {
	List<Aluno>lista = new ArrayList<>();
	
	lista.add(new Aluno("Leo",8,9));
	lista.add(new Aluno("Rafael",6,8));
	lista.add(new Aluno("Enzo",4,5));
	lista.add(new Aluno("Luiza",10,10));
	
	for(Aluno aluno : lista) {
		aluno.calculaMedia();
		aluno.resultado();
		
	}
	}
}
