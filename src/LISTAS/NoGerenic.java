package LISTAS;

/**
 * Created by BRUNO on 10/09/2017.
 */
public class NoGerenic<T> {

    private T elemento;
    private  NoGerenic<T> proximo;


    public NoGerenic(T elemento) {
        this.elemento = elemento;
    }


    public NoGerenic(T elemento, NoGerenic<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public void setProximo(NoGerenic<T> proximo) {
        this.proximo = proximo;
    }

    public NoGerenic<T> getProximo() {
        return proximo;
    }
}


