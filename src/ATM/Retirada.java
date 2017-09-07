package ATM;

import javafx.stage.Screen;

import java.util.Calendar;

/**
 * Created by BRUNO on 07/09/2017.
 */

//representa uma transação de saque no ATM
public class Retirada extends Transacao {

    //atributos
    private int montante;//conta a sacar fundos
    private Teclado teclado;//referencia ao teclado numerico
    private DispensadorCedula dispensadorCedula;//referencia ao dispensador de cedulas

    //constante que corresponde à opção cancelar no menu
    private final static int CANCELADO = 6;

    //construtor sem argumentos
    public Retirada(int numeroContaUsuario, Tela atmTela, BankDataBase atmBankDatabase, Teclado atmTeclado,
                    DispensadorCedula atmDispensador) {
        //inicializa as variaveis da superclasse
        super(numeroContaUsuario, atmTela, atmBankDatabase);

        //inicializa as referencias ao teclado numérico e ao dispensador de cedulas
        teclado = atmTeclado;
        dispensadorCedula = atmDispensador;

    }

    @Override
    public void executa() {//metodo sobrescrevendo executa

        boolean dispensadorCedulas = false;//cédulas ainda não foram entregues
        double saldoDisponivel;//quantia disponível para saqu

        //obtem as referencias ao banco de dados e tela do banco
        BankDataBase bankDataBase = getBankDataBase();
        Tela tela = getTela();

        //faz um loop até as cedulas serem entregues ou o usuário cancelar
        do {
            //obtém a auqntia de um saque escolhida pelo usuário
            montante = displayMenuDeValor();

            //verifica a quantia de um saque escolhida pelo usuário
            if (montante != CANCELADO) {
                //obtem o saldo disponivel na conta envolvida
                saldoDisponivel = bankDataBase.getSaldoDisponivel(getNumeroConta());
                if (montante <= saldoDisponivel) {
                    //verifica se o dispensador de cédulas tem cédulas suficientes
                    if (dispensadorCedula.temCashSuficienteDisponivel(montante)) {
                        //atualiza a conta envolvida para refletir a retirada
                        bankDataBase.debita(getNumeroConta(), montante);
                        dispensadorCedula.dispensaCash(montante);//entrega cedulas
                        dispensadorCedulas = true;//cédulas foram entregues

                        //instrui o usuario a pegar as cedulas
                        tela.displayLinhaDeMensagem("\nSeu dinheiro está foi enviado" +
                                "Disposto.Por favor pegue-o agora");

                    } else {
                        tela.displayLinhaDeMensagem("\nValor insuficiente no atm" + "\n\nPor favor escolha um valor menor");
                    }
                } else {
                    tela.displayLinhaDeMensagem("Valor insuficiente na sua conta" + "\n\nPor favor escolha um valor menor");

                }
            } else {
                tela.displayLinhaDeMensagem("\nCancelando transação...");
                return;//retorna ao menu principal porque o usuário cancelou
            }


        } while (!dispensadorCedulas);

    }

    private int displayMenuDeValor() {
        int escolhaUsuario = 0;//variável local para armazenar o valor de retorno

        Tela tela = getTela();//obtem referencia de tela

        //array de quantias que correspondem aos números no menu
        int[] valores = {0, 20, 40, 60, 100, 200};

        //faz um loop enquanto nehuma escolha válida for feira
        while (escolhaUsuario == 0) {

            tela.displayLinhaDeMensagem("\nMenu de Saque");
            tela.displayLinhaDeMensagem("1- $20");
            tela.displayLinhaDeMensagem("2 - $40");
            tela.displayLinhaDeMensagem("3 - $60");
            tela.displayLinhaDeMensagem("4 - $100");
            tela.displayLinhaDeMensagem("5 - $200");
            tela.displayLinhaDeMensagem("6 - Cancela transação");
            tela.displayMensagem("\nEscolha uma quantia para saque: ");


            int input = teclado.getInput();//obtem a entrada de usuário pelo teclado

            switch (input) {

                case 1://se o usuário escolheu uma quantia de saque
                case 2://(isto é, escolheu a opção 1,2,3,4 ou 5), retorna a
                case 3://quantia correspondente do array de quantias
                case 4:
                case 5:
                    escolhaUsuario = valores[input];//salva a escolha do usuario
                    break;
                case CANCELADO://o usuario escolheu cancelar
                    escolhaUsuario = CANCELADO;//salva a escolha do usuario
                    break;
                default://o usuário não inseriu um valor entre 1 e 6
                    tela.displayLinhaDeMensagem("\nSeleção inválida. Tente novamente.");

            }//fim do switch

        }//fim do while

        return escolhaUsuario;//retorna a quanantia de saque ou CANCELADA
    }//fim do método
}//fim da classe
