package practica;

import javax.swing.JOptionPane;

public class Practica {

    public static void main(String[] args) {
        // ejercio1();
        // ejercio2();
        //ejercio3();
        //ejercio4();
        // ejercio5();
        //ejercio6();
        //ejercio7();
        //ejercio8();
        //ejercio9();
        ejercio10();

    }

    private static void ejercio1() {
        int numero1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        int numero2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        System.out.println("La suma es " + (numero1 + numero2));

        System.out.println("La resta es " + (numero1 - numero2));

        System.out.println("La Multiplicacion  es " + (numero1 * numero2));

        System.out.println("La division  es " + (numero1 / numero2));

        System.out.println("El modulo  es " + (numero1 % numero2));

    }

    private static void ejercio2() {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));
        if (numero1 > numero2) {

            System.out.println("EL numero mayor es es el numero1 ");
        } else if (numero1 < numero2) {
            System.out.println("EL numero mayor es  es el  numero2  ");

        } else {
            System.out.println(" Ambos son iguales ");

        }
    }

    private static void ejercio3() {

        String nombre = JOptionPane.showInputDialog("Escribe tu nombre ");

        JOptionPane.showMessageDialog(null, "  <<  Bienvenida " + nombre + " >> ");

    }

    private static void ejercio4() {

        double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el radio de la circuferencia "));
        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);

        JOptionPane.showMessageDialog(null, " El radio es  " + radioCirculo + " \n" + " El area es : " + areaCirculo);

    }

    private static void ejercio5() {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        if (numero1 % 2 == 0) {
            System.out.println("EL numero es divisibles ");
        } else {
            System.out.println("EL numero no es divisibles ");

        }

    }

    private static void ejercio6() {

        final double iva = 0.21;
        double precio;
        String elegir;
        do {
            elegir = JOptionPane.showInputDialog("quieres calcular un precio(Si/no) ");

            if (elegir.toUpperCase().equals("SI")) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("quieres el precio sin iva marcas (1) o con iva marcas  (2) "));

                switch (opcion) {

                    case 1:
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
                        JOptionPane.showMessageDialog(null, " El precio sin iva es  " + precio);
                        break;

                    case 2:

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
                        double precioConIva = precio + (precio * iva);
                        JOptionPane.showMessageDialog(null, " El precio  Con iva es: " + precioConIva);

                }

            }

        } while (elegir.toUpperCase().equals("SI"));
    }

    private static void ejercio7() {
        int numero = 100;
        int i = 1;

        while (numero >= i) {
            System.out.println(i);
            i++;

        }

    }

    private static void ejercio8() {
        int numero = 100;
        int i = 1;
        do {
            System.out.println(i);
            i++;

        } while (numero >= i);

        for (i = 1; numero >= i; i++) {

            System.out.println(i);

        }

    }

    private static void ejercio9() {

        int numero = 100;
        int numero2 = 2;
        int numero3 = 3;
        int i = 1;
        do {
            if (i % numero2 == 0) {
                System.out.println("EL numero " + i + " es divisibles con el 2 ");
            } else if (i % numero3 == 0) {
                System.out.println("EL numero " + i + " es divisibles con el 3 ");

            } else {
                System.out.println("EL numero " + i + " no es divisibles ");
            }

            i++;

        } while (numero >= i);

    }

    private static void ejercio10() {
 
        int precioDeVentas = 0;
        int i = 0;
        int cuantasVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad vetas"));
        while (cuantasVentas > i) {
            precioDeVentas += Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio de  vetas"));
            i++;
           
        }
        System.out.println("EL total de  ventas es " + (precioDeVentas));

    }
}

/* 1) Declara dos variables numéricas (con el valor que desees),
muestra por consola la suma, resta, multiplicación, 
división y módulo (resto de la división).

2) Declara 2 variables numéricas (con el valor que desees),
he indica cual es mayor de los dos. Si son iguales indicarlo también.
Ves cambiando los valores para comprobar que funciona.

3) Declara un String que contenga tu nombre, después muestra un mensaje
de bienvenida por consola. Por ejemplo: si introduzco «Fernando»,
me aparezca «Bienvenido Fernando»

4)  Haz una aplicación que calcule el área de un círculo(pi*R2). 
El radio se pedirá por teclado (recuerda pasar de String a double con 
Double.parseDouble). Usa la constante PI y el método pow de Math.

5)  Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
Si no lo es, también debemos indicarlo.

6)Lee un número por teclado que pida el precio de un producto 
(puede tener decimales) y calcule el precio final con IVA. 
El IVA sera una constante que sera del 21%.
7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
8) Haz el mismo ejercicio anterior con un bucle for.

9)Muestra los números del  1al 100 (ambos incluidos)
divisibles entre 2 y 3. Utiliza el bucle que desees.

10) Realiza una aplicación que nos pida un número de ventas a introducir,
después nos pedirá tantas ventas por teclado como número de ventas se 
hayan indicado. Al final mostrara la suma de todas las ventas.
Piensa que es lo que se repite y lo que no.

 */
