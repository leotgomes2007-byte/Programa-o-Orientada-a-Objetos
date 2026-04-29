package project;

public class PessoaJuridica extends Pessoa {
	protected String CNPJ;
	protected String Socio;
	protected String dtAbertura;
	
	public PessoaJuridica(String nome, int idade, String cNPJ, String socio, String dtAbertura) {
		super(nome, idade);
		CNPJ = cNPJ;
		Socio = socio;
		this.dtAbertura = dtAbertura;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getSocio() {
		return Socio;
	}

	public void setSocio(String socio) {
		Socio = socio;
	}

	public String getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
	public void Exibir() {
		System.out.println("--Pessoa Juridica--");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("CNPJ: " + CNPJ);
		System.out.println("Socio: " + Socio);
		System.out.println("Data de abertura: " + dtAbertura);

		
	}
	
	

}
