package br.com.fiap;

public class ProductTester {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNumeroItem(1);
        p1.setNome("Mouse Gamer Logitech G203");
        p1.setQuantidadeEstoque(40);
        p1.setPreco(129.90);

        Produto p2 = new Produto();
        p2.setNumeroItem(2);
        p2.setNome("Teclado Mecânico Redragon Kumara");
        p2.setQuantidadeEstoque(25);
        p2.setPreco(249.90);

        Produto p3 = new Produto(3, "Fone Bluetooth JBL Tune 510BT", 60, 199.90);
        Produto p4 = new Produto(4, "Notebook Dell Inspiron 15", 10, 3599.00);
        Produto p5 = new Produto(5, "Celular Samsung Galaxy A15", 30, 1099.00);
        Produto p6 = new Produto(6, "Monitor LG 24 Polegadas", 15, 749.90);

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