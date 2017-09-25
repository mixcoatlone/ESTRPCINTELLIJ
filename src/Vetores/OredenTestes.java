package Vetores;

import java.util.Scanner;

/**
 * Created by BRUNO on 24/09/2017.
 */
public class OredenTestes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       // int x[] = new int[3];
       int op = 0;
       // for (int i = 0; i < x.length; i++) {
          //  x[i] = entrada.nextInt();
       // }

        Ordenacao ord = new Ordenacao();
       // ord.setVetor(x);

        do {
            System.out.println("entre com a opção: ");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("antes do BubbleSort: ");
                ord.mostrarVetor();
                ord.bubbleSort();
                ord.mostrarVetor();
            } else if (op == 2) {
                System.out.println("antes do InsertionSort: ");
                ord.mostrarVetor();
                ord.insertionSort();
                ord.mostrarVetor();
            } else if (op == 3) {
                System.out.println("antes do SelectionSort: ");
                ord.mostrarVetor();
                ord.selectionSort();
                ord.mostrarVetor();
            }else if (op == 4) {
                System.out.println("antes do QuickSort: ");
                ord.mostrarVetor();
                ord.quickSort(0, ord.getX().length-1);
                ord.mostrarVetor();
            } else System.out.println("opção errada");;
        } while (op != 0);
    }
}