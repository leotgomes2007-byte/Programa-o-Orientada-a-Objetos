package project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista10Exercicio13 {

	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new Conta("7859346","Leo",100000.00));
		lista.add(new Conta("2544366","Luiza",5000.00));
		lista.add(new Conta("8745678","Lucas",6000.00));
		lista.add(new Conta("0128947","Kaua",100.00));

		lista.sort(Comparator.comparingDouble(Conta->Conta.saldo));
		
		for(Conta conta : lista) {
			conta.exibir();
		}
		
		Conta maior = lista.get(0);
		for(Conta conta : lista) {
			if(conta.saldo > maior.saldo) {
				maior = conta;
			}
		}
	maior.exibir();	
	}

}
