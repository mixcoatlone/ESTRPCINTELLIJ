package br.com.exer2;

import br.com.exer.Fatura;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by BRUNO on 04/09/2017.
 */
public class FaturaDAO {

    public List<Fatura> buscaFaturasVencidas() {

        Fatura f1 = new Fatura("eu@gmail.com", 350, LocalDate.now().minusDays(3));
        Fatura f2 = new Fatura("eu2@gmail.com", 150, LocalDate.now().minusMonths(2).minusDays(2));
        Fatura f3 = new Fatura("eu3@gmail.com", 250, LocalDate.now().minusDays(5));

        return Arrays.asList(f1,f2,f3);
    }

}
