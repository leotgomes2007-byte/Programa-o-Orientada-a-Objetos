abstract class Pessoa {
    private String nome;
    private String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = city: cidade;
    }

    public abstract void efetuarCompra(double valor);

    public String getNome() { return nome; }
}
