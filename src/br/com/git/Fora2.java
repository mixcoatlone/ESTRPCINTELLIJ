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
public class Fora2 {

    private int a = 2;

    public String toString() {
        return "Classe externa A";
    }

    class B {

        public void acessarReferencia() {
            System.out.println("Interna: " + this);
            System.out.println("Externa: " + Fora2.this.toString());
        }

        public String toString() {
            return "Classe Interna B";
        }
    }

    public static void main(String[] args) {
        Fora2.B ab = new Fora2().new B();

        ab.acessarReferencia();
    }
}
