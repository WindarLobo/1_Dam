/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11;

import javax.swing.JOptionPane;

public class Boletin11_1 {

    public void cantidadNumero() {

        int numeroPositivo = 0;
        int numeroNegativo = 0;
        int numeroCero = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca  un numero");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

            if (numero > 0) {
                System.out.println("El numero  " + numero + " es positivo");
                numeroPositivo++;
            }
            
            if (numero < 0) {
                System.out.println("El numero " + numero + " es negativo");
                numeroNegativo++;
            }

            if (numero == 0) {
                System.out.println("El numero " + numero + " es cero");
                numeroCero++;
            }
            
            System.out.println("cantida de nuemro positivos :  " + numeroPositivo);
            System.out.println("cantida de nuemro negativo:  " + numeroNegativo);
            System.out.println("cantida de nuemro cero :  " + numeroCero);
        }
            System.out.println("Saliendo del bucle");
    }

}
 