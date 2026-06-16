package SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities;

import SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities.enums.tipoQuarto;

public final class Quarto {

    private int numero;
    private tipoQuarto tipo;
    private double valorDiaria;
    private boolean disponivel;

    public Quarto(int numero, tipoQuarto tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public tipoQuarto getTipo() {
        return tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        disponivel = false;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "\nNúmero = " + numero +
                "\nTipo = " + tipo +
                "\nValor da Diária = R$ " + valorDiaria +
                "\nDisponível = " + disponivel +
                "\n}";
    }
}

