/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplovariablesauxiliares;

/**
 *
 * @author dam1
 */
public class Metodos {

    public void calcularParesImpares() {

        int i = 1, acPar = 0, sw = 0;
        int acImpar = 1;

        while (i <= 10) {
            if (sw != 0) {
                acPar = acPar + i;
                sw = 0;

            } else {
                acImpar = acImpar * i;
                sw = 1;

            }
            i++;
        }

        System.out.println("LA suma es = " + acPar);
        System.out.println("Productos es = " + acImpar);

    }
}
