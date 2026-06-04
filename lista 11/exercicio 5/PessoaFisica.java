class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("PF: " + getNome() + " (CPF: " + cpf + ") comprou o valor de R$" + valor);
    }
}
