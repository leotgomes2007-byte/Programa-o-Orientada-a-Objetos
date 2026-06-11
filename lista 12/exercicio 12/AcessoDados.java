interface AcessoDados {
    void conectar(boolean status);
    void desconectar(boolean status);
    void inserir(String dados);
    void atualizar(int id, String novosDados);
    void excluir(int id);
}
