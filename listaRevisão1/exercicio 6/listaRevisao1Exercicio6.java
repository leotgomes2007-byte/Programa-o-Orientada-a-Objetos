package projeto;

import java.util.Scanner;

public class listaRevisao1Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String modelo;
		int velocidadeAtual,velocidadeMaxima;
		
		System.out.println("Informe o modelo do veiculo");
		modelo = teclado.nextLine();
		System.out.println("Informe a velocidade atual do veiculo"); 
		velocidadeAtual = teclado.nextInt();
		System.out.println("Informe a velocidade maxina do veiculo");
		velocidadeMaxima = teclado.nextInt();
		
		Carro c = new Carro(modelo,velocidadeAtual,velocidadeMaxima);
		
		int acelerar,frear;
		
		System.out.println("Informe o quanto deseja acelerar o carro:");
		acelerar = teclado.nextInt();
		c.acelerar(acelerar);
		
		System.out.println("Informe o quanto deseja frear o carro:");
		frear = teclado.nextInt();
		c.frear(frear);
		
		if(	c.atingiuVelocidadeMaxima() == true) {
			System.out.println("Você atingiu a velocidade maxima");
		}else {
			System.out.println("Você não atingiu a velocidade maxima");
		}
		
		double distancia;
		System.out.println("Informe a distancia da viagem em Km:");
		distancia = teclado.nextInt();
		System.out.println("A sua viagem vai demorar "+c.calcularTempoViagem(distancia)+" horas");
		
	}
}
