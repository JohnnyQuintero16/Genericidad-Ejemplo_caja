/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Estudiante;
import Util.Caja;
import Util.Conjunto;

/**
 *
 * @author MADARME
 */
public class ColegioConjunto {
    
    private String nombreColegio;
    private Conjunto<Estudiante> estudiantes;

    public ColegioConjunto() {
    }

    public ColegioConjunto(String nombreColegio, int cantEstudiantes) {
        this.nombreColegio = nombreColegio;
        this.estudiantes=new Conjunto(cantEstudiantes);
    }
    
     public void matricular(Estudiante nuevo) throws Exception
    {
        
        this.estudiantes.adicionarElemento(nuevo);
        
    
    }
    
    
    public boolean existeEstudiante(Estudiante nuevo)
    {
        
        return this.estudiantes.existeElemento(nuevo);
    
    }
    
    
    @Override
    public String toString()
    {
        
        
        return "Mi colegio:"+this.nombreColegio+"\n"+this.estudiantes.toString();
    }
    
    
    public String getListadoNombres()
    {
    
        String msg="**** Nombres: \n";
        for(int i=0;i<this.estudiantes.getCapacidad();i++)
        {
            msg+=this.estudiantes.get(i).getNombre()+"->";
        }
     return msg;       
    
    }
    
    public int getDondeEsta(Estudiante desconocido)
    {
        return this.estudiantes.indexOf(desconocido);
    }
    
    public void desMatricular(Estudiante x)
    {
        //Borrar un estudiante
      this.estudiantes.remover(x);
        
    }
}
