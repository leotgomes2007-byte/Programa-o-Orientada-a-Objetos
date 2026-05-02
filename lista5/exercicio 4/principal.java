package projeto;

public class principal {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();

        // 2. Chame o método definirSaldoInicial passando o valor 1000
        novaConta.definirSaldoInicial(1000.0f);

        // 3. Escreva o valor do atributo saldo
        System.out.println("Saldo inicial: " + novaConta.saldo);

        // 4. Realize um saque de 500 reais
        novaConta.sacar(500.0f);

        // 5. Faça um depósito de 50 reais
        novaConta.depositar(50.0f);

        // 6. Escreva o valor do atributo saldo na tela
        System.out.println("Saldo após saque (500) e depósito (50): " + novaConta.saldo);

        // 7. Realize um saque de 600 reais
        boolean sucesso = novaConta.sacar(600.0f);
        
        if (!sucesso) {
            System.out.println("Aviso: Tentativa de saque de 600.00 falhou. Saldo insuficiente.");
        }

        // 8. Escreva o valor do atributo saldo na tela
        System.out.println("Saldo final: " + novaConta.saldo);

}
}
