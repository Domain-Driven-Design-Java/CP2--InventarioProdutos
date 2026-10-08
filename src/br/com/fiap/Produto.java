package br.com.fiap;

import java.util.Locale;

public class Produto {

    private int numeroItem;
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    public Produto() {
    }

    public Produto(int numeroItem, String nome, int quantidadeEstoque, double preco) {
        this.numeroItem = numeroItem;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Número do Item: " + numeroItem
                + "\nNome: " + nome
                + "\nQuantidade em Estoque: " + quantidadeEstoque
                + "\nPreço: R$" + String.format(Locale.US, "%.2f", preco);
    }
}