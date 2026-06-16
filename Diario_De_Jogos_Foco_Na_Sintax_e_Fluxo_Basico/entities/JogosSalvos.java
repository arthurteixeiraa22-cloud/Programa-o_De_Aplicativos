package Diario_De_Jogos_Foco_Na_Sintax_e_Fluxo_Basico.entities;

public class JogosSalvos {
    private String jogos;

    public JogosSalvos(String jogos) {
        this.jogos = jogos;
    }

    public String jogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    @Override
    public String toString() {
        return jogos;
    }
}