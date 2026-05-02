package projeto;

public class Carro {
	public String modelo;
	public int velocidadeAtual;
	public int velocidadeMaxima;
	
	public Carro(String mo, int veA, int veM) {
		modelo = mo;
		velocidadeAtual = veA;
		velocidadeMaxima = veM;
	}
	
	public void acelerar(int valor) {
		velocidadeAtual+=valor;
		
		if(velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
			System.out.println("A velocidade ultrapassou a velociade maxima,logo o valor excedente foi descartado");
		}
	}
	
	public void frear(int valor) {
		velocidadeAtual-=valor;
		
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0;
			System.out.println("A velocidade ultrapassou a velociade Minima(ficando negativo),logo o valor excedente foi descartado");
		}
	}
	
	public boolean atingiuVelocidadeMaxima() {
		if(velocidadeAtual == velocidadeMaxima) {
			return true;
		}else {
			return false;
		}
	}
	
	public double calcularTempoViagem(double distancia){
		return distancia/velocidadeAtual;
	}
}
