package Controle_inteligente_proMax.aplication;

import Controle_inteligente_proMax.entities.produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<produto> produtos = new ArrayList<>();
        String resposta = "S";
        while (resposta.equalsIgnoreCase("s")) {

            System.out.println("Cadastro de Produtos");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade no estoque: ");
            int quantidadeEstoque = sc.nextInt();
            sc.nextLine();

            produto produto = new produto(nome, preco, quantidadeEstoque);

            System.out.print("Deseja alterar o estoque? (s/n): ");
            String alterar = sc.nextLine();

            if (alterar.equals("s")) {

                System.out.print("Adicionar ou remover? (a/r): ");
                String opcao = sc.nextLine();

                if (opcao.equals("a")) {

                    System.out.print("Quantidade para adicionar: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    produto.adicionarProduto(qtd);

                } else if (opcao.equals("r")) {

                    System.out.print("Quantidade para remover: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    produto.retirarProduto(qtd);
                }
            }
            produtos.add(produto);

            System.out.print("Deseja cadastrar outro produto? (s/n): ");
            resposta = sc.nextLine();
        }
        System.out.println("Lista de Produtos");
        for (produto p : produtos) {
            System.out.println(p);
        }
        sc.close();
    }
}

