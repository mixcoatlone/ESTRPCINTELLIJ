/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 *
 * @author BRUNO
 */
class HashTablle2 implements Comparable<Object> {

    Integer chassi;

    public HashTablle2(Integer chassi) {
        this.chassi = chassi;

    }

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return chassi + " ";
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

    @Override
    public int compareTo(Object truck) {
        HashTablle2 t = (HashTablle2) truck;
        return t.chassi.compareTo(this.chassi);
    }
}

public class HashTrree {

    public static void main(String[] args) {
        Map lista = new TreeMap();
        ArrayList list = new ArrayList();

        HashTablle2 t1 = new HashTablle2(12);
        HashTablle2 t2 = new HashTablle2(19);
        HashTablle2 t3 = new HashTablle2(112);
        HashTablle2 t4 = new HashTablle2(12);
        HashTablle2 t5 = new HashTablle2(120);
        /*lista.put("Bruno", "Gerente");*/
        lista.put(t1, "Scania");
        lista.put(t2, "Volvo");
        lista.put(t3, "Mercedes");
        lista.put(t4, "Ford");
        lista.put(t5, "Fiat");

        list.add(t1);
        list.add(t2);
        list.add(t3);

        //Collection c = lista.values(); // valores contido em um mapa
        //Iterator i = c.iterator(); // responsavel por iterar a collection
        //while (i.hasNext()) { // enquanto houver proximo na lista
        //System.out.println(lista);
        for (Object a : list) {
            System.out.print("Lista: "+a);
        }
        System.out.println();
        list.forEach(liste -> {
            System.out.println("percorrendo: " + list);
            System.out.println("Lista: " + list);
        });
        
        Collections.sort(list);//ordenar relacionado às strings
        System.out.println(""+list);

    }
}
