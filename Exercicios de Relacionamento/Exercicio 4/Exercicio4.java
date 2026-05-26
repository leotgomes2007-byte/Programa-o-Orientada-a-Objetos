package project;

public class Exercicio4 {
    public static void main(String[] args) {
        // O sufixo 'f' avisa ao Java que o número é um float
        Conta minhaConta = new Conta("leo", 1000.50f); 
        
        // Chamando o método estático e passando o valor também como float
        Conta.deposito(minhaConta, 300.25f);
        
        System.out.println("SALDO: " + minhaConta.getSaldo()); 
        // Vai imprimir: SALDO: 1300.75
    }
}
