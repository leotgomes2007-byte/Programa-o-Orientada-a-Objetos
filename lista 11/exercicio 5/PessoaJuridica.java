class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("PJ: Empresa " + getNome() + " (CNPJ: " + cnpj + ") emitiu nota para compra de R$" + valor);
    }
