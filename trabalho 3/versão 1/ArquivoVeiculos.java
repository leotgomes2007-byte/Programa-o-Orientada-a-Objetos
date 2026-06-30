import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ArquivoVeiculos {

    private String nomeArquivo;
    private List<Veiculo> listaVeiculos;

    public ArquivoVeiculos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.listaVeiculos = new ArrayList<>();
    }

    public void gravaArquivo(List<Veiculo> lista) {

        JSONArray jsonArray = new JSONArray();

        for (Veiculo v : lista) {
            JSONObject jsonVeiculo = new JSONObject();
            jsonVeiculo.put("placa",         v.getPlaca());
            jsonVeiculo.put("modelo",        v.getModelo());
            jsonVeiculo.put("marca",         v.getMarca());
            jsonVeiculo.put("anoFabricacao", v.getAnoFabricacao());
            jsonVeiculo.put("quilometragem", v.getQuilometragem());
            jsonArray.add(jsonVeiculo);
        }

        String jsonString = jsonArray.toJSONString();

        try {
            FileWriter arqw = new FileWriter(nomeArquivo + ".json");
            BufferedWriter escritor = new BufferedWriter(arqw);
            escritor.write(jsonString);
            escritor.close();
            arqw.close();
            System.out.println("Dados salvos em " + nomeArquivo + ".json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Veiculo> leArquivo() {
        listaVeiculos = new ArrayList<>();

        try {
            FileReader arqr = new FileReader(nomeArquivo + ".json");
            JSONParser parser = new JSONParser();

            JSONArray jsonArray = (JSONArray) parser.parse(arqr);

            for (Object obj : jsonArray) {
                JSONObject jsonVeiculo = (JSONObject) obj;

                String placa         = (String) jsonVeiculo.get("placa");
                String modelo        = (String) jsonVeiculo.get("modelo");
                String marca         = (String) jsonVeiculo.get("marca");
                int anoFabricacao    = ((Long)  jsonVeiculo.get("anoFabricacao")).intValue();
                double quilometragem = (double) jsonVeiculo.get("quilometragem");

                Veiculo v = new Veiculo(placa, modelo, marca, anoFabricacao, quilometragem);
                listaVeiculos.add(v);
            }

            arqr.close();

        } catch (IOException e) {
            System.out.println("Nenhum dado encontrado. Iniciando com lista vazia.");
        } catch (ParseException e) {
            System.out.println("Erro ao interpretar o arquivo JSON.");
            e.printStackTrace();
        }

        return listaVeiculos;
    }
}
