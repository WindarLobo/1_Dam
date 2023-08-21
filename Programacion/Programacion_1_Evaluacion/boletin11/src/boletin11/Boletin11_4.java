package boletin11;

import javax.swing.JOptionPane;

public class Boletin11_4 {

    public void tablaDeMultiplicar() {
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
            if (numero != 0) {

                System.out.println("La tabla del " + numero);

                for (int i = 1; i <= 10; i++) {

                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
            }

        } while (numero != 0);

    }

}
