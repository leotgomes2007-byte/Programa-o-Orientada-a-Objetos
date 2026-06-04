class BancoDeDados implements AcessoDados {
    
    @Override
    public void conectar() {
        System.out.println("Conexão estabelecida com o Banco de Dados com sucesso.");
    }

    @Override
    public void desconectar() {
        System.out.println("Conexão com o Banco de Dados encerrada com segurança.");
    }

    @Override
    public void inserir() {
        System.out.println("Dados inseridos no banco (INSERT realizado).");
    }

    @Override
    public void atualizar() {
        System.out.println("Dados atualizados no banco (UPDATE realizado).");
    }

    @Override
    public void excluir() {
        System.out.println("Dados removidos do banco (DELETE realizado).");
    }
}
