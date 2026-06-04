public class MainContas {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO CONTA CORRENTE ---");
        // Criando conta com R$ 100 de saldo e R$ 200 de limite
        Conta cc = new ContaCorrente(100.0, 200.0);
        cc.depositar(50.0);
        cc.sacar(250.0); // Usa o saldo e parte do limite
        cc.sacar(100.0); // Tenta sacar mais do que o limite permite

        System.out.println("\n--- TESTANDO CONTA INVESTIMENTO ---");
        // Criando conta investimento com R$ 1000 de saldo e sem limite
        Conta ci = new ContaInvestimento(1000.0, 0.0);
        ci.depositar(500.0); // Recebe bônus de 1% automaticamente
        ci.sacar(200.0);
        ci.sacar(2000.0); // Tenta sacar mais do que tem em saldo
    }
}
