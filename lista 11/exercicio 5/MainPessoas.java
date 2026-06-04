public class MainPessoas {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO CLIENTES ---");

        Pessoa pf = new PessoaFisica("Guilherme", "São Paulo", "123.456.789-00");
        Pessoa pj = new PessoaJuridica("Tech Solutions", "Curitiba", "12.345.678/0001-99");

        pf.efetuarCompra(150.50);
        pj.efetuarCompra(5000.00);
    }
}
