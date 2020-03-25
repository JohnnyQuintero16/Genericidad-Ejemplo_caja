/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MADARME
 */
public class Estudiante implements Comparable{
    
    private int codigo;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        final Estudiante other = (Estudiante) o;
        
        //Siempre es una resta que va a permitir encontrar si un(os) dato(s) es menor o mayor que otro
        // 0 == iguales
        // >0 es por que el dato base es mayor que el dato other
        //<0 es por que el dato base es menor que el dato other
        //en este caso es válido por que el factor de comparación es sólo un atributo
        return (this.codigo-other.codigo);
        
    }
    
    
    
}
