package br.com.exer;

/**
 * Created by BRUNO on 04/09/2017.
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
