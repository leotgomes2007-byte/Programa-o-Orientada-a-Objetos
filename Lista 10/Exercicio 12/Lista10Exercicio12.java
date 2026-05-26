package project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista10Exercicio12 {
	public static void main(String[] args) {
	List<Livro>lista = new ArrayList<>();
	
	lista.add(new Livro("memorias postumas","Machado",1860));
	lista.add(new Livro("pica pau amarelo","lobato",1930));
	lista.add(new Livro("meditações","marco aureleo",500));
	lista.add(new Livro("O principe","maquiavel",1600));
	
	lista.sort(Comparator.comparingInt(Livro->Livro.ano));
	
	for(Livro livro : lista) {
		System.out.println("Titulo: "+livro.titulo+" -Autor: "+livro.autor+"-ano: "+livro.ano);
	}
	}
}
