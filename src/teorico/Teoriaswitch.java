/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico;

/**
 *
 * @author PC-MATT
 */
public class Teoriaswitch {
    
    
    public void meses(){
           int mes = 1; // mes enero
        String nombreDeMes;
        switch (mes) {
            case 1:  nombreDeMes = "Enero";
                     break;
            case 2:  nombreDeMes = "Febrero";
                     break;            
            default: nombreDeMes = "No es un mes valido";
                     break;
        }
        
    }
      
}
