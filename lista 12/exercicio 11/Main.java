public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Memorias Postumas de Bras Cubas", 50f, "Livro de Machado de Assis");

        System.out.println("Dados Livro:");
        System.out.println("Nome: " + l.getNome());
        System.out.println("Preco: " + l.getPreco());
        System.out.println("Descricao: " + l.getDescricao());

        CD c = new CD("Musicas dos Baroes da Pisadinha", 20f, "Coletanea de musicas dos Baroes da Pisadinha");

        System.out.println("\nDados CD:");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Preco: " + c.getPreco());
        System.out.println("Descricao: " + c.getDescricao());
    }
}
