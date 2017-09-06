package br.com.exer2;

import br.com.exer.Fatura;

import java.util.List;

/**
 * Created by BRUNO on 04/09/2017.
 */
public class ExecFaturaDAO {

    static class EnviadorEmail {

        public void enviar(String to, String text){
            System.out.printf("Enviando email para: %s. O Texto: %s\n", to, text);
        }

    }


    public static void main(String[] args) {

        List<Fatura> faturasVencidas = new FaturaDAO().buscaFaturasVencidas();

        EnviadorEmail envia = new EnviadorEmail();

        /*for (Fatura f: faturasVencidas) {
            envia.enviar(f.getEmailDevedor(),f.resumo());
        }*/

        faturasVencidas.forEach(fatura -> {
            envia.enviar(fatura.getEmailDevedor(), fatura.resumo());
            fatura.setNotificacaoEnviada(true);

        });
    }
}
