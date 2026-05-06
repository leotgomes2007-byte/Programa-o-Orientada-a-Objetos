package projeto;

public class Triangulo {
	private int  ladoA;
	private int  ladoB;
	private int  ladoC;
	
	public Triangulo(int  ladoA,int  ladoB,int  ladoC){
		this. ladoA =  ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	

	public int  getLadoA() {
		return ladoA;
	}	
	public int  getLadoB() {
		return ladoB;
	}

	public int  getLadoC() {
		return ladoC;
	}
	
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}	
	
	public void verificaEquilatero() {
		if(ladoA == ladoB || ladoB ==ladoC) {
			System.out.println("o triangulo é equilatero");
		}else {
			System.out.println("o triangulo não é equilatero");
		}
	}
}
