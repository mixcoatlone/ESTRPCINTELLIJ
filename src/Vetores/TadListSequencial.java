package Vetores;

/**
 * Created by BRUNO on 23/09/2017.
 */
public interface TadListSequencial {


    void inicializar(int qtdMaxima);

    void incluir(Object elemento) throws Exception;

   // void incluirInicio(Object elemento)throws Exception;

    void incluir(Object elemento, int posicao)throws Exception;

    Object obterDaPosicao(int posicao)throws Exception;

    //Object obter(Object item)throws Exception;

    void remover(int posicao)throws Exception;

    void limpar()throws Exception;

    int getTamanho()throws Exception;

    Object contem(Object item)throws Exception;

    boolean verificarInicalização()throws Exception;

    boolean estaCheia()throws Exception;



}
