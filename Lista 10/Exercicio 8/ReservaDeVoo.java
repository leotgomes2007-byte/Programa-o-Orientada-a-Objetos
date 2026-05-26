package project;

public class ReservaDeVoo extends Reserva {
    
    // SOBRECARGA: Este método recebe a String 'tipo' (Econômica/Executiva)
    public void adicionar(boolean resposta, String tipo) {
        System.out.println("\n--- Classe Reserva de Voo (Específica) ---");
        if (resposta == true) {
            System.out.println("Sucesso: Passagem de Voo reservada na classe: " + tipo);
        } else {
            System.out.println("Reserva de voo não realizada.");
        }    
    }
    
    // SOBRESCRITA: Regra de cancelamento específica do Voo
    @Override
    public void cancelar(boolean resposta) {
        System.out.println("\n--- Classe Reserva de Voo (Específica) ---");
        if (resposta == true) {
            System.out.println("Voo Cancelado. Política: Multa de 10% aplicada sobre o reembolso.");
        } else {
            System.out.println("Nenhum voo para cancelar.");
        }
    }
}
