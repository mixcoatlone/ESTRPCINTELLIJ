/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git;

/**
 *
 * @author BRUNO
 */
public class Fora {

    private String n = "Teste";
    
    Dentro d = new Fora().new Dentro();//atributo da classe externa
    
    public void acessarInterna() {
        
        //Dentro d = new Dentro();// primeira maneira
        //d.acessarExterna();// primeira maneira
    }

    class Dentro {
        public void acessarExterna() {
            System.out.println("Valor do atributo n: " + n);

        }
    }

    public static void main(String[] args) {
        Fora.Dentro f = new Fora().new Dentro();//segunda maneira
        
        //Fora ff = new Fora();
        
       // ff.d.acessarExterna();
        //Fora ff = new Fora();        
        //Fora.Dentro fd = ff.new Dentro();//terceira maneira
        //Fora f = new Fora();// primeira maneira
       
        //f.acessarInterna();// primeira maneira
        f.acessarExterna();// segunda maneira
    }

}
