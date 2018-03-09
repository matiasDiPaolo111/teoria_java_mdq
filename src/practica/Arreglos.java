/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author PC-MATT
 */
public class Arreglos {
    
    public ArrayList<String> arregloCaracteres = new ArrayList<>();
    
    public void ingresarDatos(){
    arregloCaracteres.add("elemento 1");
    arregloCaracteres.add("elemento 2");
    arregloCaracteres.add("elemento 3");
    arregloCaracteres.add("elemento 4");
    arregloCaracteres.add("elemento 5");    
    }
    public void recorrerDatos(){
    
        for(int i=0; i<arregloCaracteres.size();i=i+1){
           String cadena = arregloCaracteres.get(i);
        }
        
    } 
}
