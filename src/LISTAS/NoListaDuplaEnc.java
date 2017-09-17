package LISTAS;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class NoListaDuplaEnc {

    protected String elemento;//String armazenada pelo Nó
    protected NoListaDuplaEnc prox,ante;//ponteiros para o nó seguinte e o anterior


    public NoListaDuplaEnc(String elemento, NoListaDuplaEnc prox, NoListaDuplaEnc ante) {
        this.elemento = elemento;
        this.prox = prox;
        this.ante = ante;
    }


    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public NoListaDuplaEnc getProx() {
        return prox;
    }

    public void setProx(NoListaDuplaEnc prox) {
        this.prox = prox;
    }

    public NoListaDuplaEnc getAnte() {
        return ante;
    }

    public void setAnte(NoListaDuplaEnc ante) {
        this.ante = ante;
    }
}
