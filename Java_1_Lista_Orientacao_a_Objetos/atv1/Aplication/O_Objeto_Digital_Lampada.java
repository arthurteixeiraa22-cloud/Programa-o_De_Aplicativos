package Java_1_Lista_Orientacao_a_Objetos.atv1.Aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv1.entities.lampada;

public class O_Objeto_Digital_Lampada {
    static void main(String[] args) {
        lampada lampada = new lampada();
        lampada.ligar();

        if (lampada.ligada) {
            System.out.println("lampada esta ligada");
        } else
            System.out.println("lampada esta desligada");
        lampada.desligar();
        if (lampada.estaligada()){
            System.out.println("lampada esta desligada");
        }else {
            System.out.println("lampada esta desligada");
        }
    }
}
