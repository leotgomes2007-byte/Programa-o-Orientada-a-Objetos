package project;

public class exercicio7 {
    public static void main(String[] args) {
    
    	PessoaFisica pf = new PessoaFisica("leo","santa maria","78952635418");
    	pf.EfetuarCompra();
    	
    	PessoaJuridica pj = new PessoaJuridica("mercado","santa maria","895329000126");
    	pj.EfetuarCompra();
    }
}
