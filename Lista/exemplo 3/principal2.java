package project;

public class principal2 {
	public static void main(String[] args) {
//	Endereco e = new Endereco("Rua 1",123);
//	Pessoa2 p = new Pessoa2 ("João",30,e);
	Pessoa2 p = new Pessoa2("João",30, new Endereco("Rua 1",123));
			
			System.out.println("Nome: "+p.getNome());
			System.out.println("Idade: "+p.getIdade());
			System.out.println("Endereco: "+p.getEndereco());
			System.out.println("Endereco: "+p.getEndereco().toString());
			System.out.println("Rua: "+p.getEndereco().getRua());
			System.out.println("Numero: "+p.getEndereco().getNumero());
	}
}
