package ATM;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class DispensadorCedula {

    private final static int CONTA_INICIAL = 500;
    private int conta;//numero de cédulas de R$ 20 remanescentes


    public DispensadorCedula() {
        this.conta = CONTA_INICIAL;//configura atributo como o padrão
    }

    public void dispensaCash(int valor){
        int billsRequired = valor / 20;//número de cedulas de 20 requerido
        conta -= billsRequired;//atualiza a contagem das cédulas
    }

    public boolean temCashSuficienteDisponivel(int valor){
        int billsRequired = valor / 20;//número de cédulas de 20 requerido
        if(valor >= billsRequired)
            return true;//há cedulas suficientes disponivel
        else
            return false;//não há cedulas suficientes
    }

}
