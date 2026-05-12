package project;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo",41);
		exibiDadosPessoa(p);
	}
	
		public static void exibiDadosPessoa(Pessoa pe) {
			System.out.println("No método estático ExibeDadosPessoa");
			System.out.println("Nome " + pe.getNome());
			System.out.println("Idade "+ pe.getIdade());
		}
	}

