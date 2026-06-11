package project;

public class PessoaFisica extends Pessoa {
    private String CPF;

    // Construtor agora recebe a idade e repassa para o super()
    public PessoaFisica(String nome, String cidade, int idade, String cPF) {
        super(nome, cidade, idade); 
        CPF = cPF;
    }
    
    @Override
    public void EfetuarCompra() {
        System.out.println("Pessoa Física Efetuou a compra");
        System.out.println("Nome: " + getNome() + " | Cidade: " + getCidade() + " | Idade: " + getIdade() + " | CPF: " + CPF);
    }
}
