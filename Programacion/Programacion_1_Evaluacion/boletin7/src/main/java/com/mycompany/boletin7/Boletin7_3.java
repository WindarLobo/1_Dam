package com.mycompany.boletin7;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    public void numeroSignos() {

        double elNumero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero :"));

        if (elNumero > 0) {
            System.out.println(" El resultado es : + ");
            
                } else if (elNumero < 0) {
                  System.out.println(" El resultado es : - ");
            
            
                  } else {

                       System.out.println("El resultado es :  0");
        }

    }

}
