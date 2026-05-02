package projeto;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa(String nomePessoa,int idadePessoa) {
		System.out.println("estou no construtor");
		nome = nomePessoa;
		idade = idadePessoa;
		System.out.println("Nome:"+nome);
		System.out.println("idade:"+idade);
	}
	
	public Pessoa(int idadePessoa) {
		System.out.println("estou no  outro construtor");
		idade = idadePessoa;
		System.out.println("Idade:"+idade);
	}
}
