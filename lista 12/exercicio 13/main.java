public class main {
    public static void main(String[] args) {
        AcessoDados ad = new BancoDeDados();
        ad.conectar(true);
        ad.inserir("DADO TESTE INSERIDO");
        ad.atualizar(12, "ATUALIZAÇÃO DO DADO TESTE");
        ad.excluir(12);
        ad.desconectar(true);
    }
}
