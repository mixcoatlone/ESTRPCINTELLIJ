package LISTAFERN;

/**
 * Created by BRUNO on 10/09/2017.
 */
public class CAIXA {

    private Pessoa pessoa;
    private CAIXA prox, ante;


    public CAIXA(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.prox = null;
        //this.ante = null;
    }
        public Pessoa getPessoa() {
            return pessoa;

        }public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;

        }public CAIXA getProx() {
            return prox;

        }public void setProx(CAIXA prox) {
            this.prox = prox;

        }public CAIXA getAnte() {
            return ante;

        }public void setAnte(CAIXA ante) {
            this.ante = ante;
        }
    }
