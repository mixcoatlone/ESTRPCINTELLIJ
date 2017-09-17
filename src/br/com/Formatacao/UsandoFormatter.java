package br.com.Formatacao;

import java.util.Calendar;

/**
 * Created by BRUNO on 07/09/2017.
 */
public class UsandoFormatter {

    public static void main(String[] args) {
        System.out.printf("%d\n", 26);//Exibe um inteiro decimal(base 10)
        System.out.printf("%d\n", +26);
        System.out.printf("%d\n", -26);
        System.out.printf("%o\n", 26);//Exibe um inteiro octal(base 8)
        System.out.printf("%x\n", 26);//Exibe um numero inteiro hexadecimal(base 16)
        System.out.printf("%X\n", 26);//Exibe um numero inteiro hexadecimal(base 16) em maiusculo


        /* Caracteres de conversão

        1,504582e+02. Isso significa a multiplicaçao po 10 elevando
        a segunda potencia(e+02) O e significa expoente.

        e ou E exibe um valor de ponto flutuante em notação exponencial

        f exibe um valor de ponto flutuante no formato decimal.

        g ou G exibe um valor de ponto flutuante no formato de ponto flutuante f
        ou no formato exponencial e com base na magnitude do valor.

        a ou A exibe um número de ponto flutuante no formato hexadecimal.
        */
        System.out.printf("%e\n", 12345678.9);
        System.out.printf("%f\n", 12345678.9);
        System.out.printf("%e\n", +12345678.9);
        System.out.printf("%e\n", -12345678.9);
        System.out.printf("%E\n", 12345678.9);
        System.out.printf("%g\n", 12345678.9);
        System.out.printf("%G\n", 12345678.9);


        char character = 'A';//inicializa char
        String string = "Isso também é uma string"; //Object String
        Integer integer = 12345;//inicializa inteiro (autoboxing)

        System.out.printf("%c\n", character);
        System.out.printf("%s\n", "Isso é uma string");
        System.out.printf("%s\n", string);
        System.out.printf("%S\n", string);
        System.out.printf("%s\n", integer);//chamada implicita para toString

        Calendar data = Calendar.getInstance();

        // imprimindo com caracteres de conversão para composição de
        // data/hora
        System.out.printf("%tc\n", data);
        System.out.printf("%tF\n", data);
        System.out.printf("%tD\n", data);
        System.out.printf("%tr\n", data);
        System.out.printf("%tT\n", data);


        //imprimindo com caracteres de conversão para data
        System.out.printf("%1$tA, %1$tB %1$td, %1$tY\n", data);
        System.out.printf("%1$TA, %1$TB %1$Td, %1$TY\n", data);
        System.out.printf("%1$ta, %1$tb %1$te, %1$ty\n", data);

        //imprimindo com caracteres de conversão para hora
        System.out.printf("%1$tH:%1$tM:%1$tS\n", data);
        System.out.printf("%1$tZ %1$tI:%1$tM:%1$tS ", data);


    }
}
