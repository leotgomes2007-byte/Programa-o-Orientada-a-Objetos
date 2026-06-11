class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    // Método específico: acresce 3% ao saldo
    public void atualizaJuros() {
        double juros = getSaldo() * 0.03;
        setSaldo(getSaldo() + juros);
        System.out.println("Juros de 3% aplicados! Novo saldo de " + getTitular() + ": R$ " + getSaldo());
    }
}
