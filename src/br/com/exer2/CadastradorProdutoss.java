package br.com.exer2;

import br.com.exer.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;


/**
 * Created by BRUNO on 04/09/2017.
 */
public class CadastradorProdutoss {

    public static void main(String[] args) {

        Collection<Produto> produtos = new HashSet<>();


        System.out.println("#### Cadastro de produtos ####\n");

        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";

            while ("s".equalsIgnoreCase(continuar)) {

                System.out.println("SKU: ");
                String sku = entrada.nextLine();

                System.out.println("Nome: ");
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
