
package com.windar.datos;


import javax.swing.JOptionPane;

public class PedirDatos {
    public static String pedirString (String mensaje){
        return  JOptionPane.showInputDialog(mensaje);
        
    }
    public static int pedirInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static float pedirfloat(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }

   
        
    }

    

