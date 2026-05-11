package Java_1_Lista_Orientacao_a_Objetos.atv5.entities;

public class contaBancaria {
    public String titular;
    public double saldo;

    public contaBancaria(String titular, int saldo) {
        this.saldo = saldo;
        this.titular=titular;
    }

    public void depositar (double valor) {
        if (valor>0){
        saldo += valor;
        System.out.println("dinheiro depositado"+saldo);
        }else {
            System.out.println("Saldo insuficiente:"+saldo);
        }
    }
    public void sacar(double valor){
        if (saldo>valor){
            saldo -= valor;
            System.out.println("dinheiro sacado"+saldo);
        }else {
            System.out.println("saldo insuficiente"+saldo);
        }
    }public void exibirSaldo(){
        System.out.println("Titular: " +titular+ " Saldo atual: "+saldo);
    }
}

