import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Socket servidor criado com sucesso");

            ArquivoVeiculos arquivo = new ArquivoVeiculos("veiculos");
            List<Veiculo> listaVeiculos = arquivo.leArquivo();

            while (true) {

                Socket cliente = servidor.accept();

                ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());

                Veiculo v = (Veiculo) in.readObject();

                System.out.println("Recebi veículo: " + v);

                boolean placaExistente = false;
                for (Veiculo cadastrado : listaVeiculos) {
                    if (cadastrado.getPlaca().equalsIgnoreCase(v.getPlaca())) {
                        placaExistente = true;
                        break;
                    }
                }

                Resposta res;
                if (placaExistente) {
                    res = new Resposta(false, "Placa já cadastrada!");
                } else {
                    listaVeiculos.add(v);
                    arquivo.gravaArquivo(listaVeiculos);
                    res = new Resposta(true, "Veículo cadastrado com sucesso!");
                }

                out.writeObject(res);

                cliente.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
