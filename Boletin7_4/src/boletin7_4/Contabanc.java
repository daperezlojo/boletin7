/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

/**
 *
 * @author Damian
 */
public class Contabanc {

    String numConta;
    String titular;
    Float saldo;

    public Contabanc() {
    }

    public Contabanc(String nc, String t, float s) {
        numConta = nc;
        titular = t;
        saldo = s;
    }

    public void setnc(String nc) {
        numConta = nc;
    }

    public void sett(String t) {
        titular = t;
    }

    public void sets(float s) {
        saldo = s;
    }

    public String getnc() {
        return numConta;
    }

    public String gett() {
        return titular;
    }

    public float gets() {
        return saldo;
    }

    public void ingresar(float i) {
        saldo = saldo + i;
    }

    public void retirar(float r) {
        if (saldo > r) {
            saldo = saldo - r;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void arruinar(Contabanc c) {
        saldo = 0f;
        numConta = null;
        titular = null;
    }
}
