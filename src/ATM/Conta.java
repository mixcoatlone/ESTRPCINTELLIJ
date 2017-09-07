package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class Conta {

    private int numeroDaConta;//número da conta
    private int pin;//PIN para autenticação
    private double saldoDisponivel;//fundos disponiveis para saque
    private double totalSaldo;//fundos disponiveis + depositos pendentes

    //O construtor Conta inicializa os tributos
    public Conta(int OnumeroDaConta, int Opin, double OsaldoDisponivel, double OtotalSaldo) {
        this.numeroDaConta = OnumeroDaConta;
        this.pin = Opin;
        this.saldoDisponivel = OsaldoDisponivel;
        this.totalSaldo = OtotalSaldo;
    }

    //determina se um PIN especificado pelo usuário corresponde ao PIN em Conta
    public boolean validaPIN(int usuarioPIN) {
        if (usuarioPIN == pin) {
            return true;
        } else {
            return false;
        }
    }

    //retorna o saldo disponivel
    public double getSaldoDisponivel() {

        return saldoDisponivel;
    }

    //retorna o saldo total
    public double getTotalSaldo() {
        return totalSaldo;
    }

    //credita uma quantia à conta
    public void credita(double valor) {
        totalSaldo += valor;//adiciona ao saldo total
    }

    //debita uma quantia da conta
    public void debita(double valor){
        saldoDisponivel -= valor;//subtrai do saldo disponivel
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
}
