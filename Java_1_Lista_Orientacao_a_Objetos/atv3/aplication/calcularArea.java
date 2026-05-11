package Java_1_Lista_Orientacao_a_Objetos.atv3.aplication;

import Java_1_Lista_Orientacao_a_Objetos.atv3.entities.retangulo;

import java.util.Scanner;

public class calcularArea {
    static void main() {
        Scanner sc = new Scanner(System.in);
        retangulo retangulo = new retangulo();
        System.out.println("insira a base do retangulo: ");
        retangulo.base = sc.nextDouble();
        System.out.println("insira a altura do retangulo");
        retangulo.altura = sc.nextDouble();

        System.out.println("area:" + retangulo.area());
    }
}
