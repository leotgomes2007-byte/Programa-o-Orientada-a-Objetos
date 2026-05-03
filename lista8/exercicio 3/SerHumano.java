package projeto;

public class Pessoa extends SerHumano {

	public Pessoa(String tipo, String nome, int idade) {
		super(tipo, nome, idade);
	}
	
	public void exibir() {
		System.out.println("Tipo: "+tipo);
		System.out.println("Nome: "+nome);		
		System.out.println("Idade: "+idade);
	}
}
