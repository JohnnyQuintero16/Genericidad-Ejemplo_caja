/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Util.Conjunto;

/**
 *
 * @author MADARME
 */
public class TestNuevoConjunto {

    public static void main(String[] args) {
        try {

            Conjunto<Integer> c1 = new Conjunto(3);
            Conjunto<Integer> c2 = new Conjunto(2);
            Conjunto<Integer> c3 = new Conjunto(30);

            //probar todos los métodos públicos(imprimir)
            //Recomendación: Realicen método para crear cada una de las pruebas.
            //Conjunto 1
            c1.adicionarElemento(3);
            c1.adicionarElemento(2);
            c1.adicionarElemento(4);
            //c1.adicionarElemento(5);
            //c1.adicionarElemento(6);
            //conjunto 2
            c2.adicionarElemento(3);
            c2.adicionarElemento(1);
            //c2.adicionarElemento(8);

           // System.out.println("Concatenar Normal");
           // c1.concatenar(c2);
           // imprimir(c1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
