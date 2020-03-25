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
public class Casa {
    
    private String direccion;
    private short cant_pisos;

    public Casa() {
    }

    public Casa(String direccion, short cant_pisos) {
        this.direccion = direccion;
        this.cant_pisos = cant_pisos;
    }

    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getCant_pisos() {
        return cant_pisos;
    }

    public void setCant_pisos(short cant_pisos) {
        this.cant_pisos = cant_pisos;
    }

    @Override
    public String toString() {
        return "Casa{" + "direccion=" + direccion + ", cant_pisos=" + cant_pisos + '}';
    }
    
    
    
}
