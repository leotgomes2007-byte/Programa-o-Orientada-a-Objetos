class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldoInicial, double limiteInicial) {
        super(saldoInicial, limiteInicial);
    }

    @Override
    public void depositar(double valor) {
        // Exemplo: bônus de 1% rendido no momento do depósito
        double bonus = valor * 0.01;
        this.saldo += (valor + bonus);
        System.out.println("[Conta Investimento] Depósito de R$" + valor + " (+ R$" + bonus + " de rendimento). Saldo atual: R$" + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("[Conta Investimento] Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("[Conta Investimento] Erro: Saldo insuficiente para sacar R$" + valor);
        }
    }
}
