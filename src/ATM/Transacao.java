package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public abstract class Transacao {

    private int numeroConta;//indica conta envolvida
    private Tela tela;//Tela do atm
    private BankDataBase bankDataBase;//banco de dados de informações sobre a conta

    public Transacao(int numeroConta, Tela atmTela, BankDataBase atmDatabase) {
        this.numeroConta = numeroConta;
        this.tela = atmTela;
        this.bankDataBase = atmDatabase;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Tela getTela() {
        return tela;
    }

    public BankDataBase getBankDataBase() {
        return bankDataBase;
    }

    public abstract void executa();
}
