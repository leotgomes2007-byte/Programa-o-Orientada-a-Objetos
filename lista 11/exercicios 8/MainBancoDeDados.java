public class MainBancoDeDados {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO ACESSO A DADOS ---");

        // Polimorfismo usando a Interface como tipo da variável
        AcessoDados dados = new BancoDeDados();

        dados.conectar();
        dados.inserir();
        dados.atualizar();
        dados.excluir();
        dados.desconectar();
    }
}
