package com.mycompany.boletin8;

import javax.swing.JOptionPane;

public class Boletin8_2 {

    public void CalcualSuperficieFigura() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(" *********** Bienvenido a distintas figura ************  \n" + " introduce una opcion deseada \n1.Cuadrado \n2.- Triangulo \n3.-Circulo "));

        switch (numero) {

            case 1:

                double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el lado "));

                Cuadrado obx1 = new Cuadrado(lado);

                double superficie1 = obx1.getSuperficie1();

                System.out.println("La superficie del cuadrado es :" + superficie1);

                break;

            case 2:

                double base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));

                Triangulo obx2 = new Triangulo(base, altura);

                double superficie2 = obx2.getSuperficie2();

                System.out.println("La superficie del triangulo :" + superficie2);

                break;

            case 3:
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio "));

                Circulo obx3 = new Circulo(radio);

                double superficie3 = obx3.getSuperficie3();

                System.out.println("La superficie del cuadrado es :" + superficie3);

                break;

            default:
                System.out.println("Error");
                break;
        }
    }

}
