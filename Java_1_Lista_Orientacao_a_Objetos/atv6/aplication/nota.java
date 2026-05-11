package Java_1_Lista_Orientacao_a_Objetos.atv6.aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv6.entities.aluno;

public class nota {
    static void main() {
        aluno alu1=new aluno("pedro",51232,10,10,2);
        aluno alu2=new aluno("joao",23452,2,4,5);
        alu1.vericarSituacao();
        alu2.vericarSituacao();
    }
}
