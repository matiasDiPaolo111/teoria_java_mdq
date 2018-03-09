/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teorico;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Real;
import java.util.ArrayList;

/**
 *
 * @author PC-MATT
 */
public class TeoriaEstructuraDeDatos {
   // visibilidad tipo nombre
    public int entero=10;

    public int getEntero() {
        return entero;
              
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public String getCadenaDeCaracteres() {
        return cadenaDeCaracteres;
    }

    public void setCadenaDeCaracteres(String cadenaDeCaracteres) {
        this.cadenaDeCaracteres = cadenaDeCaracteres;
    }

    public boolean isLogico() {
        return logico;
    }

    public void setLogico(boolean logico) {
        this.logico = logico;
    }

    public ArrayList<String> getArregloDeCadenas() {
        return ArregloDeCadenas;
    }

    public void setArregloDeCadenas(ArrayList<String> ArregloDeCadenas) {
        this.ArregloDeCadenas = ArregloDeCadenas;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }
    public double real=19.3;
    public String cadenaDeCaracteres ="Hola";
    public boolean logico = true; 
    
    ArrayList<String> ArregloDeCadenas = new ArrayList<String>();
    String[ ] nombre = new String[2];
    
   
    
}
