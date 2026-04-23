package projeto;

public class principal {

	public static void main(String[] args) {	
		
		Carro c = new Carro();
		
		c.atribuirValores("VW", "Gol");
		System.out.println("Dados do carro:"+c.retornaMarca()+"-"+c.retornaModelo());
		
	}

}
