class ContaInvestimento extends Conta {

    public ContaInvestimento(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    // Método específico: acresce 5% ao saldo
    public void atualizaRendimentos() {
        double rendimento = getSaldo() * 0.05;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimentos de 5% aplicados! Novo saldo de " + getTitular() + ": R$ " + getSaldo());
    }
}
