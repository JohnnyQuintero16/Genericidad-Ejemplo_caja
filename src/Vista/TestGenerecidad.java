/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Util.Caja;

/**
 *
 * @author MADARME
 */
public class TestGenerecidad {
    
    public static void main(String[] args) {
        
        Casa cas1=new Casa("guimaral", (short)4);
        Estudiante es1=new Estudiante(152020, "Pepe");
        String msg="Bienvenidos a la clase de genericidad";
        Integer numero=13245;
        Estudiante es2=new Estudiante(152021, "Pepe");
        Estudiante es3=new Estudiante(152021, "Pepe");
        
        
        
        imprimir(cas1);
        imprimir(es1);
        imprimir(msg);
        imprimir(numero);
        
        //Esto produce un error:
        
        //sonIguales(cas1, es1);
        
        sonIguales(es1, es2);
        sonIguales(es3, es2);
        
        
        sonIguales(4,4);
        sonIguales("madarme","nadarme");
        
        comparar(es1, es2);
        comparar(es3, es2);
        
        
        comparar(4,4);
        comparar("madarme","nadarme");
        
        // Esto es un error:
        //comparar(4,"madarme");
        
        
        //Con cajas:
        
        Caja<Estudiante> c1=new Caja(es1);
        Caja<String> c2=new Caja(msg);
        Caja<Integer> c3=new Caja(1234);
        Caja<Casa> c4=new Caja(cas1);
        
        imprimirUnaCaja(c1);
        imprimirUnaCaja(c2);
        imprimirUnaCaja(c3);
        imprimirUnaCaja(c4);
        
        
        Caja []vectorCajas=new Caja[4];
        vectorCajas[0]=c1;
        vectorCajas[1]=c2;
        vectorCajas[2]=c3;
        vectorCajas[3]=c4;
        
        System.out.println("\n\nImprimiendo cajas almacenadas en un  vector");
        for(Caja c:vectorCajas)
            System.out.println(c.toString());
        
        
   }
   
    
    
    public static void imprimirUnaCaja(Caja c)
    {
        System.out.println("\n\nImprimiendo cajas:");
        System.out.println(c.toString());
    }
    
    public static <T> void imprimir(T objetoDesconocido)
    {
        System.out.println(objetoDesconocido.toString());
        
    }
    
    
    public static <T> void sonIguales(T obj1, T obj2)
    {
        if(obj1.equals(obj2))
            System.out.println("Son iguales los objetos");
        else
            System.out.println("No son iguales los objetos");
        
        System.out.println("El objeto es de tipo:"+obj1.getClass().getName()); 
    
    }
    
    
    public static <T> void comparar(T obj1, T obj2)
    {
        
        System.out.println("\n\n Comparando objetos:");
        int comparacion=((Comparable)obj1).compareTo(obj2);
        
        if(comparacion==0)
            System.out.println("Obj1 es igual a Obj2");
        else
            if(comparacion <0)
                System.out.println("Obj1 < Obj2");
             else
                System.out.println("Obj1 > Obj2");
        
        System.out.println("El objeto es de tipo:"+obj1.getClass().getName()); 
    
    }
    
    
}
