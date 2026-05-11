package Java_1_Lista_Orientacao_a_Objetos.atv6.entities;

public class aluno {
    public String nome;
    public int matricula;
    public double[] notas = new double[3];

    public aluno(String nome, int matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
    }

    public Double mediaDoAluno() {

        double soma = 0.0;
        for (double notas : notas) {
            soma += notas;
        }
       return soma / notas.length;
    }

    public void vericarSituacao() {
        if (this.mediaDoAluno() >= 7.0) {
            System.out.println("aluno:" + nome +" numero da matricula:"+matricula+" aprovado:"+ mediaDoAluno());
        } else {
            System.out.println("aluno:" + nome +" numero da matricula:"+matricula+" reprovado:"+mediaDoAluno());
        }
    }
}