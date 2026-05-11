package Java_1_Lista_Orientacao_a_Objetos.atv2.aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv2.entities.cachorro;

public class Registro_de_Pets {
    static void main() {
        cachorro dog1 = new cachorro("Rex", "pitbul", 1);
        cachorro dog2 = new cachorro("Osvaldo", "viralata", 5);
        dog1.latir();
        dog2.latir();
    }
}
