package br.com.exer2;

/**
 * Created by BRUNO on 06/09/2017.
 */
public enum TabelaPeriodica {

    H(1, 1.00794, "HIDROGENIO"),
    HE(2, 4.002602, "HELIO"),
    O(8, 15.99994, "OXIGENIO");

    private final int numero;
    private final double massa;
    private final String nome;


   public int numero() {
        return this.numero;
    }

    public double massa() {
        return this.massa;
    }

    public String nome() {
        return this.nome;
    }

    private TabelaPeriodica(int numero, double massa, String nome){
        this.numero = numero;
        this.massa = massa;
        this.nome = nome;
    }
}