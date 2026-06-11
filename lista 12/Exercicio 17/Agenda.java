class Agenda {
    private String nome;
    private String telefone;

    public Agenda(String nome, String telefone) {
        adicionarContato(nome, telefone);
        this.nome = nome;
        this.telefone = telefone;
    }

    public void adicionarContato(String nome, String telefone) {
        if (nome == null || telefone == null || nome.trim().isEmpty() || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo nome ou telefone está vazio.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " Telefone: " + telefone);
    }
}
