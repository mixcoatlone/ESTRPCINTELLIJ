/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author BRUNO
 */
public class CadastradorProdutos {

    public static void main(String[] args) {

        Collection<Produto> produtos = new ArrayList<>();

        System.out.println("#### Cadastro de produtos ####\n");

        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";

            while ("s".equalsIgnoreCase(continuar)) {

                System.out.println("SKU: ");
                String sku = entrada.nextLine();

                System.out.println("SKU: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);

                if (produtos.contains(produto)) {
                    System.err.println("Esse produto já foi adicionado");
                    System.err.flush();
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado");
                }
                System.out.println("\nDeseja adicionar mais algum produto? (s/n) ");
                continuar = entrada.nextLine();
            }

        }
        produtos.forEach(System.out::println);
        System.out.println("Fim");
    }

}
