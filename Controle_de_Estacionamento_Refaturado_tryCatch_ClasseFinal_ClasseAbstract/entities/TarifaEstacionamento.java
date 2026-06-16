package Controle_de_Estacionamento_Refaturado_tryCatch_ClasseFinal_ClasseAbstract.entities;

public final class TarifaEstacionamento {
    private TarifaEstacionamento() {
    }

    public static double calcularTarifa(int horas) {
        if (horas <= 1) {
            return 10.0;
        }
        return (10.0 + (horas - 1) * 5);
    }
}
