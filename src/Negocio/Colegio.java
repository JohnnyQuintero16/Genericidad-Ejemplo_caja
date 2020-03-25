/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Estudiante;
import Util.Caja;

/**
 *
 * @author MADARME
 */
public class Colegio {
    
    private String nombre;
    private Caja<Estudiante> estudiantes[];
    private int i=0;

    public Colegio() {
    }

    public Colegio(String nombre, int cantEstudiantes) throws Exception{
        
        if(cantEstudiantes <=0)
            throw new Exception("No se pueden crear espacios para los estudiantes");
        
        this.nombre = nombre;
        this.estudiantes=new Caja[cantEstudiantes];
        
    }

    
    public void matricular(Estudiante nuevo) throws Exception
    {
        if(i>=this.estudiantes.length)
            throw new Exception("No hay espacios para matricular estudiantes");
        
        if(this.existeEstudiante(nuevo))
            throw new Exception("No se puede matricular , su código está repetido");
        
        
        this.estudiantes[i]=new Caja(nuevo);
        this.i++;
    
    }
    
    
    private boolean existeEstudiante(Estudiante nuevo)
    {
        
        //Sólo estoy comparando por los estudiantes matriculados
        for(int j=0;j<i;j++)
        {
            
            //Sacando el estudiante de la caja:
            Estudiante x= this.estudiantes[j].getObjeto();
            
            if(x.equals(nuevo))
                return true;
        }
        
        return false;
    
    }
    
    public int getCantidadMatriculados()
    {
        return this.i;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caja<Estudiante>[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Caja<Estudiante>[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        String msg="******** Nombre Colegio:"+this.nombre+"*********\n";
        
        for(Caja c:this.estudiantes)
            msg+=c.getObjeto().toString()+"\n";
        
        return msg;
    }
    
    
    
    
}
