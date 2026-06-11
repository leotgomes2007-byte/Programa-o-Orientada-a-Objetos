package project;

public abstract class Pessoa {
	private String nome;
	private String cidade;
	
	
	public Pessoa(String nome, String cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void EfetuarCompra() {
		System.out.println("Pessoa Efeituou a compra");
		System.out.println("Nome: "+nome+" Cidade: "+cidade);
	}
}
