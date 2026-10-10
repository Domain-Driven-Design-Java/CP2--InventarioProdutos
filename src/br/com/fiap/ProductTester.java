package br.com.fiap;

import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;

        System.out.println("=== CADASTRO DO PRODUTO 1 ===");
        System.out.print("Nome: ");
        tempName = in.nextLine();
        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();
        System.out.print("Preço: ");
        tempPrice = Double.parseDouble(in.next().replace(",", "."));
        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);
        in.nextLine();

        System.out.println("=== CADASTRO DO PRODUTO 2 ===");
        System.out.print("Nome: ");
        tempName = in.nextLine();
        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();
        System.out.print("Preço: ");
        tempPrice = Double.parseDouble(in.next().replace(",", "."));
        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        Produto p3 = new Produto(3, "iPad Air 11\" M3", 25, 4999.90);
        Produto p4 = new Produto(4, "Apple Watch Series 10", 30, 4399.90);
        Produto p5 = new Produto(5, "AirPods Pro 3", 60, 1997.90);
        Produto p6 = new Produto(6, "Apple Pencil Pro", 50, 1449.90);

        System.out.println();
        System.out.println("--- Produtos do inventário ---");
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

        in.close();
    }
}