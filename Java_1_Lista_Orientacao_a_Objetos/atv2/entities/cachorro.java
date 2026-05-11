package Java_1_Lista_Orientacao_a_Objetos.atv2.entities;

public class cachorro {
    String nome;
    String raca;
    int idade;

    public cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("O " + nome + " de raça: " + raca + " esta latindo AU AU" + " e tem " + idade + " anos/s");
    }
}
