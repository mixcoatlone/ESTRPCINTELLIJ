package Vetores;

import java.util.Scanner;

/**
 * Created by BRUNO on 23/09/2017.
 */
public class Ordenacao {

    int x[] = {25, 57, 48, 37, 92, 33};

    public void setVetor(int vetor[]) {
        this.x = vetor;
    }

    public int[] getX() {
        return x;
    }

    public void bubbleSort() {

        int pos, i, aux;
        System.out.println("Realizando BubbleSort em um vetor de " + x.length + " elementos");

        for (i = 0; i < x.length - 1; i++) {
            for (pos = 0; pos < x.length - i - 1; pos++) {
                if (x[pos] > x[pos + 1]) {
                    aux = x[pos];
                    x[pos] = x[pos + 1];
                    x[pos + 1] = aux;
                }

                //x[i] = entrada.nextInt();
            }
            // System.out.println("Final da iteracao" + i);
            // mostrarVetor();
            //ordenando de forma crescente
            //laço com a quantidade de elementos do vetor

            //laço que percorre da primeira à penúltima posição do vetor
            /*for (i = 0; i <= 3; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }*/
//laço que percorre da última posição à posição n do vetor
            /*for (i = 4; i >= n; i--) {
                if (x[i] < x[i - 1]) {
                    aux = x[i];
                    x[i] = x[i - 1];
                    x[i - 1] = aux;
                }*/
        }

    }

    public void insertionSort() {
        int carta, it, j;
        System.out.println("Realizando InsertionSort em um vetor de " + x.length + " elementos");
        //a iteração vai selecionar a carta da vez, tenho que puxar todos os elementos que são maiores
        for (it = 1; it < x.length; it++) {
            carta = x[it];//guarda a carta
            //for (j = it; (j > 0) && x[j-1] > carta; j--)
            for (j = it - 1; (j >= 0) && x[j] > carta; j--) {
                x[j + 1] = x[j];// trocando todos que são maiores que eu
                //x[j] = x[j - 1];
                //x[j] = carta;
            }
            x[j + 1] = carta;
            //System.out.println("------------iteração" + it);
            //mostrarVetor();

        }
    }

    public void selectionSort() {
        int it, posMenor, posMenorIni, i, aux;
        System.out.println("Realizando SelectionSort em um vetor de " + x.length + " elementos");

        //1º forma
        for (it = 0; it < x.length - 1; it++) {
            posMenor = it + 1;
            posMenorIni = it;
            for (i = posMenorIni + 1; i < x.length; i++) {
                if (x[i] < x[posMenor]) {
                    posMenor = i;
                }
                // System.out.println("Menor elemento encontrado na iteracao esta na posição" + posMenor);
                if (x[posMenor] < x[posMenorIni]) {
                    aux = x[posMenorIni];
                    x[posMenorIni] = x[posMenor];
                    x[posMenor] = aux;

                    //1º forma, tem que usar parametros no método
                    /*for (it = 0; i < x.length - 1; it++) {
                        posMenor = i;
                        for (i = it + 1; i < x.length; i++) {
                            if (x[i] < x[posMenor]);
                            posMenor = i;
                        }
                        if (it != posMenor){
                            aux = x[it];
                            x[it] = x[posMenor];
                            x[posMenor] = aux;
                        }

                    }*/


                }
            }
        }

    }

    public void mostrarVetor() {

        for (int i = 0; i < x.length; i++) {
            /*System.out.println((i + 1 + " número: " + x[i]));*/
            System.out.print(x[i] + ",  ");

        }
        System.out.println("");


    }

    public int partition(int inicio, int fim) {
        int ref, up, down, temp;

        ref = x[inicio];
        down = inicio;
        up = fim;

        while (down < up) {
            //encontrando um numero maior que o pivo
            while (x[down] <= ref && down < fim) {//avança posição da esquerda
                down++;
            }
            //encontrar a partir do fim um valor menor que de referencia
            while (x[up] > ref) {//recua posição da direita
                up--;
            }
            if (down < up) {//trocar down e dir
                temp = x[down];
                x[down] = x[up];
                x[up] = temp;
            }
        }
        x[inicio] = x[up];
        x[up] = ref;
        return up; //o up é o pivo
    }

    public void quickSort(int inicio, int fim) {
        int pivo;
        if (inicio > fim) {
            return;
        }
        pivo = partition(inicio, fim);
        quickSort(inicio, pivo - 1);
        quickSort(pivo + 1, fim);


    }


}
