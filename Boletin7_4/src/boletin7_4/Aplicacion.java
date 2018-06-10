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
public class Aplicacion {

    public void reintegro(Contabanc cb) {
        cb.ingresar(25);
        cb.retirar(4);
    }

    public void arruinar(Contabanc cb) {
        cb.arruinar(cb);
    }
}
