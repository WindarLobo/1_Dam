package javaapplication5;


import javax.swing.*;
import java.util.Scanner;

public class Bucles {
    public void conWhile() {
        // Escribe un programa que sume cinco numeros enteros.

        int i = 0, num,suma = 0;
      
        System.out.println("Introduzca un numero");
        while (i < 5) {
             num = pedirEntero();
            suma += num;
            i++;
        }
        System.out.println("suma = " + suma);
    }

    public static int pedirEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void conDoWhile() {
        
             JOptionPane.showInputDialog("introduzca un numero");
         int i = 0, numero, suma = 0;
        do {
            numero = leerEntero();
            suma += numero;
            i++;
        } while (i < 5);

        JOptionPane.showMessageDialog(null, "suma = " + suma);

    }

    public static int leerEntero() {
        return Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
    }

    public void conFor() {
        JOptionPane.showInputDialog("introduzca un numero");
        int numero = 0, suma = 0;
        for (int i = 0; i < 5; i++) {
            numero = introducirEntero();
            suma += numero;

        }

        JOptionPane.showMessageDialog(null, "suma = " + suma);

    }

    public static int introducirEntero() {
        return Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));

    }
    
}
