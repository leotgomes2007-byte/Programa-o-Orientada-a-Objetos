import java.time.LocalDate;
import java.time.DateTimeException;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void validarData(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(
                "Data inválida! A combinação de dia, mês e ano não existe no calendário."
            );
        }
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    public void exibirData() {
        System.out.printf("Data: %02d/%02d/%04d%n", dia, mes, ano);
    }
}
