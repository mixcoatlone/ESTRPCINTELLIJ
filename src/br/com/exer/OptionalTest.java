package br.com.exer;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Created by BRUNO on 06/09/2017.
 */
public class OptionalTest {

    public static void main(String[] args) {
        Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));

        //Tipo uma caixa que colocamos algo dentro, guardar...
        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);

        //se tiver alguma coisa dentro do método, execute e passe o bigDecimal
        seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);

        //System.out.println();

        //cria um Optional sem nada dentro
        //Optional<Seguro> seguroOptionalVazio = Optional.ofNullable(null);
    }

}
