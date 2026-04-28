package project;

public class principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.exibeMsg();
		
		Onibus o = new Onibus();
		o.nome = "Marcopolo";
		o.setModelo("OM-1519");
		o.exibeMsg();
	}

}
