package project;

public class Reserva {
    
    // Método padrão para adicionar/reservar algo genérico ou duplo
    public void adicionar(boolean respostaV, boolean respostaH) {
        System.out.println("\n--- [Log] Classe Reserva (Mãe) ---");
        // CORREÇÃO: Usar == para comparar valores
        if (respostaV == true) {
            System.out.println("Reserva de voo efetuada no sistema geral.");
        } else {
            System.out.println("Reserva de voo não realizada.");
        }
        
        if (respostaH == true) {
            System.out.println("Reserva de hotel efetuada no sistema geral.");
        } else {
            System.out.println("Reserva de hotel não realizada.");
        }
    }
    
    // Método padrão para cancelar
    public void cancelar(boolean respostaV, boolean respostaH) {
        System.out.println("\n--- [Log] Classe Reserva (Mãe) ---");
        if (respostaV == true) {
            System.out.println("Voo cancelado no sistema geral.");
        } else {
            System.out.println("Voo não cancelado.");
        }
        
        if (respostaH == true) {
            System.out.println("Hotel cancelado no sistema geral.");
        } else {
            System.out.println("Hotel não cancelado.");
        }
    }

    // Método de apoio para permitir o polimorfismo na Main
    public void cancelar(boolean resposta) {
        System.out.println("Cancelando reserva genérica...");
    }
}
