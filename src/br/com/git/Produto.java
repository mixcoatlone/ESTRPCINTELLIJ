/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

/**
 *
 * @author BRUNO
 */
public class Produto {

    private String sku;
    private String nome;

    @Override
    public String toString() {
        return "Produto{" + "sku=" + sku + ", nome=" + nome + '}';
    }

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
