package Vetores;

/**
 * Created by BRUNO on 23/09/2017.
 */
public class TestList {

    public static void main(String[] args) throws Exception {
        Lista lista1 = new Lista();

        lista1.inicializar(10);
        // lista1.incluir(1, 0);
        //lista1.incluir(5, 4);
        lista1.incluir(1);
        lista1.incluir(2);
        lista1.incluir(3);
        lista1.incluir(4);
        lista1.incluir(5);
        lista1.incluir(6);
        lista1.incluir(7);
        lista1.incluir(8);
        lista1.incluir(9);
        lista1.incluir(10);
        lista1.incluir(11);
        lista1.incluir(12);
        //lista1.incluir(10, 11);


        System.out.println(lista1.estaCheia());
        System.out.println("O elemento: "+lista1.obterDaPosicao(2));
        System.out.println("O elemento "+lista1.contem(6)+" existe");
        //lista1.limpar();
        //lista1.getTamanho();
        //lista1.remover(0);
        //lista1.toString();
        lista1.contem(3);
        System.out.println(lista1.toString());
        //System.out.println(lista1.estaCheia());
        System.out.println("O tamanho da lista é: " + lista1.getTamanho());
    }
}
