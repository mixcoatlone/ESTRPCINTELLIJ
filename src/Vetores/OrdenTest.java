package Vetores;

/**
 * Created by BRUNO on 24/09/2017.
 */
public class OrdenTest {
    static int x[];

    public static boolean pertence(int valor, int tam) {
        for (int i = 0; i < tam; i++) {
            if (x[i] == valor) {
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]) {

        x = new int[1000];
        int valor, pos;

        for (pos = 0; pos < x.length; pos++) {
            do {
                valor = (int)(Math.random()*100) % 100;
                //valor = (int)(Math.random() * 1000)% 1000;
            } while (pertence(valor, pos));
            System.out.println("Valor gerado = " + valor);
            x[pos] = valor;
        }

        for (pos = 0; pos  < x.length;pos++) {
            System.out.println(x[pos]);
        }

    }
}
