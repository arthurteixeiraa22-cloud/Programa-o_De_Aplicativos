package SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities;

import SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities.enums.formaPagamento;

public final class Pagamento {

    private formaPagamento formaPagamento;
    private boolean aprovado;

    public Pagamento(formaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
        this.aprovado = false;
    }

    public boolean validarPagamento() {
        aprovado = true;
        return aprovado;
    }

    public formaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "\nForma de Pagamento = " + formaPagamento +
                "\nStatus = " + (aprovado ? "Aprovado" : "Recusado") +
                "\n}";
    }
}

