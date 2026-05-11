package Java_1_Lista_Orientacao_a_Objetos.atv4.entities;

public class produto {
    public String nome;
    public double preco;
    public int quantidadeDeProduto;

    public produto (String nome,double preco,int quantidadeDeProduto) {
        this.nome=nome;
        this.preco=preco;
        this.quantidadeDeProduto=quantidadeDeProduto;
    }

    public void exibirResumo() {
        double valorTotal=preco*quantidadeDeProduto;
        System.out.println("produto nome=" + nome + " preco=" + preco + " quantidadeDeProduto=" + quantidadeDeProduto + " valorTotal"+valorTotal);
    }
}
