package br.com.exer2;

/**
 * Created by BRUNO on 06/09/2017.
 */
public class TesteTabela {

    public static void main(String[] args) {

        TabelaPeriodica t = TabelaPeriodica.H;
        TabelaPeriodica t2 = TabelaPeriodica.HE;
        TabelaPeriodica t3 = TabelaPeriodica.O;

        System.out.println("Nome do elemento quimico H: " + t.nome() + "\nNumero do elemento quimico H: "
                + t.numero() + "\nMassa do elemento quimico H: " + t.massa());
        System.out.println();
        System.out.println("Nome do elemento quimico HE: " + t2.nome() + "\nNumero do elemento quimico HE: "
                + t2.numero() + "\nMassa do elemento quimico HE: " + t2.massa());
        System.out.println();
        System.out.println("Nome do elemento quimico O: " + t3.nome() + "\nNumero do elemento quimico O: "
                + t3.numero() + "\nMassa do elemento quimico O: " + t3.massa());
    }
}
