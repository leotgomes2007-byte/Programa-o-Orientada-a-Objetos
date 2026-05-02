package projeto;

import java.util.Scanner;

public class listaRevisao1Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        String produto;
        float preco;
        float quantidade;
        float desconto;
        
        System.out.println("--Informe os dados do pedido:--");
        
        System.out.println("Número do pedido: ");
        numero = teclado.nextInt();
        
       
        teclado.nextLine(); 
        
        System.out.println("Nome do produto: ");
        produto = teclado.nextLine(); 
        
        System.out.println("Preço: ");
        preco = teclado.nextFloat();
        
        System.out.println("Quantidade: ");
        quantidade = teclado.nextFloat();
        
        System.out.println("Desconto (em porcentagem, ex: 10): ");
        desconto = teclado.nextFloat();
        
        // Instanciando a classe Pedido
        Pedido p = new Pedido(numero, produto, preco, quantidade);
        
        p.calcularSubtotal();
        p.calcularDesconto(desconto);
        p.calcularTotal();
        p.resumoPedido();
        
        teclado.close();
    }
}
