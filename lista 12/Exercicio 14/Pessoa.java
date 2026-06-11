package project;

public abstract class Pessoa {
    private String nome;
    private String city; 
    private String cidade;
    private int idade; 

    // 2. Construtor atualizado para receber a idade
    public Pessoa(String nome, String cidade, int idade) {
        super();
        validarIdade(idade); // <-- 4. Chama a validação antes de salvar o atributo
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    // 3. Método de validação que lança a exceção
    public void validarIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida! A idade deve ser entre 0 e 120 anos.");
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { 
        validarIdade(idade); // Também valida se tentarem mudar a idade depois
        this.idade = idade; 
    }

    public void EfetuarCompra() {
        System.out.println("Pessoa Efetuou a compra");
        System.out.println("Nome: " + nome + " | Cidade: " + cidade + " | Idade: " + idade);
    }
}
