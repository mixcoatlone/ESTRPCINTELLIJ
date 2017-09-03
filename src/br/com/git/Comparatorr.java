/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author BRUNO
 */
class ComparatorPrioridade implements Comparator {

    @Override
    public int compare(Object um, Object dois) {
        return (Integer) dois - (Integer) um;
    }

}

public class Comparatorr {

    public static void main(String[] args) {
        int[] num = {1, 3, 2, 4, 6, 5, 9, 8, 6, 7, 0};
        System.out.println("Ordem como foram inseridos: ");
        
        for (int x : num) {
            System.out.print(x+" ");
        }
        System.out.println();
        PriorityQueue p = new PriorityQueue();
       
        for (int x : num)
            p.offer(x);//carrega a fila
        
            System.out.print("Ordem natural dos elementos: ");  
            System.out.println();
            for (int x : num)                
            System.out.print(p.poll()+" ");
            System.out.println();
        
            
            
        }
}
