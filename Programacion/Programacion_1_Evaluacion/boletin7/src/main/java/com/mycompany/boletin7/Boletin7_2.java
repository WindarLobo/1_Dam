package com.mycompany.boletin7;

import javax.swing.JOptionPane;

public class Boletin7_2 {

    public void mayorNumero() {

        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));

        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));

        if (primerNumero >= segundoNumero) {
            System.out.println("La resta es : " + (primerNumero - segundoNumero));

        } else {
            System.out.println("La suma es : " + (primerNumero + segundoNumero));
        }
    }
}
