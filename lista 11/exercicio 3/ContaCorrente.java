class ContaCorrente extends Conta {
    
    public ContaCorrente(double saldoInicial, double limiteInicial) {
        super(saldoInicial, limiteInicial);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("[Conta Corrente] Depósito de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("[Conta Corrente] Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("[Conta Corrente] Erro: Saldo e limite insuficientes para sacar R$" + valor);
        }
    }
}
