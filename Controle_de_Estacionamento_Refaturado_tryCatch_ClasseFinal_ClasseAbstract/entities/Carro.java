package Controle_de_Estacionamento_Refaturado_tryCatch_ClasseFinal_ClasseAbstract.entities;

public class Carro extends Veiculo {

    public Carro(String placa, int horaEntrada) {
        super(placa, horaEntrada, TipoVeiculo.CARRO);
    }

    @Override
    public double calcularValor(int horas) {
        return TarifaEstacionamento.calcularTarifa(horas);
    }
}