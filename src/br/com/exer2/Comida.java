package br.com.exer2;

import java.util.Scanner;

/**
 * Created by BRUNO on 06/09/2017.
 */
public class Comida {


    private double tottal;

    public static enum Bebidas {

        PEPSI("Pepsi", 4.0), SUCO("suco", 3.0), AGUA("agua", 3.5);


        private String nome;
        private double preco;

        public double getPreco() {
            return preco;
        }

        public String getNome() {
            return nome;
        }

        Bebidas(String nome, double preco) {
            this.preco = preco;
            this.nome = nome;
        }
    }

    public static enum Comidas {

        SANDUICHE("Sanduiche", 4.0), HOTDOG("HotDog", 3.0), XBURGER("X-Burger", 3.5);

        private double preco;
        private String nome;

        public double getPreco() {
            return preco;
        }

        public String getNome() {
            return nome;
        }

        Comidas(String nome, double preco) {
            this.preco = preco;
            this.nome = nome;
        }
    }

    public static void menu() {

        System.out.println("\tBebidas ");
        System.out.println("1. " + Bebidas.PEPSI.getNome() + " R$ " + Bebidas.PEPSI.getPreco());
        System.out.println("2. " + Bebidas.SUCO.getNome() + " R$ " + Bebidas.SUCO.getPreco());
        System.out.println("3. " + Bebidas.AGUA.getNome() + " R$ " + Bebidas.AGUA.getPreco());

        System.out.println("\tComidas ");
        System.out.println("4. " + Comidas.SANDUICHE.getNome() + " R$ " + Comidas.SANDUICHE.getPreco());
        System.out.println("5. " + Comidas.HOTDOG.getNome() + " R$ " + Comidas.HOTDOG.getPreco());
        System.out.println("6. " + Comidas.XBURGER.getNome() + " R$ " + Comidas.XBURGER.getPreco());

        System.out.println("0. Sair ");
        System.out.println("Escolha sua opção: ");

    }

    public static double preco(int opcao) {

        switch (opcao) {

            case 1:
                return Bebidas.PEPSI.getPreco();
            case 2:
                return Bebidas.SUCO.getPreco();
            case 3:
                return Bebidas.AGUA.getPreco();
            case 4:
                return Comidas.SANDUICHE.getPreco();
            case 5:
                return Comidas.HOTDOG.getPreco();
            case 6:
                return Comidas.XBURGER.getPreco();
            default:
                return 0.0;

        }


    }

    public static void main(String[] args) {
        double tottal = 0.0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            menu();
            opcao = entrada.nextInt();
            tottal += preco(opcao);
            System.out.println("Opçao escolhida: " + opcao);
            System.out.println("Valor a pagar: " + tottal + "\n");


        } while (opcao != 0);
    }
}
