package project;

public class ReservaDeHotel extends Reserva {
    
    public void adicionar(boolean resposta) {
        System.out.println("\n--- Classe Reserva Hotel (Específica) ---");
        if (resposta == true) {
            System.out.println("Sucesso: Quarto de Hotel reservado!");
        } else {
            System.out.println("Reserva de hotel não realizada.");
        }
    }
    
    // SOBRESCRITA: Regra de cancelamento específica do Hotel
    @Override
    public void cancelar(boolean resposta) {
        System.out.println("\n--- Classe Reserva Hotel (Específica) ---");
        if (resposta == true) {
            System.out.println("Hotel Cancelado. Política: Sem taxas se cancelado em até 24h.");
        } else {
            System.out.println("Nenhum hotel para cancelar.");
        }
    }
}
