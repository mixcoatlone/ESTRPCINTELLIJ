package ATM;

import br.com.exer.ConsultaCobertura;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class ATMM {

    private boolean usuarioAutenticado;//se usuário foi autenticado
    private int numeroAtualConta;//numero atual da conta de usuario
    public  Tela tela;//tela do atm
    private Teclado teclado;//teclado do atm
    private DispensadorCedula cedula;//dispensador de cédulas do atm
    private DepositSlot depositSlot;//abertura para depósito do atm
    private BankDataBase bancoDados;// banco de dados de informações sobre a conta

    //constantes que correspondem ás principais opções de menu
    private static final int CONSULTA_SALDO = 1;
    private static final int RETIRAR = 2;
    private static final int DEPOSITO = 3;
    private static final int SAIR = 4;

    public ATMM() {
        this.usuarioAutenticado = false;//usuário não foi autenticado para iniciar
        this.numeroAtualConta = 0;//nehum número atual de conta para iniciar
        this.tela = new Tela();//cria a tela
        this.teclado = new Teclado();//cira teclado
        this.cedula = new DispensadorCedula();//cira o dispensador de cedulas
        this.depositSlot = new DepositSlot();//cria a abertura para deposito
        this.bancoDados = new BankDataBase();//cria banco de dados com informações sobre as contas
    }

    //inicia o atm
    public void run() {

        //da boas-vindas e autentica o usuário; realiza transações
        while (true) {
            //faz um loop enquanto o usuario ainda não está autenticado//
            while (!usuarioAutenticado) {
                tela.displayLinhaDeMensagem("\nBem Vindo!");
                usuarioPermitido();//autentica o usuario
            }
            usuarioAutenticado = false;//reinicializa antes da próxima sessão do atm
            numeroAtualConta = 0;//reinicializa antes da próxima sessão do atm
            tela.displayLinhaDeMensagem("\nObrigado!");
        }//fim do while
    }//fim do método run


    private void usuarioPermitido() {

        tela.displayMensagem("\nPor favor insira o numero da conta: ");
        int numeroDaConta = teclado.getInput();//insere o número de conta
        tela.displayMensagem("\nInsira seu PIN: ");// solicita o pin
        int pin = teclado.getInput();//insere o pin

        //configura usuarioAutenticado como um valor booleano retornando pelo banco de dados
        usuarioAutenticado = bancoDados.usuarioAutenticado(numeroDaConta, pin);

        if (usuarioAutenticado) {
            numeroAtualConta = numeroDaConta;//salva a conta do usuário
        } else {
            tela.displayLinhaDeMensagem("Numero da conta invalido ou PIN. Tente novamente");
        }
    }

    //exibe o menu principal e realiza transações
    private void transacao() {

        //vaiável local para armazenar a transação atualmente processada
        Transacao transacaoAtual = null;

        boolean usuarioSaiu = false;//usuário optou por não sair

        //faz um loop enquanto o usuário não escolher a opão para sair do sistema
        while (!usuarioSaiu) {
            //mostra o menu principal e obtem a selação de usuário
            int menuSelecao = displayMenuPrinciapal();

            //decide como prosseguir com base na seleção de menu feita pelo usuário

            switch (menuSelecao) {

                case CONSULTA_SALDO:
                case RETIRAR:
                case DEPOSITO:

                    //inicializa como o novo objeto do tipo escolhido
                    transacaoAtual = criaTransacao(menuSelecao);
                    transacaoAtual.executa();//executa a transação
                    break;
                case SAIR://usuario optou por terminar a sessão
                    tela.displayLinhaDeMensagem("\nSaindo do sistema...");
                    usuarioSaiu = true;//essa sessão de atm deve terminar
                    break;
                default://usuario não inseriu um inteiro de 1 a 4
                    tela.displayLinhaDeMensagem("\nNão foi inserido uma seção válida. Tente novamente");
                    break;
            }//fim do switch
        }//fim do while
    }//fim do método Transação

    private int displayMenuPrinciapal() {

        tela.displayLinhaDeMensagem("\nMenu Principal");
        tela.displayLinhaDeMensagem("1 - Ver Saldo");
        tela.displayLinhaDeMensagem("2 - Retirar cash");
        tela.displayLinhaDeMensagem("3 - Depositar");
        tela.displayLinhaDeMensagem("4 - Sair\n");
        tela.displayMensagem("Escolha uma opão");

        return teclado.getInput();//retorna a seleção do usuário
    }

    //retorna o objeto da subclasse de transção especificada
    private Transacao criaTransacao(int tipo) {

        Transacao temp = null;//variável transação temporaria

        //determinda qual tipo de trasação criar
        switch (tipo){
            case CONSULTA_SALDO://cria uma nova transação
                temp = new ConsultaSaldo(numeroAtualConta,tela,bancoDados);
            break;
            case RETIRAR:
                temp = new Retirada(numeroAtualConta,tela,bancoDados,teclado,cedula);
            case DEPOSITO://cria uma nova transação Retirada
                //temp = new Deposito();
            break;
        }//fim do switch

        return temp;//retorna o objeto recém-criado
    }//fim do método
}//fim da classe atm

