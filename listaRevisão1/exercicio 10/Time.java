package projeto;

public class Time {
	public String nome;
	public int golssofridos; 
	public int golsmarcados;


	 public Time(String no,int gs,int gm) {
		 nome = no;
		 golssofridos = gs;
		 golsmarcados = gm;
	 }


	public int  marcarGol(int gols){
		return golsmarcados+= gols;
	}

	public int  sofridosGol(int gols){
		return golssofridos+= gols;
	}
	
	public int saldoGols() {
		return golsmarcados - golssofridos;
	}
	public void resultadoPartida() {
		if(golsmarcados == golssofridos) {	
			System.out.println("Resultado: EMPATE");
		}else if(golsmarcados > golssofridos ) {
			System.out.println("Resultado: VITORIA");
		}else {
			System.out.println("Resultado: DERROTA");
		}

	}
}
