public class main {
    public static void main(String[] args) {
        try {
            Agenda g1 = new Agenda("Leo", "(55) 99876-9009");
            g1.exibirDados();

            System.out.println("----------------------------------------");

            Agenda g2 = new Agenda(null, null);
            g2.exibirDados();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de Agenda: " + e.getMessage());
        }
    }
}
