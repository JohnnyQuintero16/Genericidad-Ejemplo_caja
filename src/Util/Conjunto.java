/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 * Clase contenedora: Cada uno de sus elementos con cajas parametrizadas
 * Conjunto es una estructura da datos estática
 *
 * @author MADARME
 * @param <T>
 */
public class Conjunto<T> {

    //Estructura de datos estática
    private Caja<T>[] cajas;
    private int i = 0;

    public Conjunto() {
    }

    public Conjunto(int cantidadCajas) {
        if (cantidadCajas <= 0) {
            throw new RuntimeException("No se pueden crear el Conjunto");
        }

        this.cajas = new Caja[cantidadCajas];
    }

    public void adicionarElemento(T nuevo) throws Exception {
        if (i >= this.cajas.length) {
            throw new Exception("No hay espacio en el Conjunto");
        }

        if (this.existeElemento(nuevo)) {
            throw new Exception("No se puede realizar inserción, elemento repetido");
        }

        this.cajas[i] = new Caja(nuevo);
        this.i++;

    }

    public T get(int indice) {
        if (indice < 0 || indice >= this.getLength()) {
            throw new RuntimeException("Índice fuera de rango");
        }
        return this.cajas[indice].getObjeto();

    }

    public int indexOf(T objBuscar) {

        for (int j = 0; j < i; j++) {

            //Sacando el estudiante de la caja:
            T x = this.cajas[j].getObjeto();

            if (x.equals(objBuscar)) {
                return j;
            }
        }

        return -1;

    }

    public void set(int indice, T nuevo) {
        if (indice < 0 || indice >= this.getLength()) {
            throw new RuntimeException("Índice fuera de rango");
        }
        this.cajas[indice].setObjeto(nuevo);

    }

    public boolean existeElemento(T nuevo) {

        //Sólo estoy comparando por los estudiantes matriculados
        for (int j = 0; j < i; j++) {

            //Sacando el estudiante de la caja:
            T x = this.cajas[j].getObjeto();

            if (x.equals(nuevo)) {
                return true;
            }
        }

        return false;

    }

    /**
     * para el grupo A--> Selección para el grupo C--> Inserción
     *
     */
    public void ordenar() {
        // :)
    }



    /**
     * Realiza el ordenamiento por burbuja
     */
    public void ordenarBurbuja() {

    }

    /**
     * Elimina un elemento del conjunto y compacta
     *
     * @param objBorrado es el objeto que deseo eliminar
     */

    public void remover(T objBorrado) {
      int Buscar = this.indexOf(objBorrado);
        
        for (int j = Buscar; j < this.getCapacidad()-1; j++) {
          
            this.cajas[j] = this.cajas[j+1];
           
        }
       
       
    }
    /**
     * El método adiciona todos los elementos de nuevo en el conjunto
     * original(this) y el nuevo queda vacío. En este proceso no se toma en
     * cuenta los datos repetidos Ejemplo: conjunto1=<1,2,3,5,6> y
     * conjunto2=<9,1,8>
     * conjunto1.concatenar(conjunto2) da como resultado:
     * conjunto1=<1,2,3,5,6,9,1,8> y conjunto2=null
     *
     * @param nuevo el objeto conjunto a ser colocado en el conjunto original
     */
    public void concatenar(Conjunto<T> nuevo) {

    }

    /**
     * El método adiciona todos los elementos de nuevo en el conjunto
     * original(this) y el nuevo queda vacío. En este proceso SI toma en cuenta
     * los datos repetidos Ejemplo: conjunto1=<1,2,3,5,6> y conjunto2=<9,1,8>
     * conjunto1.concatenar(conjunto2) da como resultado:
     * conjunto1=<1,2,3,5,6,9,8> y conjunto2=null
     *
     * @param nuevo el objeto conjunto a ser colocado en el conjunto original
     */
    public void concatenarRestrictivo(Conjunto<T> nuevo) {

    }

    public void removeAll() {
        this.cajas = null;
        this.i = 0;
    }

    @Override
    public String toString() {
        String msg = "******** CONJUNTO*********\n";
        for (Caja c : cajas) {
            if (c != null) {
                msg += c.getObjeto().toString() + " ";
            }
        }
        msg += "\n";
        return msg;
    }

    /**
     * Obtiene la cantidad de elementos almacenados
     *
     * @return retorna un entero con la cantidad de elementos
     */
    public int getCapacidad() {
        return this.i;
    }

    /**
     * Obtiene el tamaño máximo de cajas dentro del Conjunto
     *
     * @return int con la cantidad de cajas
     */
    public int getLength() {
        return this.cajas.length;
    }

}
