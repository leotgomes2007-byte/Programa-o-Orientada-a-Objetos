package projeto;

public class Pedido {
    private int numero;
    private String produto;
    private float preco;
    private float quantidade;
    private float subtotal;
    private float valorDesconto;
    private float total;

    public Pedido(int numero, String produto, float preco, float quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void calcularSubtotal() {
        this.subtotal = preco * quantidade;
    }

    public void calcularDesconto(float porcentagem) {
        this.valorDesconto = this.subtotal * (porcentagem / 100);
    }

    public void calcularTotal() {
        this.total = this.subtotal - this.valorDesconto;
    }

    public void resumoPedido() {
        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.println("Pedido nº: " + numero);
        System.out.println("Produto: " + produto);
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Total a Pagar: R$ " + total);
    }
}
