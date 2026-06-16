package SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities;

public class Reserva {

    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public Reserva(Hospede hospede, Quarto quarto, int diarias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public final double calcularValorTotal() {
        double total = quarto.getValorDiaria() * diarias;

        if (diarias > 5) {
            total *= 0.90; // desconto de 10%
        }

        return total;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDiarias() {
        return diarias;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "\nHospede = " + hospede.getNome() +
                "\nQuarto = " + quarto.getNumero() +
                "\nDiarias = " + diarias +
                "\nValor Total = R$ " + calcularValorTotal() +
                "\n}";
    }
}
