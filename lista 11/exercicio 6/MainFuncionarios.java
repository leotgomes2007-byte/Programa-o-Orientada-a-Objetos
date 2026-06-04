public class MainFuncionarios {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO FOLHA DE PAGAMENTO ---");

        Funcionario gerente = new Gerente("Alice", 8000.0, 2000.0);
        
        // Precisamos instanciar como Vendedor diretamente para acessar o setTotalVendas
        Vendedor vendedor = new Vendedor("Bruno", 2000.0, 0.10); // 10% de comissão
        vendedor.setTotalVendas(30000.0); // Vendeu R$ 30.000,00

        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Salário Total: R$" + gerente.calcularSalario());

        System.out.println("\nFuncionário: " + vendedor.getNome());
        System.out.println("Salário Total: R$" + vendedor.calcularSalario());
    }
}
