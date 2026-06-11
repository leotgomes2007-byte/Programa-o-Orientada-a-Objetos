public class main {
    public static void main(String[] args) {
        try {
            Data d1 = new Data(11, 6, 2026);
            d1.exibirData();

            System.out.println("---------------------------------------------------");

            Data d2 = new Data(31, 2, 2026);
            d2.exibirData();
        } catch (IllegalArgumentException e) {
            System.err.println("ERRO detectado: " + e.getMessage());
        }
    }
}
