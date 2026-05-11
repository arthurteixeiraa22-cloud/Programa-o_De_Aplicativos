package Java_1_Lista_Orientacao_a_Objetos.atv5.aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv5.entities.contaBancaria;

public class conta {
    static void main() {
        contaBancaria conta1=new contaBancaria("pedro",4000);
        contaBancaria conta2=new contaBancaria("jao",3000);
        conta1.depositar(50);
        conta1.sacar(100);
        conta1.exibirSaldo();
        conta2.depositar(1000);
        conta2.sacar(500);
        conta2.exibirSaldo();
    }
}
