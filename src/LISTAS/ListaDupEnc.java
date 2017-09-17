package LISTAS;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class ListaDupEnc {

    protected int tamanho;// quantidade de elementos
    protected NoListaDuplaEnc cabeca, cauda;//sentinelas

    //cria uma lista vazia
    public ListaDupEnc() {
        tamanho = 0;
        cabeca = new NoListaDuplaEnc(null, cabeca, null);//cria o cabeçalho
        cauda = new NoListaDuplaEnc(null, cabeca, null);//cria o final
        cabeca.setProx(cauda);//faz o cabeçalho e o final apontarem um para o outro
    }

    //retorna o número de elementos da lista
    public int getTamanho() {
        return tamanho;
    }

    //informa se a lista está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    //retorna o primeiro nó da lista
    public NoListaDuplaEnc getPrimeiro() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Lista está vazia");
        return cabeca.getProx();
    }

    public NoListaDuplaEnc getUltimo() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Lista está vazia");
        return cabeca.getAnte();
    }

    //retorna o nó que antecede um dado nó v. Gera erro se v é o cabeçalho
    public NoListaDuplaEnc getAnterior(NoListaDuplaEnc v) throws IllegalArgumentException {

        if (v == cabeca) throw new IllegalArgumentException("Não pode voltar após o final da lista");

        return v.getAnte();
    }

    //retorna o nó que antecede um dado nó v. Gera erro se v é o final
    public NoListaDuplaEnc getProximo(NoListaDuplaEnc v) throws IllegalArgumentException {

        if (v == cauda) throw new IllegalArgumentException("Não pode avançar após o final da lista");

        return v.getProx();
    }


    //Insere um dado nó telha antes de um dado nó casa. Gera um erro se casa é o cabeçalho
    public void addAntes(NoListaDuplaEnc casa, NoListaDuplaEnc telha) throws IllegalArgumentException {

        NoListaDuplaEnc aux = getAnterior(casa); //deve lançar uma IllegalArgumentException

        telha.setAnte(aux);
        telha.setProx(casa);
        casa.setAnte(telha);
        aux.setProx(telha);
        tamanho++;

    }

    //Insere um dado nó telha depois de um dado nó casa. Gera um erro se casa é o final
    public void addApos(NoListaDuplaEnc casa, NoListaDuplaEnc telha) throws IllegalArgumentException {

        NoListaDuplaEnc aux = getProximo(casa); //deve lançar uma IllegalArgumentException

        telha.setAnte(casa);
        telha.setProx(aux);
        aux.setAnte(telha);
        casa.setProx(telha);
        tamanho++;
    }

    //adiciona no inicio da lista
    public void addInicio(NoListaDuplaEnc bola) {
        addAntes(cabeca, bola);
    }

    //adiciona no fim da lista
    public void addFim(NoListaDuplaEnc item) {
        addApos(cauda, item);
    }


    public void remove(NoListaDuplaEnc valor) {
        NoListaDuplaEnc ant = getAnterior(valor);//deve lançar uma IllegalArgumentException
        NoListaDuplaEnc depois = getProximo(valor);//deve lançar uma IllegalArgumentException

        //Desconecta o nó da lista
        depois.setAnte(ant);
        ant.setProx(depois);
        valor.setAnte(null);
        valor.setProx(null);
        tamanho--;

    }

    //indica se o nó indicado possui um antecessor
    public boolean possuiAnterior(NoListaDuplaEnc valor) {
        return valor != cabeca;
    }

    //indica se o nó indicado possui um proximo
    public boolean possuiProximo(NoListaDuplaEnc valor) {
        return valor != cauda;
    }

    @Override
    public String toString() {

        String s = "[";

        NoListaDuplaEnc va = cabeca.getProx();

        while (va != cauda) {
            s += va.getElemento();
            va = va.getProx();

            if (va != cauda) {
                s += ",";
            }
            s += "]";
        }
        return s;
    }
}
