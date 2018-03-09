/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico;

import java.util.ArrayList;

/**
 *
 * @author PC-MATT
 */
public class Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       ArrayList<String> arregloCaracteres = new ArrayList<>();
    
   
    arregloCaracteres.add("elemento 1");
    arregloCaracteres.add("elemento 2");
    arregloCaracteres.add("elemento 3");
    arregloCaracteres.add("elemento 4");
    arregloCaracteres.add("elemento 5");    
   
        for(int i=0; i<arregloCaracteres.size();i=i+1){
           String cadena = arregloCaracteres.get(i);
     
        System.out.println(cadena+ "   --Posicion: " + i +" de:" +arregloCaracteres.size());
    }
     }
}
