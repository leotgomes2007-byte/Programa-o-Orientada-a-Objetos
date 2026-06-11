package project;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    // Construtor agora recebe a idade e repassa para o super()
    public PessoaJuridica(String nome, String cidade, int idade, String cNPJ) {
        super(nome, cidade, idade);
        CNPJ = cNPJ;
    }
    
    @Override
    public void EfetuarCompra() {
        System.out.println("Pessoa Jurídica Efetuou a compra");
        System.out.println("Nome: " + getNome() + " | Cidade: " + getCidade() + " | Idade: " + getIdade() + " | CNPJ: " + CNPJ);
    }
}
