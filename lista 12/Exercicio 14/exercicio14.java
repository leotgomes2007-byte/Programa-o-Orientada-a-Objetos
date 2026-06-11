package project;

public class exercicio14 {
    public static void main(String[] args) {
        
        try {
            // Teste 1: Criando uma pessoa com idade válida (vai funcionar)
            PessoaFisica pf = new PessoaFisica("Leo", "Santa Maria", 20, "78952635418");
            pf.EfetuarCompra();
            
            System.out.println("--------------------------------------------------");

            // Teste 2: Criando uma pessoa com idade inválida (vai disparar o erro)
            // Troque para testar: menos que 0 (ex: -5) ou mais que 120 (ex: 135)
            PessoaJuridica pj = new PessoaJuridica("Mercado", "Santa Maria", 135, "895329000126");
            pj.EfetuarCompra();
            
        } catch (IllegalArgumentException e) {
            // O Java pula direto para cá se a idade for inválida
            System.err.println("Erro de validação: " + e.getMessage());
        }
    }
}
