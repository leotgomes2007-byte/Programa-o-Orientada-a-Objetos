package project;

import java.util.Scanner;

public class lista10Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Deseja reservar um voo? (true/false)");
        boolean respostaV = teclado.nextBoolean();
        
        teclado.nextLine(); // Limpa o buffer do teclado
        
        System.out.println("Informe o tipo do voo (Economica ou Executiva):");
        String tipo = teclado.nextLine();
        
        System.out.println("Deseja reservar um Hotel? (true/false)");
        boolean respostaH = teclado.nextBoolean();
        
        // 1) Testando através da classe Base Geral
        Reserva r = new Reserva();
        r.adicionar(respostaV, respostaH);
        
        System.out.println("\nDeseja cancelar a reserva do voo? (true/false)");
        boolean cancelarV = teclado.nextBoolean();
        
        System.out.println("Deseja cancelar a reserva do Hotel? (true/false)");
        boolean cancelarH = teclado.nextBoolean();
        
        // Cancela no sistema geral usando as duas variáveis informadas para cancelamento
        r.cancelar(cancelarV, cancelarH);
        
        // 2) Demonstrando o comportamento polimórfico e específico das subclasses
        ReservaDeHotel h = new ReservaDeHotel();
        h.adicionar(respostaH);
        h.cancelar(cancelarH);
        
        ReservaDeVoo v = new ReservaDeVoo();
        v.adicionar(respostaV, tipo); // Método sobrecarregado que aceita a classe do voo
        v.cancelar(cancelarV);

        teclado.close();
    }
}
