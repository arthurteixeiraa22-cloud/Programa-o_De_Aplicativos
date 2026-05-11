package Java_1_Lista_Orientacao_a_Objetos.atv1.entities;

public class lampada {
    public boolean ligada;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean estaligada() {
        return ligada;
    }
}

