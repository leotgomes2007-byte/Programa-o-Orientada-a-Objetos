package projeto;

import java.util.Scanner;

public class Carro {
    private String placa;
    private int numChassi;

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    // Getters e Setters (Mantidos como os seus)
    public String getPlaca() {
    	return placa;
    	}
    public int getNumChassi() { 
    	return numChassi; 
    	}
    public void setPlaca(String placa) { 
    	this.placa = placa;
    	}
    public void setNumChassi(int numChassi) { 
    	this.numChassi = numChassi;
    	}

    public void acelerar(int velocidadeAtual, int valorAceleracao) {
        int velocidadeFinal = velocidadeAtual + valorAceleracao;
        System.out.println("A velocidade inicial é " + velocidadeAtual + 
                           " e sofreu uma aceleração de " + valorAceleracao + 
                           " ficando " + velocidadeFinal);
    }

    public boolean frear() {
        Scanner teclado = new Scanner(System.in);
        String resposta;
        System.out.println("Deseja frear? (SIM ou NÃO)");
        resposta = teclado.nextLine().toUpperCase();

        if (resposta.equals("SIM")) {
            System.out.println("Carro freando...");
            return true;
        } else if (resposta.equals("NÃO") || resposta.equals("NAO")) {
            System.out.println("Carro não está freando.");
            return false;
        } else {
            System.out.println("Valor inválido.");
            return false;
        }

    }
}
