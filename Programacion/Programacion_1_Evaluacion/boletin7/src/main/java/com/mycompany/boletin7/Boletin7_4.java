package com.mycompany.boletin7;

import javax.swing.JOptionPane;

public class Boletin7_4 {

    public void elResultadoPeso() {

        System.out.println(" ****** Bienvenido a Dietflash ******");

        float pesoWindar = Float.parseFloat(JOptionPane.showInputDialog(" Hola  Windar cuanto pesas?"));

        float pesoAdrian = Float.parseFloat(JOptionPane.showInputDialog("Hola Adrian  cuanto pesas? "));

        float diferenciaDePeso = Math.round(pesoWindar - pesoAdrian);

        if (pesoWindar > pesoAdrian) {
            System.out.println(" Windar estas gordita =D");
            System.out.println("\n La direncia  es : " + Math.abs(diferenciaDePeso) + " kg ");
            
        } 
        
                       else {
                          System.out.println(" Adrian  estas gordita tienes que cerrar el pico  =D ");
                          System.out.println("\n La direncia  es : " + Math.abs(diferenciaDePeso) + " kg ");
        }

        
            
        }

    }


