
package com.mycompany.boletinconcionales;

import javax.swing.JOptionPane;


public class Condicionales2 {

    public void asociacionDeviticultores() {

        int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio"));

        int kiloDeUva = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kilos"));

        int totalDeEuros = precio * kiloDeUva;

        String tipo = JOptionPane.showInputDialog("Introduce si es a o b  : ");

        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño 1 o 2 "));

        if (tipo.equals("a") && tamaño == 1) {
            System.out.println("El total es : " + (0.20 * kiloDeUva + totalDeEuros));
        } else if (tipo.equals("a") && tamaño == 2) {
            System.out.println("El total es : " + (0.30 * kiloDeUva + totalDeEuros));
        } else if ((tipo.equals("b ") && tamaño == 1)) {
            System.out.println("El total es : " + (0.30 * kiloDeUva - totalDeEuros));
        } else if ((tipo.equals("b") && tamaño == 2)) {
            System.out.println("El total es : " + (0.50 * kiloDeUva - totalDeEuros));
        }

    }
}

/*la asociación deviticultorestiene como política fijar un precio inicial por kilo de uva, 
el cual se clasifica en tipos (La yB), y también en tamaños (1 y 2). Cuando se realiza la venta 
del producto, este es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por 
la uva que entrega en un solo envío considerando lo siguiente: * Si es del tipo a,
Se cobran 20 céntimos al precio inicial cuando es talla 1 y 30 céntimos si es talla 2. * Si es tipoB, 
30 centavos de descuento cuando es talla 1 y 50 centavos de descuento cuando es talla 2.*/
