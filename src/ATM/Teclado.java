package ATM;

import java.util.Scanner;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class Teclado {

    private Scanner input;//lê os dados na linha de comando

    //construtor sem argumentos iniciliza a classe Scanner
    public Teclado() {
        input = new Scanner(System.in);
    }

    //retorna um valor inteiro inserido pelo usuario
    public int getInput() {
        return input.nextInt();//supomos que o usuario insira um inteiro
    }
}
