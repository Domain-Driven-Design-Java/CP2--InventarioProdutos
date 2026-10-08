package br.com.fiap;

public class ProductTester {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNumeroItem(1);
        p1.setNome("iPhone 16");
        p1.setQuantidadeEstoque(40);
        p1.setPreco(4799.00);

        Produto p2 = new Produto();
        p2.setNumeroItem(2);
        p2.setNome("MacBook Air 15\" M5");
        p2.setQuantidadeEstoque(15);
        p2.setPreco(10925.00);

        Produto p3 = new Produto(3, "iPad Air 11\" M3", 25, 4999.90);
        Produto p4 = new Produto(4, "Apple Watch Series 10", 30, 4399.90);
        Produto p5 = new Produto(5, "AirPods Pro 3", 60, 1997.90);
        Produto p6 = new Produto(6, "Apple Pencil Pro", 50, 1449.90);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        System.out.println();
        System.out.println(p4);
        System.out.println();
        System.out.println(p5);
        System.out.println();
        System.out.println(p6);
    }
}