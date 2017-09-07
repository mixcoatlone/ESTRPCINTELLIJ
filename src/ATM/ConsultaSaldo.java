package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class ConsultaSaldo extends Transacao {

    public ConsultaSaldo(int numeroContaUsuario, Tela atmTela, BankDataBase atmDatabase) {
        super(numeroContaUsuario,atmTela,atmDatabase);
    }

    @Override
    public void executa() {

        BankDataBase bankDataBase = getBankDataBase();
        Tela tela = getTela();

        double saldoDisponivel = bankDataBase.getSaldoDisponivel(getNumeroConta());
        double totalSaldo = bankDataBase.getTotalSaldo(getNumeroConta());
        tela.displayLinhaDeMensagem("\nInformação do Saldo");
        tela.displayMensagem("\nSaldo Disponivel");
        tela.displayValorDolar(saldoDisponivel);
        tela.displayLinhaDeMensagem("\n - Total saldo");
        tela.displayValorDolar(totalSaldo);
        tela.displayLinhaDeMensagem("");

    }
}
