package project;

import java.util.ArrayList;
import java.util.List;

public class Lista10Exercicio11 {
	public static void main(String[] args) {
	List<Pessoa>lista = new ArrayList<>();
	int contarM = 0;
	
	lista.add(new Pessoa("Maria",47,"F"));
	lista.add(new Pessoa("kaua",22,"M"));
	lista.add(new Pessoa("Luiza",20,"F"));
	lista.add(new Pessoa("Leonardo",19,"M"));

	for(Pessoa pessoa : lista) {
		contarM += pessoa.ehMulher();
	}
	System.out.println("Quantidade de Mulher: "+contarM);
	}
}
