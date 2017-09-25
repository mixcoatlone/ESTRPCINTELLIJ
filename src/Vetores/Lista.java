package Vetores;

import java.util.Arrays;

/**
 * Created by BRUNO on 23/09/2017.
 */
public class Lista implements TadListSequencial {


    Object[] elementos;
    private int tamanho;


    @Override
    public void inicializar(int qtdMaxima) {

        this.elementos = new Object[qtdMaxima];
        this.tamanho = 0;
        //this.aumentaEspaco();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void incluir(Object elemento) throws Exception {
        this.aumentaEspaco();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {

            throw new UnsupportedOperationException("Lista cheia...");
        }

    }

  /*  @Override
    public void incluirInicio(Object elemento) throws Exception {

        throw new UnsupportedOperationException("Not supported yet.");

    }*/

    @Override
    public void incluir(Object elemento, int posicao) throws Exception {
        if (!(posicao >= 0 && posicao <= tamanho)) {

            throw new UnsupportedOperationException("Posicao errada");

        }
        this.aumentaEspaco();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    @Override
    public Object obterDaPosicao(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.tamanho)
            return this.elementos[posicao];
        throw new UnsupportedOperationException("Not supported yet.");

    }

   /* @Override
    public Object obter(Object item) throws Exception {

        return this.elementos;
        //throw new UnsupportedOperationException("Not supported yet.");


    }*/

    @Override
    public void remover(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new UnsupportedOperationException("Posicao invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    @Override
    public void limpar() throws Exception {

//        if (!this.elementos.equals(this.tamanho)) {
//            throw new UnsupportedOperationException("não tem elementos");
//        } else {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
    }

    @Override
    public int getTamanho() throws Exception {
        return this.tamanho;
        //throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Object contem(Object item) throws Exception {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(item)) {
                return this.elementos[i];
            }
        }
        throw new UnsupportedOperationException("Não contem elementos");

    }

    @Override
    public boolean verificarInicalização() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public boolean estaCheia() throws Exception {
        if (this.elementos.length != 0){
            return true;
        }
        throw new UnsupportedOperationException("Não está cheia");

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public void aumentaEspaco() {
        if (this.tamanho == this.elementos.length) {
            Object[] Novo = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                Novo[i] = this.elementos[i];

            }
            this.elementos = Novo;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.elementos);
        hash = 97 * hash + this.tamanho;
        return hash;

    }

    //    public Lista(Lista[] elementos, int tamanho) {
//        this.elementos = elementos;
//        this.tamanho = tamanho;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lista other = (Lista) obj;
        if (!Arrays.deepEquals(this.elementos, other.elementos)) {
            return false;
        }
        return true;
    }


}
