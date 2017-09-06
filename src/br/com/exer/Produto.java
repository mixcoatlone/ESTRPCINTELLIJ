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

    @Override
    public boolean equals(Object obj) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        if (!sku.equals(produto.sku)) return false;
        return nome.equals(produto.nome);*/
        Produto outro = (Produto) obj;
        return this.sku.equals(outro.getSku());
    }

    @Override
    public int hashCode() {
        /*int result = sku.hashCode();
        result = 31 * result + nome.hashCode();
        return result;*/
        return this.sku.charAt(0);
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
