package projeto;

public class Pessoa {
	

	// Primeira versão do método: apenas uma mensagem
    public void falar(String mensagem) {
        System.out.println(mensagem);
    }

    // Método sobrecarregado: mensagem + número de repetições
    public void falar(String mensagem, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(mensagem);
        }
    }
}
	    

