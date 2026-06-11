class BancoDeDados implements AcessoDados {
    private boolean conectado = false;

    @Override
    public void conectar(boolean status) {
        conectado = status;
        if (conectado) {
            System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
        } else {
            System.out.println("Não foi possível se conectar ao banco de dados.");
        }
    }

    @Override
    public void desconectar(boolean status) {
        if (conectado && status) {
            conectado = false;
            System.out.println("Conexão com o banco de dados encerrada.");
        } else {
            System.out.println("Não foi possível encerrar a conexão com o banco de dados.");
        }
    }

    @Override
    public void inserir(String dados) {
        if (conectado) {
            System.out.println("Dados inseridos com sucesso: \"" + dados + "\"");
        } else {
            System.out.println("ERRO: usuário não conectado ao banco.");
        }
    }

    @Override
    public void atualizar(int id, String novosDados) {
        if (conectado) {
            System.out.println("Registro ID " + id + " atualizado para: \"" + novosDados + "\"");
        } else {
            System.out.println("ERRO: usuário não conectado ao banco.");
        }
    }

    @Override
    public void excluir(int id) {
        if (conectado) {
            System.out.println("Registro ID " + id + " excluído.");
        } else {
            System.out.println("ERRO: usuário não conectado ao banco.");
        }
    }
}
