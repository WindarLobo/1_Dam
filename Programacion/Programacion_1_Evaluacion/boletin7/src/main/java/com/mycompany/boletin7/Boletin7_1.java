package com.mycompany.boletin7;

import javax.swing.JOptionPane;

public class Boletin7_1 {

    public void numeroPositivo() {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));

        if (numero1 > 0) {
            System.out.println("Es posito");
        } 
               else {
               System.out.println("Es negativo");
        }

    }
}
