/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author BRUNO
 */
public class Iteratorr {

    public static void main(String[] args) {
        String[] paises = {"Brasil", "Mexico", "Argentina", "USA"};

        ArrayList lista = new ArrayList();

        lista.add(paises[0]);
        lista.add(paises[1]);
        lista.add(paises[2]);
        lista.add(2, "California");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        //O Iterator vai andar pra frente até achar o elemento procurado
        Iterator iterator = lista.iterator();// iterator unidirecional - para frente
        while (iterator.hasNext()) {
            if (iterator.next().equals("California")) {
                iterator.remove();
            }
        }
        System.out.println(lista.get(2));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
