/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author BRUNO
 */
public class HashTablle {

    Integer chassi;
    String marca;
    List list;

    public HashTablle(Integer chassi, String marca) {
        this.chassi = chassi;
        this.marca = marca;
    }

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return chassi + " " + marca + " ";
    }

    @Override
    public int hashCode() {
        return chassi;
    }

    @Override
    public boolean equals(Object o) {
        //HashTablle t = (HashTablle) o;
        if (this.chassi == (((HashTablle) o)).chassi) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Map lista = new Hashtable();

        HashTablle t1 = new HashTablle(12, "Volvo");
        HashTablle t2 = new HashTablle(19, "Mercedes");
        HashTablle t3 = new HashTablle(112, "Volks");
        HashTablle t4 = new HashTablle(12, "Fiat");
        HashTablle t5 = new HashTablle(120, "Scania");

        lista.put(t1, "Truck 1");
        lista.put(t3, "Truck 3");
        lista.put(t2, "Truck 2");
        lista.put(t4, "Truck 4");
        lista.put(t5, "Truck 5");

        Collection c = lista.values(); // valores contido em um mapa
        Iterator i = c.iterator(); // responsavel por iterar a collection

        while (i.hasNext()) { // enquanto houver proximo na lista
            System.out.println(i.next() + "");
        }

    }

}
