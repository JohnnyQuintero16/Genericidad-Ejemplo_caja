/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author MADARME
 */
public class Caja<T> {
    
    private T objeto;

    public Caja() {
    }

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "Caja{" + "objeto=" + objeto + '}'+",Este objeto es de tipo:"+this.objeto.getClass().getName()+"\n";
    }
    
    
}
