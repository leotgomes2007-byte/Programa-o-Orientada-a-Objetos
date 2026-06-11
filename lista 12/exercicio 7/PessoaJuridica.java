package project;

public class PessoaJuridica extends Pessoa {
	private String CNPJ;

	public PessoaJuridica(String nome, String cidade, String cNPJ) {
		super(nome, cidade);
		CNPJ = cNPJ;
	}
	
	public void EfetuarCompra() {
		System.out.println("Pessoa Fisica Efeituou a compra");
		System.out.println("Nome: "+getNome()+" Cidade: "+getCidade()+" CNPJ: "+CNPJ);
	}
}
