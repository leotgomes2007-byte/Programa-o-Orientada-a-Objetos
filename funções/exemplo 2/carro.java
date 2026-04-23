package projeto;

public class carro {
	public String marca;
	public String modelo;
	
	public void alugar() {
		System.out.println("O carro "+marca+"-"+modelo+"foi alugado");
	}
	
	public void devolver() {
		System.out.println("O carro "+marca+"-"+modelo+"foi devolvido");
	}
	
	public void exibirDados() {
		System.out.println("O carro "+marca);
		System.out.println("O carro "+modelo);

	}
}
