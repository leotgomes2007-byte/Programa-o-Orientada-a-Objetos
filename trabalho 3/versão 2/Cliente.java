import java.net.Socket;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {

            System.out.println("\n========== SISTEMA DE CADASTRO DE VEÍCULOS ==========");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("\n--- Dados do Veículo ---");
                System.out.print("Placa: ");
                String placa = scanner.nextLine().toUpperCase();

                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();

                System.out.print("Marca: ");
                String marca = scanner.nextLine();

                System.out.print("Ano de fabricação: ");
                int ano = scanner.nextInt();

                System.out.print("Quilometragem: ");
                double km = scanner.nextDouble();
                scanner.nextLine();

                Veiculo v = new Veiculo(placa, modelo, marca, ano, km);

                try {

                    Socket s = new Socket("localhost", 1234);
                    System.out.println("Conexão estabelecida com sucesso");

                    ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(s.getInputStream());

                    out.writeObject(v);

                    Resposta res = (Resposta) in.readObject();

                    System.out.println(res.getMensagem());

                    s.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (opcao == 2) {
                System.out.println("Saindo do sistema. Até logo!");
                scanner.close();
                System.exit(0);

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
