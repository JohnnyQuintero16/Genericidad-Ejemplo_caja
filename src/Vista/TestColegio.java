/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Estudiante;
import Negocio.Colegio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MADARME
 */
public class TestColegio {
    
    public static void main(String[] args) {
        try {
            Colegio myColegio=new Colegio("UFPS-teen",4);
            //Matricular:
            
            Estudiante e1=new Estudiante(1, "madarme");
            Estudiante e2=new Estudiante(2, "juan");
            Estudiante e3=new Estudiante(3, "andres");
            Estudiante e4=new Estudiante(4, "lina");
            
            myColegio.matricular(e1);
            myColegio.matricular(e2);
            myColegio.matricular(e3);
            myColegio.matricular(e4);
            //Esto es un error:
            //myColegio.matricular(e4);
            
            System.out.println(myColegio.toString());
            
            
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
