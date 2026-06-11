public class Main {
    public static void main(String[] args) {
        // Criando uma Conta Investimento com saldo inicial de R$ 1000
        ContaInvestimento contaInv = new ContaInvestimento("Alice", 1000.00);
        System.out.println("Saldo inicial da Alice: R$ " + contaInv.getSaldo());
        contaInv.atualizaRendimentos(); // Deve somar R$ 50 (5%)
        
        System.out.println("----------------------------------------");

        // Criando uma Conta Poupança com saldo inicial de R$ 2000
        ContaPoupanca contaPoup = new ContaPoupanca("Bruno", 2000.00);
        System.out.println("Saldo inicial do Bruno: R$ " + contaPoup.getSaldo());
        contaPoup.atualizaJuros(); // Deve somar R$ 60 (3%)
    }
}
