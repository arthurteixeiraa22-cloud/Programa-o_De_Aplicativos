package Controle_inteligente_proMax.entities;

public class produto {
    private String name;
    private double preco;
    private int quantidadeDeEstoque;

    public produto(String name, double preco, int quantidadeDeEstoque) {
        this.name = name;
        this.preco = preco;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }
    public double valorTotalEstoque(int quantidade){
        return preco*quantidade;
    }
    public void adicionarProduto(int quantidade){
        quantidadeDeEstoque+=quantidade;
    }
    public void retirarProduto(int quantidade){
        quantidadeDeEstoque-=quantidade;
    }
    public String toString() {
        return "produto{" +
                "name'=" + name + '\'' +
                ", preco=" + preco +
                ", quantidadeDeEstoque=" + quantidadeDeEstoque +
                '}';
    }
}
