/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.*;

/**
 *
 * @author BRUNO
 */
public class HashMapp {

    public static void main(String[] args) {

        Map mapa = new HashMap();
        //String com texto a ser verificado
        //String texto = "Bruno Michel Santos";
        //Expressão regular a ser usada

       // String pattern = "^([a-zA-ZÈ-Úè-ú]+)\\\\s";
        //String pattern = "\\S+";

        //Inicialização de RegExp Pattern
       // Pattern r = Pattern.compile(pattern);
        //Inicialização do verificador de pattern em texto
       // Matcher m = r.matcher(texto);

        //Se (matcher encontrou o regexp na string
        //if (m.find()) {
            //escreva o grupo encontrado
            // System.out.println(m.group(0));
          //  System.out.println("Bruno Michel Santos" + m.group(0));
        //} else {
            //mensagem de erro
          //  System.out.println("Você não tem mais de um nome?");
        //}

        mapa.put(1, "telefone");
        mapa.put(2, "dvd");
        mapa.put(3, "computador");
        mapa.put(4, "celular");
        mapa.put(5, "telefone");
        mapa.put(null, "televisao");
        mapa.put(7, null);

        // System.out.println(mapa.get(2));
        Collection c = mapa.values(); // valores contido em um mapa
        Iterator i = c.iterator(); // responsavel por iterar a collection

        while (i.hasNext()) { // enquanto houver proximo na lista
            System.out.println(i.next() + " ");
        }

 /*System.out.println("Utilizando o git atraves do netbeansss"
                + "- Criar um novo projeto Java;\n" +
"- Inicializar um repositório git local para o projeto Java;\n" +
"- Controlar mudanças no diretório de trabalho e index de forma visual;\n" +
"- Realizar o commit das modificações;\n" +
"- Cancelar (reverter) mudanças do diretório de trabalho e/ou Stating area;\n" +
"- Visualizar histórico de mudanças de um arquivo;\n" +
"- Clonar (baixar) um repositório do github para o repositório local, e importa-lo como um projeto no NetBeans;\n" +
"- Recuperar (pull) mudanças do repositório no github para o respositório local;\n" +
"- Notificar (push) mudanças do repositório local para o remoto no github;");
        System.out.println("novo");*/
    }

}
