package com.mycompany.boletin8;

import javax.swing.JOptionPane;

public class Boletin8_1 {

    public void ventasAnuales() {
        int ventas = Integer.parseInt(JOptionPane.showInputDialog(" *********** Bienvenido al Froiz ************  \n" + "introduce el numero para verificar las  ventas anuales"));

        int baixo = 100;
        int medio = 500;
        int alto = 1000;

        if (ventas <= baixo) {
            System.out.println("El  consumo  de ventas de productos de leche es baja ");

        } else if (ventas > baixo && ventas <= medio) {
            System.out.println("Ventas de productos   medio ");

        } else if (ventas > medio && ventas <= alto) {
            System.out.println(" Ventas de productos alto");

        } else if (ventas > 1000) {
            System.out.println("Primera necesidades es muy alto");
        }

    }
}
