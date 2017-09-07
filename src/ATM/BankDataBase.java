package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class BankDataBase {

    private Conta[] contas;//array de Contas

    public BankDataBase() {
        this.contas = new Conta[2];//apenas 2 contas para teste
        this.contas[0] = new Conta(123456, 54321, 1000.0, 1200.0);
        this.contas[1] = new Conta(98765, 56789, 200.0, 200.0);
    }

    private Conta getConta(int numeroConta) {
        for (Conta contaAtual : contas) {
            if (contaAtual.getNumeroDaConta() == numeroConta)
                return contaAtual;
        }
        //se nenhuma correspondencia com uma conta foi localizada, retorna null
        return null;
    }

    //determina se número da conta PIN  especificados pelo usuário correspondem
    //àqueles de uma ocnta no banco de dados
    public boolean usuarioAutenticado(int numeroContaUsuario, int usuarioPIN) {

        //tenta recuperar a conta com o número da conta
        Conta contaUsuario = getConta(numeroContaUsuario);

        //se a conta existir, retorna o resutlado do método validaPIN de Conta
        if (contaUsuario != null)
            return contaUsuario.validaPIN(usuarioPIN);
        else
            return false;//número de conta não foi localizado, portanto retorna false
    }

    //retorna o saldo disponivel de Conta com o número da conta especificado
    public double getSaldoDisponivel(int numeroContaUsuario){

        return getConta(numeroContaUsuario).getSaldoDisponivel();
    }
    //retorna o saldo total de Conta com o número da conta especificado
    public double getTotalSaldo(int numeroContaUsuario){

        return getConta(numeroContaUsuario).getTotalSaldo();
    }

    //credtia uma quantia a Conta com o número da conta especificado
    public void credita(int numeroContaUsuario, double valor){
        getConta(numeroContaUsuario).credita(valor);
    }

    //debita uma quantia a Conta com o número da conta especificado
    public void debita(int numeroContaUsuario, double valor){
        getConta(numeroContaUsuario).debita(valor);
    }

}
