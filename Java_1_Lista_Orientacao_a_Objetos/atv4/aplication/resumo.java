package Java_1_Lista_Orientacao_a_Objetos.atv4.aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv4.entities.produto;

public class resumo {
    static void main(String[] args) {
        produto p1 = new produto("mouseGamer", 90, 15);
        produto p2 = new produto("teclado mecanico", 250, 13);
        p1.exibirResumo();
        p2.exibirResumo();

    }
}
