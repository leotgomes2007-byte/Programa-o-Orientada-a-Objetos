package project;

public class PessoaFisica extends Pessoa {
	private String CPF;

	public PessoaFisica(String nome, String cidade, String cPF) {
		super(nome, cidade);
		CPF = cPF;
	}
	
	public void EfetuarCompra() {
		System.out.println("Pessoa Fisica Efeituou a compra");
		System.out.println("Nome: "+getNome()+" Cidade: "+getCidade()+" CPF: "+CPF);
	}
}
