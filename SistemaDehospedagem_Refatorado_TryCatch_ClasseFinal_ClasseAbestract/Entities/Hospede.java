package SistemaDehospedagem_Refatorado_TryCatch_ClasseFinal_ClasseAbestract.Entities;

public final class Hospede {

    private String nome;

    public Hospede(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                '}';
    }
}