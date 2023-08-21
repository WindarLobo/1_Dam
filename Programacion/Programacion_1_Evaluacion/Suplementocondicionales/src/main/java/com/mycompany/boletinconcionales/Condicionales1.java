
package com.mycompany.boletinconcionales;

import javax.swing.JOptionPane;

public class Condicionales1 {


    public void aplicacionEntero() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        if (numero >= 0 && numero < 10){
            System.out.println("Es una cifra");
        } 
        else if (numero>= 10 && numero < 100){
            System.out.println("Es dos cifra");
        }
        else if (numero >= 100 && numero < 1000){
            System.out.println("Es tres cifras");
        } 
        else if (numero >= 1000 && numero < 10000){
            System.out.println("Es cuatro cifras");
        } 
        else if (numero>=10000 && numero<100000){
            System.out.println("Cinco cifra");
        }
        

    }
}
/* Escribe unha aplicaciónque indique cantas  cifras ten un número enteiro comprendido entre 0 e 99999*/

    
