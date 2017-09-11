package LISTAFERN;

/**
 * Created by BRUNO on 10/09/2017.
 */
public class ListSimEcn {

    private CAIXA primeiro, ultimo;
    private int qtdCaixa;


    public ListSimEcn() {

        this.primeiro = null;
        this.ultimo = null;
        this.qtdCaixa = 0;
    }

    public CAIXA getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(CAIXA primeiro) {
        this.primeiro = primeiro;
    }

    public CAIXA getUltimo() {
        return ultimo;
    }

    public void setUltimo(CAIXA ultimo) {
        this.ultimo = ultimo;
    }

    public int getQtdCaixa() {
        return qtdCaixa;
    }

    public void setQtdCaixa(int qtdCaixa) {
        this.qtdCaixa = qtdCaixa;
    }

    private void inserirPrim(Pessoa pessoa) {
        CAIXA caixa = new CAIXA(pessoa);

        if (this.isEmpty()) {
            this.ultimo = caixa;
        }
        caixa.setProx(this.primeiro);
        this.primeiro = caixa;
        this.qtdCaixa++;
    }

    private void inserirFim(Pessoa pessoa) {
        CAIXA caixa = new CAIXA(pessoa);

        if (this.isEmpty()) {
            this.primeiro = caixa;
        }
        this.ultimo.setProx(caixa);
        this.ultimo = caixa;
        //caixa.setProx(null);
        this.qtdCaixa++;
    }

    private boolean isEmpty() {
        return (this.primeiro == null);
    }

    private boolean remover(String nome) {

        CAIXA atual = this.primeiro;
        CAIXA ant = null;

        if (isEmpty()) {
            return false;
        } else {
            while ((atual != null) && (atual.getPessoa().getNome().equals(nome))) {
                ant = atual;
                atual = atual.getProx();
            }
            if (atual == this.primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProx();
            } else {
                if (atual == this.ultimo) {
                    this.ultimo = ant;
                }
                ant.setProx(atual.getProx());

            }
            this.qtdCaixa--;
            return true;
        }
    }

}
