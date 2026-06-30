import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArquivoVeiculos arquivo = new ArquivoVeiculos("veiculos");

        List<Veiculo> listaVeiculos = arquivo.leArquivo();

        int opcao;

        while (true) {

            System.out.println("\n========== SISTEMA DE CADASTRO DE VEÍCULOS ==========");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem do veículo");
            System.out.println("3 - Excluir veículo pelo número da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    // ── CADASTRAR VEÍCULO ──────────────────────────────────────
                    System.out.println("\n--- Cadastro de Veículo ---");
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine().toUpperCase();

                    boolean placaExistente = false;
                    for (Veiculo v : listaVeiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placa)) {
                            placaExistente = true;
                            break;
                        }
                    }

                    if (placaExistente) {
                        System.out.println("Já existe um veículo cadastrado com esta placa!");
                        break;
                    }

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ano de fabricação: ");
                    int ano = scanner.nextInt();

                    System.out.print("Quilometragem: ");
                    double km = scanner.nextDouble();
                    scanner.nextLine();

                    // Instancia o objeto, adiciona à lista e serializa no arquivo
                    Veiculo novoVeiculo = new Veiculo(placa, modelo, marca, ano, km);
                    listaVeiculos.add(novoVeiculo);
                    arquivo.gravaArquivo(listaVeiculos);

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    // ── ALTERAR QUILOMETRAGEM ──────────────────────────────────
                    System.out.println("\n--- Alterar Quilometragem ---");
                    System.out.print("Informe a placa do veículo: ");
                    String placaAlter = scanner.nextLine().toUpperCase();

                    boolean encontradoAlter = false;
                    for (Veiculo v : listaVeiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placaAlter)) {
                            System.out.println("Veículo encontrado: " + v);
                            System.out.print("Nova quilometragem: ");
                            double novaKm = scanner.nextDouble();
                            scanner.nextLine();

                            v.setQuilometragem(novaKm);

                            arquivo.gravaArquivo(listaVeiculos);

                            System.out.println("Quilometragem atualizada com sucesso!");
                            encontradoAlter = true;
                            break;
                        }
                    }

                    if (!encontradoAlter) {
                        System.out.println("Veículo com placa \"" + placaAlter + "\" não encontrado.");
                    }
                    break;

                case 3:
                    // ── EXCLUIR VEÍCULO ────────────────────────────────────────
                    System.out.println("\n--- Excluir Veículo ---");
                    System.out.print("Informe a placa do veículo a excluir: ");
                    String placaExcluir = scanner.nextLine().toUpperCase();

                    Veiculo veiculoRemover = null;
                    for (Veiculo v : listaVeiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placaExcluir)) {
                            veiculoRemover = v;
                            break;
                        }
                    }

                    if (veiculoRemover != null) {
                        listaVeiculos.remove(veiculoRemover);
                        arquivo.gravaArquivo(listaVeiculos);
                        System.out.println("Veículo com placa \"" + placaExcluir + "\" excluído com sucesso!");
                    } else {
                        System.out.println("Veículo com placa \"" + placaExcluir + "\" não encontrado.");
                    }
                    break;

                case 4:
                    // ── SAIR ───────────────────────────────────────────────────
                    System.out.println("Saindo do sistema. Até logo!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
