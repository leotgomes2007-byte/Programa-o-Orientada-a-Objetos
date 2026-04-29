package project;

public class PrincipalPessoa {
	public static void main(String[] args) {


		Pessoa p = new Pessoa("Ricardo",41);
		p.exibirDados();
		
		PessoaJuridica  j = new PessoaJuridica("leo",19,"35400000145","gui","20/03/1900");
		
		j.Exibir();
		
	}	
}
