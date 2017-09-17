package LISTAS;

import java.io.NotActiveException;

/**
 * Created by BRUNO on 10/09/2017.
 */
public class ListGeneric<T> {

    private NoGerenic<T> primeiro;


    public ListGeneric() {
        this.primeiro = null;
    }


    public void inserir(T elemento) {
        NoGerenic novo = new NoGerenic<>(elemento);

        novo.setProximo(this.primeiro);
        this.primeiro = novo;

    }

    public NoGerenic<T> remover(NoGerenic item) {
        NoGerenic atual = primeiro;
        NoGerenic anterior = primeiro;

        while (atual.getElemento() != item) {
            if (atual.getElemento() == null) {
                return null;
            } else {
                anterior = atual;
                atual = atual.getProximo();
            }
        }
        if (atual == primeiro) {
            primeiro = primeiro.getProximo();
        } else {
            anterior = atual.getProximo();
        }
        return atual;
    }

    private NoGerenic<T> getPrimeiro() {
        return primeiro;
    }

    public NoGerenic<T> removerPrimeiro(NoGerenic<T> busca) {
        primeiro = primeiro.getProximo();
        return (NoGerenic<T>) busca;
    }

    public NoGerenic<T> removerMeio(NoGerenic<T> antes, NoGerenic<T> depois) {
        antes.setProximo(depois.getProximo());
        return antes;
    }

    public boolean isEmpty() {

        if (this.primeiro == null) {
            return true;
        }
        return false;
    }


}
