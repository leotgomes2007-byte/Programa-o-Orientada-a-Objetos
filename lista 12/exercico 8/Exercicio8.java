package project;

public class Exercicio8 {
    public static void main(String[] args) {
    	Gerente g = new Gerente("leo",10000);
    	g.CalcularSalario();
    	
    	Vendedor v = new Vendedor("kaua",5000);
    	v.CalcularSalario(1000);
    }
}
