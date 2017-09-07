package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class Tela {

    //exibe uma mensagem sem retorno
    public void displayMensagem(String mensagem) {
        System.out.print(mensagem);
    }

    //exibe uma mensagem com um retorno
    public void displayLinhaDeMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    //exibe um valor em dólares
    public void displayValorDolar(double valor) {
        System.out.printf("$%,.2f",valor);
    }

}
